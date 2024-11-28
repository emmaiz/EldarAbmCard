package com.eldar.abmcredit.entity;
import javax.persistence.Entity;

@Entity
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double monto;
    private String detalle;

    @ManyToOne
    private Tarjeta tarjeta;

    private String cvv; // Validación temporal del CVV

    @CreationTimestamp
    private LocalDateTime fecha;

    // Getters y Setters
}
