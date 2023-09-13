<template>
    <div id = "springboot">
      <p>Name: {{ username }}</p>
      <p>Age: {{ userage }}</p>
    </div>
</template>

<script>
import Vue from 'vue'
import axios from 'axios'
import VueAxios from 'vue-axios'

Vue.use(VueAxios, axios)

export default {
  name: 'springboot',
  data () {
    return {
      username: '',
      userage: ''
    }
  },
  created () {
    Vue.axios
      .get('http://localhost:8005/MySpringBoot/student/allstudent')
      .then((response) => {
        console.log(response.data)
      })
      .catch((error) => {
        console.log(error)
      })
  }
}
</script>
