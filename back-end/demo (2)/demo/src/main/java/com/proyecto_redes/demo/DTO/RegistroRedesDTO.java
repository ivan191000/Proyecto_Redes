package com.proyecto_redes.demo.DTO;

import com.proyecto_redes.demo.model.Estado;

import java.time.LocalDateTime;

public class RegistroRedesDTO {
    private String nombre;
    private Estado estado;
    private LocalDateTime timeStamp;

    public RegistroRedesDTO() {
        this.timeStamp = LocalDateTime.now();
    }

    public RegistroRedesDTO(String nombre, Estado estado) {
        this.nombre = nombre;
        this.timeStamp = LocalDateTime.now();
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
