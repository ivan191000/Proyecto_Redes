package com.proyecto_redes.demo.DTO;

public class RegistroDTO {
    private RedDTO redDTO;
    private EstadoDTO estadoDTO;

    public RegistroDTO(RedDTO redDTO, EstadoDTO estadoDTO) {
        this.redDTO = redDTO;
        this.estadoDTO = estadoDTO;
    }

    public RegistroDTO() {
    }

    public RedDTO getRedDTO() {
        return redDTO;
    }

    public void setRedDTO(RedDTO redDTO) {
        this.redDTO = redDTO;
    }

    public EstadoDTO getEstadoDTO() {
        return estadoDTO;
    }

    public void setEstadoDTO(EstadoDTO estadoDTO) {
        this.estadoDTO = estadoDTO;
    }
}
