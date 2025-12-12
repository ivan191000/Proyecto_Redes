package com.proyecto_redes.demo.DTO;


import java.util.List;

public class ListaRedesDTO {
    private List<RedDTO> redes;
    private String estador;

    public ListaRedesDTO(List<RedDTO> redes, String estador) {
        this.redes = redes;
        this.estador = estador;
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
        return estador;
    }

    public void setEstador(String estador) {
        this.estador = estador;
    }
}
