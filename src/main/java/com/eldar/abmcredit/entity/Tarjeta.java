package com.eldar.abmcredit.entity;

import org.springframework.data.annotation.Transient;

@Entity
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private String numero; // PAN (encriptado)
    private String fechaVencimiento;
    private String cardHolder;

    @Transient
    private String cvv; // No se persiste, pero se usa para enviar por email

    @ManyToOne
    private Usuario usuario;

    // Getters y Setters
}
