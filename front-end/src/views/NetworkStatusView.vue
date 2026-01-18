<script setup>
import { ref, onMounted, onUnmounted } from 'vue';
import axios from 'axios';


const redes = ref([]);
let intervalId = null;


const obtenerRedes = async () => {
  try {
    const response = await axios.get('http://localhost:8080/registros-redes');
    redes.value = response.data;
  } catch (error) { console.error(error); }
};


const getStatusData = (estado) => {
  if (!estado) return { clase: 'badge-failed', texto: 'FAILED' };
  const text = estado.toLowerCase().trim();
  if (text === 'conectado') return { clase: 'badge-ok', texto: 'OK' };
  if (text.includes('auth')) return { clase: 'badge-auth', texto: 'FALLO DE AUTH' };
  return { clase: 'badge-failed', texto: 'FAILED' };
};


onMounted(() => { obtenerRedes(); intervalId = setInterval(obtenerRedes, 20000); });
onUnmounted(() => { if (intervalId) clearInterval(intervalId); });
</script>


<template>
  <div class="container">
    <div class="button-row">
      <router-link to="/" class="btn-back">⬅ Volver</router-link>
      <button @click="obtenerRedes" class="btn-refresh">Refresh Data</button>
    </div>
    <table class="status-table">
      <thead>
        <tr>
          <th>Network Name (SSID)</th>
          <th>Status</th>
          <th>Last Check Date</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="red in redes" :key="red.id">
          <td>{{ red.ssid }}</td>
          <td>
            <span :class="['badge', getStatusData(red.estado).clase]">
              {{ getStatusData(red.estado).texto }}
            </span>
          </td>
          <td class="date">{{ red.fecha_reporte }}</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>


<style scoped>
.button-row { display: flex; justify-content: space-between; margin-bottom: 20px; align-items: center; }
.btn-back { color: #a0d8f1; text-decoration: none; font-weight: bold; }
.btn-refresh { background-color: white; color: #666; border: none; padding: 10px 20px; font-weight: bold; border-radius: 4px; cursor: pointer; }


.status-table { width: 100%; border-collapse: collapse; background-color: #2c2c2c; border: 1px solid #444; }
.status-table th { background-color: #ffffff; color: #333; padding: 15px; text-align: left; border: 1px solid #444; }
.status-table td { padding: 15px; border: 1px solid #444; font-size: 1.1rem; }


.badge { padding: 6px 14px; border-radius: 6px; font-weight: bold; font-size: 0.85rem; display: inline-block; }
.badge-ok { background-color: #4caf50; }
.badge-auth { background-color: #ffeb3b; color: #000; }
.badge-failed { background-color: #f44336; }
.date { color: #aaa; }
</style>
