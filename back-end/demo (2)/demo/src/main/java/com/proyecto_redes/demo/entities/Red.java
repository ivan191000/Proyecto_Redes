package com.proyecto_redes.demo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "redes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Red {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotBlank
    private String ssid;
    @Column(nullable = false)
    @NotBlank
    private String usuario;
    @Column(nullable = false)
    @NotBlank
    private String password;
    @Column(nullable = true)
    @NotBlank
    private String seguridad;
}
