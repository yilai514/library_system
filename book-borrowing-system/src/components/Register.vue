<template>
    <div id="register">
        <h1>Register Account</h1>
        <p>User Name: <input v-model="username"></p>
        <p>Phone Number: <input v-model="pnum" placeholder="09123456"></p>
        <p>Password: <input v-model="pwd"></p>
        <router-link to='/'>
            <p><button>Confirm</button></p>
            <button>Return</button>
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
