import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/components/Login.vue'
import Register from '@/components/Register.vue'
import Menu from '@/components/Menu.vue'
import BB from '@/components/BorrowBook.vue'
import RB from '@/components/ReturnBook.vue'

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
      path: '/menu',
      name: 'Menu',
      component: Menu
    },
    {
      path: '/booklist',
      name: 'BorrowBook',
      component: BB
    },
    {
      path: '/onloanbooklist',
      name: 'ReturnBook',
      component: RB
    }
  ]
})
