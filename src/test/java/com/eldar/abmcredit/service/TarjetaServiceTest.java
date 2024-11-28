package com.eldar.abmcredit.service;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class TarjetaServiceTest {

    @Mock
    private EmailService emailService;

    @InjectMocks
    private TarjetaService tarjetaService;

    @Test
    public void testEnviarDatosSensibles() {
        Usuario usuario = new Usuario();
        usuario.setEmail("test@mail.com");

        Tarjeta tarjeta = new Tarjeta();
        tarjeta.setMarca("VISA");
        tarjeta.setNumero("1234567890123456");
        tarjeta.setCvv("123");
        tarjeta.setUsuario(usuario);

        tarjetaService.enviarDatosSensibles(tarjeta);

        Mockito.verify(emailService).enviarEmail(
                Mockito.eq("test@mail.com"),
                Mockito.eq("Datos de tu tarjeta"),
                Mockito.contains("CVV: 123")
        );
    }
}
