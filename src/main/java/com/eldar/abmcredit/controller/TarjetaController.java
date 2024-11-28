package com.eldar.abmcredit.controller;

@RestController
@RequestMapping("/api/tarjetas")
public class TarjetaController {

    @Autowired
    private TarjetaRepository tarjetaRepository;

    @Autowired
    private TarjetaService tarjetaService;

    @PostMapping
    public ResponseEntity<Tarjeta> crearTarjeta(@RequestBody Tarjeta tarjeta) {
        tarjeta = tarjetaRepository.save(tarjeta);
        tarjetaService.enviarDatosSensibles(tarjeta);
        return ResponseEntity.status(HttpStatus.CREATED).body(tarjeta);
    }
}
