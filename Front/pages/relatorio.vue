<script setup lang="ts">
import { ref, computed } from 'vue'
import * as XLSX from 'xlsx'
import { jsPDF } from 'jspdf'

// Dados de funcionários
const funcionarios = ref([
  { id: 1, nome: 'Funcionario A', cpf: '123456789', empresa: 'Empresa A', funcao: 'Developer', email: 'a@empresa.com', entrada: '08:00', saida: '17:00', diaTrabalhado: '2025-03-11', selecionado: false },
  { id: 2, nome: 'Funcionario B', cpf: '987654321', empresa: 'Empresa B', funcao: 'Manager', email: 'b@empresa.com', entrada: '09:00', saida: '18:00', diaTrabalhado: '2025-03-10', selecionado: false },
  { id: 3, nome: 'Funcionario C', cpf: '192837465', empresa: 'Empresa C', funcao: 'Designer', email: 'c@empresa.com', entrada: '07:00', saida: '16:00', diaTrabalhado: '2025-03-09', selecionado: false },
])

// Controle do filtro
const filtroAtivo = ref(false) // Para exibir ou ocultar o menu de filtros
const filtrosSelecionados = ref<{ [key: string]: boolean }>({
  nome: true,
  funcao: false,
  empresa: false,
  cpf: false,
})
const termoPesquisa = ref('')

// Computed para filtrar os funcionários com base nos filtros selecionados
const funcionariosFiltrados = computed(() => {
  return funcionarios.value.filter(f => {
    if (!termoPesquisa.value) return true

    return (
      (filtrosSelecionados.value.nome && f.nome.toLowerCase().includes(termoPesquisa.value.toLowerCase())) ||
      (filtrosSelecionados.value.funcao && f.funcao.toLowerCase().includes(termoPesquisa.value.toLowerCase())) ||
      (filtrosSelecionados.value.empresa && f.empresa.toLowerCase().includes(termoPesquisa.value.toLowerCase())) ||
      (filtrosSelecionados.value.cpf && f.cpf.includes(termoPesquisa.value))
    )
  })
})

// Computed para obter os funcionários selecionados para exportação
const funcionariosSelecionados = computed(() => {
  return funcionariosFiltrados.value.filter(f => f.selecionado)
})

// Funções de exportação (Excel e PDF)
const exportToExcel = () => {
  if (funcionariosSelecionados.value.length === 0) {
    alert('Selecione pelo menos um funcionário para exportar!')
    return
  }
  const ws = XLSX.utils.json_to_sheet(funcionariosSelecionados.value)
  const wb = XLSX.utils.book_new()
  XLSX.utils.book_append_sheet(wb, ws, 'Funcionarios')
  XLSX.writeFile(wb, 'relatorio_funcionarios.xlsx')
}

const exportToPDF = () => {
  if (funcionariosSelecionados.value.length === 0) {
    alert('Selecione pelo menos um funcionário para exportar!')
    return
  }

  const doc = new jsPDF()
  doc.setFontSize(12)
  doc.text('Relatório de Funcionários', 14, 20)

  const headers = ['Nome', 'CPF', 'Empresa', 'Função', 'E-mail', 'Entrada', 'Saída', 'Dia Trabalhado']
  let y = 30
  headers.forEach((header, i) => {
    doc.text(header, 14 + i * 30, y)
  })

  funcionariosSelecionados.value.forEach((f, i) => {
    y += 10
    doc.text(f.nome, 14, y)
    doc.text(f.cpf, 44, y)
    doc.text(f.empresa, 74, y)
    doc.text(f.funcao, 104, y)
    doc.text(f.email, 134, y)
    doc.text(f.entrada, 164, y)
    doc.text(f.saida, 194, y)
    doc.text(f.diaTrabalhado, 224, y)
  })

  doc.save('relatorio_funcionarios.pdf')
}
</script>

<template>
  <div class="ml-16 lg:ml-48 p-4 flex flex-col space-y-6">
    <div class="flex justify-between items-center">
      <h2 class="text-xl font-bold">Relatório de Funcionários</h2>

      <!-- Botão de Filtragem -->
      <div class="relative">
        <button 
          @click="filtroAtivo = !filtroAtivo" 
          class="p-2 bg-gray-200 rounded-full hover:bg-gray-300 transition-all"
        >
          <Icon name="mdi:filter" class="w-6 h-5" />
        </button>

        <!-- Menu de Filtros -->
        <div 
          v-if="filtroAtivo" 
          class="absolute right-0 mt-2 w-48 bg-white border border-gray-300 shadow-lg rounded-lg p-4"
        >
          <p class="text-sm font-bold mb-2">Filtrar por:</p>
          <div class="space-y-2">
            <label class="flex items-center space-x-2">
              <input type="checkbox" v-model="filtrosSelecionados.nome" />
              <span>Nome</span>
            </label>
            <label class="flex items-center space-x-2">
              <input type="checkbox" v-model="filtrosSelecionados.funcao" />
              <span>Função</span>
            </label>
            <label class="flex items-center space-x-2">
              <input type="checkbox" v-model="filtrosSelecionados.empresa" />
              <span>Empresa</span>
            </label>
            <label class="flex items-center space-x-2">
              <input type="checkbox" v-model="filtrosSelecionados.cpf" />
              <span>CPF</span>
            </label>
          </div>
        </div>
      </div>
    </div>

    <!-- Campo de Pesquisa -->
    <input
      v-if="Object.values(filtrosSelecionados).some(v => v)"
      v-model="termoPesquisa"
      type="text"
      placeholder="Digite para filtrar"
      class="p-2 rounded-lg border border-gray-300 shadow-md w-full"
    />

    <!-- Tabela -->
    <div class="overflow-x-auto bg-white rounded-lg shadow-md">
      <table class="min-w-full table-auto border-collapse">
        <thead class="bg-gray-200">
          <tr>
            <th class="border px-4 py-2 text-center">✔</th>
            <th class="border px-4 py-2 text-left">Nome</th>
            <th class="border px-4 py-2 text-left">CPF</th>
            <th class="border px-4 py-2 text-left">Empresa</th>
            <th class="border px-4 py-2 text-left">Função</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="f in funcionariosFiltrados" :key="f.id">
            <td class="border px-4 py-2 text-center">
              <input type="checkbox" v-model="f.selecionado" class="scale-150" />
            </td>
            <td class="border px-4 py-2">{{ f.nome }}</td>
            <td class="border px-4 py-2">{{ f.cpf }}</td>
            <td class="border px-4 py-2">{{ f.empresa }}</td>
            <td class="border px-4 py-2">{{ f.funcao }}</td>
          </tr>
        </tbody>
      </table>
    </div>

    <!-- Botões de Exportação (Abaixo da Tabela) -->
    <div class="flex justify-end space-x-4 mt-4">
      <button 
        @click="exportToPDF" 
        class="p-2 bg-blue-600 text-white rounded-lg hover:bg-blue-700 transition-all"
      >
        Exportar para PDF
      </button>
      <button 
        @click="exportToExcel" 
        class="p-2 bg-green-600 text-white rounded-lg hover:bg-green-700 transition-all"
      >
        Exportar para Excel
      </button>
    </div>
  </div>
</template>
