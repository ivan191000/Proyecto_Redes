package com.proyecto_redes.demo.controller;

import com.proyecto_redes.demo.DTO.EstadoDTO;
import com.proyecto_redes.demo.DTO.RedDTO;
import com.proyecto_redes.demo.DTO.RedyestadoDTO;
import com.proyecto_redes.demo.DTO.RegistroDTO;
import com.proyecto_redes.demo.model.Estado;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TelemetriaController {

    List<EstadoDTO> listaEstado = new ArrayList<>();
    List<RedDTO> listaRedes = new ArrayList<>();

    @PostMapping("/introducirEstado")
    public ResponseEntity<EstadoDTO> estado (@RequestBody EstadoDTO estado){
        listaEstado.add(estado);
        return ResponseEntity.ok(estado);
    }

    @GetMapping("/consultaHistorico")
    public ResponseEntity<?> historico (){

        for(RedDTO r:listaRedes){
            return ResponseEntity.status(200).body(new RedyestadoDTO(r.getNombre(),"CONECTADO"));
        }
        return ResponseEntity.notFound().build();
    }

}
