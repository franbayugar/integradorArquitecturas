package com.client.controller;

import com.client.model.Client;
import com.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Qualifier("clientService")
    @Autowired
    private ClientService service;

    public ClientController(@Qualifier("clientService") ClientService service) {
        super();
        this.service = service;
    }

    //metodos para controller
    @GetMapping("/clients")
    public List<Client> getAllClients() {
        return service.getClient();
    }

    @PostMapping("/clients")
    public Client newClient(@RequestBody Client p) {
        return service.newClient(p);
    }
    //devolveria un listado de clientes

    @PutMapping("/clients/{id}")
    Client modifyClient(@RequestBody Client clientUpdated, @PathVariable Integer id) {
        return service.updateClient(clientUpdated, id);
    }

    //REVISAR --> deberia de devolver alguna respuesta andan las dos pero sin respuesta
   // @DeleteMapping("/clients/{id}")
   // public void deleteClient(@PathVariable("id") Integer id) {
   //     service.deleteClient(id);
   // }
    @DeleteMapping("/clients/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable(value="id")int id) {
        service.deleteClient(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

