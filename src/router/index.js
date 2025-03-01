import { createRouter, createWebHistory } from 'vue-router'
import AboutPage from '@/components/AboutPage.vue'
import HelloWorld from '@/components/HelloWorld.vue'
import AlertsPage from '@/components/AlertsPage.vue'

const routes = [
  { path: '/', component: AlertsPage },
  { path: '/alerts', component: HelloWorld },
  { path: '/about', component: AboutPage }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router