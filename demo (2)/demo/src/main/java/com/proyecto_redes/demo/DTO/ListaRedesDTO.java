package com.proyecto_redes.demo.DTO;


import java.util.List;

public class ListaRedesDTO {
    private List<RedDTO> redes;
    private String estado;

    public ListaRedesDTO(List<RedDTO> redes, String estado) {
        this.redes = redes;
        this.estado = estado;
    }

    public ListaRedesDTO() {
    }

    public List<RedDTO> getRedes() {
        return redes;
    }

    public void setRedes(List<RedDTO> redes) {
        this.redes = redes;
    }

    public String getEstador() {
        return estado;
    }

    public void setEstador(String estado) {
        this.estado = estado;
    }
}
