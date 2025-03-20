<script setup lang="ts">
import { ref } from 'vue'

const tipoCadastro = ref('')
const empresa = ref({ cnpj: '', nome: '', endereco: '' })
const funcionario = ref({ nome: '', cpf: '', empresa: '', cargaHoraria: '', funcao: '', email: '', foto: null })

const salvarCadastro = () => {
  console.log('Cadastro salvo:', tipoCadastro.value === 'empresa' ? empresa.value : funcionario.value)
}

const handleFileUpload = (event) => {
  const file = event.target.files[0]
  funcionario.value.foto = file
  console.log('Arquivo selecionado:', file)
}

const voltar = () => {
  tipoCadastro.value = ''
}
</script>

<template>
  <div class="flex flex-col items-center justify-center min-h-screen bg-gray-100 p-6">
    
    <!-- Escolha entre Empresa ou Funcionário -->
    <div v-if="!tipoCadastro" class="flex flex-col items-center">
      <h2 class="text-xl font-bold mb-4">O que deseja cadastrar?</h2>
      <button @click="tipoCadastro = 'empresa'" class="px-4 py-2 bg-blue-500 text-white rounded-lg mb-2 w-full">Empresa</button>
      <button @click="tipoCadastro = 'funcionario'" class="px-4 py-2 bg-lightblue-500 text-white rounded-lg w-full">Funcionário</button>
    </div>

    <!-- Formulário de Empresa -->
    <div v-if="tipoCadastro === 'empresa'" class="w-full max-w-md bg-white p-6 rounded-lg shadow-lg">
      <h2 class="text-lg font-bold text-center mb-4">Cadastro de Empresa</h2>
      <div class="flex flex-col gap-4">
        <label class="flex flex-col text-center">
          <span class="font-bold">CNPJ</span>
          <input v-model="empresa.cnpj" type="text" class="border p-2 rounded-lg" />
        </label>
        <label class="flex flex-col text-center">
          <span class="font-bold">Nome</span>
          <input v-model="empresa.nome" type="text" class="border p-2 rounded-lg" />
        </label>
        <label class="flex flex-col text-center">
          <span class="font-bold">Endereço</span>
          <input v-model="empresa.endereco" type="text" class="border p-2 rounded-lg" />
        </label>
      </div>
      <button @click="salvarCadastro" class="mt-4 w-full px-4 py-2 bg-blue-500 text-white rounded-lg">Salvar</button>
      <button @click="voltar" class="mt-2 w-full px-4 py-2 bg-gray-500 text-white rounded-lg">Voltar</button>
    </div>

    <!-- Formulário de Funcionário -->
    <div v-if="tipoCadastro === 'funcionario'" class="w-full max-w-md bg-white p-6 rounded-lg shadow-lg">
      <h2 class="text-lg font-bold text-center mb-4">Cadastro de Funcionário</h2>
      <div class="flex flex-col gap-4">
        <!-- Primeira parte do formulário -->
        <div class="flex flex-col gap-4">
          <label class="flex flex-col text-center">
            <span class="font-bold">Nome</span>
            <input v-model="funcionario.nome" type="text" class="border p-2 rounded-lg" />
          </label>
          <label class="flex flex-col text-center">
            <span class="font-bold">CPF</span>
            <input v-model="funcionario.cpf" type="text" class="border p-2 rounded-lg" />
          </label>
          <label class="flex flex-col text-center">
            <span class="font-bold">Empresa</span>
            <input v-model="funcionario.empresa" type="text" class="border p-2 rounded-lg" />
          </label>
          <label class="flex flex-col text-center">
            <span class="font-bold">Carga Horária</span>
            <input v-model="funcionario.cargaHoraria" type="text" class="border p-2 rounded-lg" />
          </label>
        </div>

        <!-- Segunda parte do formulário -->
        <div class="flex flex-col gap-4">
          <label class="flex flex-col text-center">
            <span class="font-bold">Função</span>
            <input v-model="funcionario.funcao" type="text" class="border p-2 rounded-lg" />
          </label>
          <label class="flex flex-col text-center">
            <span class="font-bold">Email</span>
            <input v-model="funcionario.email" type="email" class="border p-2 rounded-lg" />
          </label>
          <label class="flex flex-col text-center">
            <span class="font-bold">Foto</span>
            <input type="file" class="border p-2 rounded-lg" @change="handleFileUpload" />
          </label>
        </div>
      </div>
      <button @click="salvarCadastro" class="mt-4 w-full px-4 py-2 bg-lightblue-500 text-white rounded-lg">Salvar</button>
      <button @click="voltar" class="mt-2 w-full px-4 py-2 bg-gray-500 text-white rounded-lg">Voltar</button>
    </div>

  </div>
</template>

<style scoped>
.bg-lightblue-500 {
  background-color: #63b3ed;
}
</style>
