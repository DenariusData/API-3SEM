
type Route = {
    label: string;
    to: string;
    icon: string;
  };


const routes = [
  { label: 'Home', to: '/', icon: 'dashicons:admin-home'},
  { label: 'Registro de Ponto', to: '/ponto', icon: 'mdi:clock-plus' },
  { label: 'Cadastros', to: '/cadastro', icon: 'mdi:account-multiple-plus' },
  { label: 'Relatórios e Exportação', to: '/relatorio', icon: 'mdi:calendar-export' }
]

export default routes

  