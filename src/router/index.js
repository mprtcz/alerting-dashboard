import { createRouter, createWebHistory } from 'vue-router'
import AboutPage from '@/components/AboutPage.vue'
import HelloWorld from '@/components/HelloWorld.vue'
import AlertsList from '@/components/AlertsList.vue'

const routes = [
  { path: '/', component: HelloWorld },
  { path: '/alerts', component: AlertsList },
  { path: '/about', component: AboutPage }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router