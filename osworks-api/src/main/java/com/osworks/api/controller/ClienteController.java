package com.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import com.osworks.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        var cliente1 = new Cliente();
        cliente1.setId(1l);
        cliente1.setNome("Cesar");
        cliente1.setEmail("cesar@gmail.com");
        cliente1.setTelefone("40028922");

        var cliente2 = new Cliente();
        cliente2.setId(2l);
        cliente2.setNome("Jonas");
        cliente2.setEmail("jonas@gmail.com");
        cliente2.setTelefone("40028922");

        return Arrays.asList(cliente1, cliente2);
    }
}
