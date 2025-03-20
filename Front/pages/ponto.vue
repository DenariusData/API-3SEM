<script setup lang="ts">
import { object, string, date, type InferType } from 'yup'
import type { FormSubmitEvent } from '#ui/types'

useHead({
    title: 'Registro de Ponto',
})

// Esquema de validação para registro de ponto
const workSchema = object({
    date: date().required('Escolha uma data válida'),
    startTime: string().required('Horário de entrada obrigatório'),
    endTime: string().required('Horário de saída obrigatório'),
    company: string().required('Selecione a empresa'),
    employee: string().required('Selecione o funcionário'),
    notes: string().optional()
})

type WorkSchema = InferType<typeof workSchema>

const workState = reactive({
    date: undefined,
    startTime: undefined,
    endTime: undefined,
    company: undefined,
    employee: undefined,
    notes: undefined
})

const companies = ref([
    { label: 'Empresa A', value: 'empresa_a' },
    { label: 'Empresa B', value: 'empresa_b' }
])

const employees = ref([
    { label: 'Funcionário 1', value: 'funcionario_1' },
    { label: 'Funcionário 2', value: 'funcionario_2' }
])

async function onSubmit(event: FormSubmitEvent<WorkSchema>) {
    console.log('Dados do trabalho:', event.data)
}
</script>

<template>
    <div class="h-screen flex items-center justify-center bg-gray-100 p-6">
        <UCard class="w-full sm:w-[600px] bg-white p-6 rounded-lg shadow-lg">
            <h2 class="text-2xl font-semibold mb-6 text-center">Registro de Ponto</h2>
            
            <UForm :schema="workSchema" :state="workState" class="space-y-6" @submit="onSubmit">
                
                <!-- Campo Empresa -->
                <UFormGroup label="Empresa" name="company">
                    <USelect v-model="workState.company" :options="companies" class="border p-2 rounded-lg" />
                </UFormGroup>

                <!-- Campo Funcionário -->
                <UFormGroup label="Funcionário" name="employee">
                    <USelect v-model="workState.employee" :options="employees" class="border p-2 rounded-lg" />
                </UFormGroup>

                <!-- Campo Dia Trabalhado -->
                <UFormGroup label="Dia Trabalhado" name="date">
                    <UInput v-model="workState.date" type="date" class="border p-2 rounded-lg" />
                </UFormGroup>

                <!-- Campo Horário de Entrada -->
                <UFormGroup label="Horário de Entrada" name="startTime">
                    <UInput v-model="workState.startTime" type="time" class="border p-2 rounded-lg" />
                </UFormGroup>

                <!-- Campo Horário de Saída -->
                <UFormGroup label="Horário de Saída" name="endTime">
                    <UInput v-model="workState.endTime" type="time" class="border p-2 rounded-lg" />
                </UFormGroup>

                <!-- Campo Observações -->
                <UFormGroup label="Observações" name="notes">
                    <UTextarea v-model="workState.notes" class="border p-2 rounded-lg" />
                </UFormGroup>

                <!-- Botão de Salvar Registro -->
                <div class="flex justify-center">
                    <UButton type="submit" class="px-4 py-2 bg-blue-500 text-white rounded-lg mb-2 w-full hover:bg-blue-600 transition-all duration-300">Salvar Registro</UButton>
                </div>
            </UForm>
        </UCard>
    </div>
</template>

<style scoped>
.bg-lightblue-500 {
    background-color: #63b3ed;
}
</style>
