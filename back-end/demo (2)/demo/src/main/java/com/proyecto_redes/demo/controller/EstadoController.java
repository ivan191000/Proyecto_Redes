package com.proyecto_redes.demo.controller;

import com.proyecto_redes.demo.entities.RedEstado;
import com.proyecto_redes.demo.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registros-redes")
public class EstadoController {
    @Autowired
    private EstadoRepository estadoRepository;

    @PostMapping
    public RedEstado RegistrarPrueba(@RequestBody RedEstado redEstado){
        return estadoRepository.save(redEstado);
    }

    @GetMapping
    public List<RedEstado>ConsultarHistorial(){
        return estadoRepository.findAll();
    }
}
