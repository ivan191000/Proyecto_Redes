package com.proyecto_redes.demo.controller;

import com.proyecto_redes.demo.DTO.EstadoDTO;
import com.proyecto_redes.demo.DTO.ListaRedesDTO;
import com.proyecto_redes.demo.DTO.RedDTO;
import com.proyecto_redes.demo.DTO.RegistroDTO;
import com.proyecto_redes.demo.model.Estado;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class RedesController {

    List<RedDTO>redes=new ArrayList<>();

    @PostMapping("/registrar")
    public ResponseEntity<?> registrar(@RequestBody RedDTO redDTO){
        for(RedDTO r:redes){
            if(r.getNombre().equals(redDTO.getNombre())){
                return ResponseEntity.status(400).body("esta red ya existe");
            }
        }
        redes.add(redDTO);
        return ResponseEntity.status(201).body(redDTO);

    }

    @GetMapping("/consultar")
    public ResponseEntity<List<RedDTO>> consulta(){
       if(redes.isEmpty()){
           return ResponseEntity.status(404).build();
       }
       return ResponseEntity.ok(redes);

    }

}
