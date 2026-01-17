package com.proyecto_redes.demo.repository;

import com.proyecto_redes.demo.entities.RedEstado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository<RedEstado,Long> {
}
