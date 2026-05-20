package com.example.ClienteProduto.Controller;

import com.example.ClienteProduto.Models.ClienteModel;
import com.example.ClienteProduto.Repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<ClienteModel> findAll() {
        return clienteRepository.findAll();
    }

    @PostMapping
    public ClienteModel salvarCliente(@RequestBody ClienteModel clienteModel) {
        return clienteRepository.save(clienteModel);
    }
}
