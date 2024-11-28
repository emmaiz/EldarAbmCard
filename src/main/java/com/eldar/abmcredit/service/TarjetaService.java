package com.eldar.abmcredit.service;

@Service
public class TarjetaService {

    @Autowired
    private EmailService emailService;

    public void enviarDatosSensibles(Tarjeta tarjeta) {
        String cuerpo = String.format("Datos de tu tarjeta:\nMarca: %s\nPAN: %s\nCVV: %s",
                tarjeta.getMarca(), tarjeta.getNumero(), tarjeta.getCvv());
        emailService.enviarEmail(tarjeta.getUsuario().getEmail(), "Datos de tu tarjeta", cuerpo);
    }
}
