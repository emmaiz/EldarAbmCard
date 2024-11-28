package com.eldar.abmcredit.controller;

@RestController
@RequestMapping("/api/compras")
public class CompraController {

    @Autowired
    private CompraRepository compraRepository;

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<Compra> realizarCompra(@RequestBody Compra compra) {
        Compra compraGuardada = compraRepository.save(compra);
        emailService.enviarEmail(
                compra.getTarjeta().getUsuario().getEmail(),
                "Compra realizada",
                String.format("Se ha realizado una compra de %.2f por el detalle: %s",
                        compra.getMonto(), compra.getDetalle())
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(compraGuardada);
    }
}
