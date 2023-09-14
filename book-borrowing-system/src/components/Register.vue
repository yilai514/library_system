<template>
    <div id="register">
        <router-link to='/'>
            <button>Return</button>
        </router-link>
        <h1>Register Account</h1>
        <p>User Name: <input v-model="username"></p>
        <p>Phone Number: <input v-model="pnum" placeholder="09123456"></p>
        <p>Password: <input v-model="pwd"></p>
        <router-link to='/'>
            <button>Confirm</button>
        </router-link>
    </div>
</template>

<script>
export default {
  name: 'register',
  data () {
    return {
      username: '',
      pnum: '',
      pwd: ''
    }
  }
}
</script>
