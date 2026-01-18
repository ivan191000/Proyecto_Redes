<template>
  <div class="container home-menu">
    <router-link to="/añadir-red" class="main-btn btn-green">Añadir Red +</router-link>
    <router-link to="/estado-red" class="main-btn btn-blue">Ver Estado Red</router-link>
  </div>
</template>

<style scoped>
    .home-menu { display: flex; gap: 30px; justify-content: center; margin-top: 60px; }
    .main-btn {
        padding: 40px 60px; font-size: 1.8rem; font-weight: bold;
        text-decoration: none; border-radius: 12px; color: white; text-align: center;
    }
    .btn-green { background-color: #4caf50; }
    .btn-blue { background-color: #90caf9; color: #333; }
</style>