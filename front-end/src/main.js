import { createApp } from 'vue'
import { createRouter, createWebHistory } from 'vue-router'
import App from './App.vue'
import HomeView from './views/HomeView.vue'
import NetworkFormView from './views/NetworkFormView.vue'
import NetworkStatusView from './views/NetworkStatusView.vue'

const routes = [
  { path: '/', component: HomeView },
  { path: '/añadir-red', component: NetworkFormView },
  { path: '/estado-red', component: NetworkStatusView }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

createApp(App).use(router).mount('#app')