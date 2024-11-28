package com.eldar.abmcredit.entity;

import org.springframework.data.annotation.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String email;
    private String dni;

    // Getters y Setters
}
