<script setup>
import { ref } from 'vue';
import axios from 'axios';
import { useRouter } from 'vue-router';


const router = useRouter();


// Estado para el formulario con los 4 campos obligatorios
const nuevaRed = ref({
  ssid: '',
  usuario: '',
  password: '',
  seguridad: ''
});


// Función para enviar los datos al backend
const agregarRed = async () => {
  try {
    await axios.post('http://localhost:8080/configuracion-redes', nuevaRed.value);
    alert("Red añadida correctamente");
   
    // Al terminar, nos lleva automáticamente a la tabla de estados
    router.push('/estado-red');
  } catch (error) {
    console.error("Error al añadir red:", error.response?.data);
    alert("Error: Asegúrate de que todos los campos estén completos");
  }
};
</script>


<template>
  <div class="container">
    <router-link to="/" class="btn-back">⬅ Volver al Menú</router-link>


    <section class="form-section">
      <h3>Añadir Nueva Red</h3>
      <form @submit.prevent="agregarRed" class="add-form">
        <div class="form-group">
          <label>Nombre de Red (SSID)</label>
          <input v-model="nuevaRed.ssid" placeholder="Ej: MiRed_WiFi" required />
        </div>


        <div class="form-group">
          <label>Usuario</label>
          <input v-model="nuevaRed.usuario" placeholder="Ej: admin" required />
        </div>


        <div class="form-group">
          <label>Contraseña</label>
          <input v-model="nuevaRed.password" type="password" placeholder="********" required />
        </div>


        <div class="form-group">
          <label>Tipo de Seguridad</label>
          <select v-model="nuevaRed.seguridad" required>
            <option value="" disabled selected>Selecciona seguridad</option>
            <option value="WPA2">WPA2</option>
            <option value="WPA3">WPA3</option>
            <option value="WEP">WEP</option>
            <option value="OPEN">Abierta</option>
          </select>
        </div>


        <button type="submit" class="btn-add">Guardar Configuración</button>
      </form>
    </section>
  </div>
</template>


<style scoped>
.container {
  width: 80%;
  max-width: 600px;
  margin-top: 30px;
}


.btn-back {
  display: inline-block;
  margin-bottom: 20px;
  color: #a0d8f1;
  text-decoration: none;
  font-weight: bold;
}


/* ESTILOS DEL FORMULARIO ORIGINALES */
.form-section {
  background-color: #2c2c2c; /* Fondo oscuro igual que la tabla */
  padding: 30px;
  border-radius: 8px;
  border: 1px solid #444;
  box-shadow: 0 4px 10px rgba(0,0,0,0.3);
}


.form-section h3 {
  margin-top: 0;
  color: #a0d8f1;
  font-size: 1.5rem;
  margin-bottom: 25px;
}


.add-form {
  display: flex;
  flex-direction: column;
  gap: 20px;
}


.form-group {
  display: flex;
  flex-direction: column;
  gap: 8px;
  text-align: left;
}


.form-group label {
  color: #ccc;
  font-size: 0.9rem;
  font-weight: bold;
}


.add-form input, .add-form select {
  padding: 12px;
  border-radius: 4px;
  border: 1px solid #555;
  background: #333;
  color: white;
  font-size: 1rem;
}


.add-form input:focus {
  border-color: #a0d8f1;
  outline: none;
}


.btn-add {
  background-color: #4caf50; /* Verde de éxito */
  color: white;
  border: none;
  padding: 15px;
  font-weight: bold;
  font-size: 1.1rem;
  border-radius: 4px;
  cursor: pointer;
  margin-top: 10px;
  transition: background 0.3s;
}


.btn-add:hover {
  background-color: #45a049;
}
</style>
