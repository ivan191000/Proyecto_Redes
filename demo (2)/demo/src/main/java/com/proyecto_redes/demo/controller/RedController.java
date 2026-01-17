package com.proyecto_redes.demo.controller;

import com.proyecto_redes.demo.entities.Red;
import com.proyecto_redes.demo.repository.RedesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/configuracion-redes")
public class RedController {
    @Autowired
    private RedesRepository redesRepository;

    @PostMapping
    public Red AltaRed(@RequestBody Red red){
       return redesRepository.save(red);
    }
    @GetMapping
    public List<Red> ListarObjetivos(){
        return redesRepository.findAll();
    }
}
