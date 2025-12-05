package com.proyecto_redes.demo.controller;

import com.proyecto_redes.demo.DTO.EstadoDTO;
import com.proyecto_redes.demo.model.Estado;
import com.proyecto_redes.demo.model.Registro;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RedesController {

    List<Registro>registroList=new ArrayList<>();

    @PostMapping("/estadoRed")
    public ResponseEntity<?> comprobarRed(@RequestBody Registro registro){

        registroList.add(registro);

        return ResponseEntity.ok(201);

    }



}
