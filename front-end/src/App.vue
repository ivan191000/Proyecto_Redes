<template>
  <div class="dashboard-app">
    <header class="blue-header">
      <h1>WiFi Network Status Monitor</h1>
    </header>
    <router-view></router-view>
  </div>
</template>

<style>
    body { 
        margin: 0; 
        background-color: #212121; 
        color: white; 
        font-family: Arial, sans-serif; 
    }
    .dashboard-app { display: flex; flex-direction: column; align-items: center; }
    .blue-header {
        background-color: #a0d8f1; width: 80%; max-width: 900px; padding: 50px 0;
        text-align: center; margin-top: 30px; color: #1a1a1a;
    }
    .blue-header h1 { margin: 0; font-size: 3.5rem; font-weight: bold; }
    .container { width: 80%; max-width: 900px; margin-top: 30px; }
</style>
