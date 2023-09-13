import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/components/Login.vue'
import Register from '@/components/Register.vue'
import SpringBoot from '@/components/SpringBoot.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Login',
      component: Login
    },
    {
      path: '/register',
      name: 'Register',
      component: Register
    },
    {
      path: '/springboot',
      name: 'SpringBoot',
      component: SpringBoot
    }
  ]
})
