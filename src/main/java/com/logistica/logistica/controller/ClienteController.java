package com.logistica.logistica.controller;

import com.logistica.logistica.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {
    @GetMapping("/clientes")
    public List<Cliente> listar(){
        Cliente cliente1 = new Cliente();
        cliente1.setId(1l);
        cliente1.setNome("Luciana");
        cliente1.setEmail("lucyfurt@gmail.com");
        cliente1.setTelefone("98 9999-9999");

        Cliente cliente2 = new Cliente();
        cliente2.setId(2l);
        cliente2.setNome("Maria");
        cliente2.setEmail("maria@gmail.com");
        cliente2.setTelefone("98 9920-19061");

        return Arrays.asList(cliente1, cliente2);
    }
}



