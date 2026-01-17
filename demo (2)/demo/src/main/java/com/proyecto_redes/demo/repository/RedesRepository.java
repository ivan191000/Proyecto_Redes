package com.proyecto_redes.demo.repository;

import com.proyecto_redes.demo.entities.Red;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RedesRepository extends JpaRepository<Red,Long> {
}
