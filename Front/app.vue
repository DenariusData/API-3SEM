<script setup lang="ts">
import routes from './utils/routes'
const router = useRouter()
</script>

<template dir="routing/pages" :nav="routes" current-route>
  <NuxtLayout>
    <NuxtPage />
  </NuxtLayout>
</template>
