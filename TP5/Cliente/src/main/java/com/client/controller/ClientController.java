package com.client.controller;

import com.client.model.Client;
import com.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
    @Qualifier("clientService")
    @Autowired
    private ClientService service;

    public ClientController(@Qualifier ("clientService") ClientService service){
        super();
        this.service = service;
    }

    //metodos para controller
    @GetMapping("/clients")
    public List<Client> getAllClients(){
        return service.getClient();
    }

    @PostMapping("/clients")
    public Client newClient(@RequestBody Client p){
        return service.newClient(p);
    }
    //devolveria un listado de clientes
}
