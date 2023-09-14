<template>
    <div id="login">
        <h1>Welcome to library system.</h1>
        <br />
        <p>Phone Number: <input v-model="pnum" placeholder="09123456"></p>
        <p>
            Password: <input v-if="showpwd" v-model="pwd">
            <input v-else v-model="pwd" type="password">
            <input type="checkbox" v-model="showpwd">
            <label for="checkbox">Show Password</label>
        </p>
        <router-link to='/menu'>
          <button>Login</button>
        </router-link>
        <router-link to='/register'>
            <button>Register</button>
        </router-link>
    </div>
</template>

<script>
export default {
  name: 'Login',
  data () {
    return {
      pnum: '',
      pwd: '',
      showpwd: false
    }
  }
}
</script>
