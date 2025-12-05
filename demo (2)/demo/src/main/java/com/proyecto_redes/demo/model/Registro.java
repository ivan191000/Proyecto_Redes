package com.proyecto_redes.demo.model;

import jdk.jfr.Timestamp;

import java.util.Objects;

public class Registro {
    private String nombreRed;
    private Estado estado;
    private Timestamp fecha;

    public Registro(String nombreRed, Estado estado, Timestamp fecha) {
        this.nombreRed = nombreRed;
        this.estado = estado;
        this.fecha = fecha;
    }

    public Registro() {
    }

    public String getNombreRed() {
        return nombreRed;
    }

    public void setNombreRed(String nombreRed) {
        this.nombreRed = nombreRed;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

}
