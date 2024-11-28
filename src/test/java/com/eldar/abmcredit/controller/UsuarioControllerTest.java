package com.eldar.abmcredit.controller;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
public class UsuarioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCrearUsuario() throws Exception {
        String usuarioJson = "{\"nombre\":\"Juan\", \"apellido\":\"Pérez\", \"email\":\"juan@mail.com\", \"dni\":\"12345678\"}";

        mockMvc.perform(post("/api/usuarios")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(usuarioJson))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.nombre").value("Juan"));
    }
}
