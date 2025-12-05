package com.proyecto_redes.demo.DTO;

import com.proyecto_redes.demo.model.Estado;

public class EstadoDTO {
    private Estado estado;

    public EstadoDTO(Estado estado) {
        this.estado = estado;
    }

    public EstadoDTO() {
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
