package com.proyecto_redes.demo.controller;

import com.proyecto_redes.demo.DTO.RedDTO;
import com.proyecto_redes.demo.DTO.RegistroRedesDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TelemetriaController {

    List<RegistroRedesDTO> listaRedes = new ArrayList<>();

    @PostMapping("/introducirEstado")
    public ResponseEntity<RegistroRedesDTO> registro (@RequestBody RegistroRedesDTO registroRedesDTO) {
        listaRedes.add(registroRedesDTO);
        return ResponseEntity.ok(registroRedesDTO);
    }

    @GetMapping("/consultaHistorico")
    public ResponseEntity<?> historico (){
        if(listaRedes.isEmpty()){
            return ResponseEntity.status(404).body("No se han encontrado redes");
        }
        return ResponseEntity.status(200).body(listaRedes);
    }

}
