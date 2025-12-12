package com.proyecto_redes.demo.DTO;

import com.proyecto_redes.demo.model.Estado;

public class RegistroDTO {
    private RedDTO redDTO;
    private EstadoDTO estado;

    public RegistroDTO(RedDTO redDTO, EstadoDTO estado) {
        this.redDTO = redDTO;
        this.estado = estado;
    }

    public RegistroDTO() {
    }

    public RedDTO getRedDTO() {
        return redDTO;
    }

    public void setRedDTO(RedDTO redDTO) {
        this.redDTO = redDTO;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }
}
