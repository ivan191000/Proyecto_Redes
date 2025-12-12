package com.proyecto_redes.demo.controller;

import com.proyecto_redes.demo.DTO.RedDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RedesController {

    List<RedDTO>redes=new ArrayList<>();

    @PostMapping("/registrar")
    public ResponseEntity<?> registrar(@RequestBody RedDTO redDTO){
        redes.add(redDTO);
        return ResponseEntity.ok(201);

    }



}
