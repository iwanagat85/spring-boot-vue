<template>
  <div class="welcome message">
    <h1>{{ message }}</h1>
  </div>
</template>

<script>
  import axios from "axios";

  export default {
    name: 'WelcomeMessage',
    data() {
      return {
        message: null
      }
    },
    mounted() {
      axios.get('http://localhost:8080/api/message')
        .then(response => (this.message = response.data))
    }
  }
</script>