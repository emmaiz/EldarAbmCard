package com.eldar.abmcredit.service;

@Service
public class EmailService {

    public void enviarEmail(String destinatario, String asunto, String cuerpo) {
        // Simulación de envío de email
        System.out.println("Enviando email a " + destinatario);
        System.out.println("Asunto: " + asunto);
        System.out.println("Cuerpo: " + cuerpo);
    }
}
