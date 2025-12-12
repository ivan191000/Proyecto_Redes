package com.proyecto_redes.demo.DTO;

public class RedyestadoDTO {
    private String nombre;
    private String estado;

    public RedyestadoDTO(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public RedyestadoDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
