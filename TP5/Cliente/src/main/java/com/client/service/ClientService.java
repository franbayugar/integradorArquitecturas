package com.client.service;

import com.client.model.Client;
import com.client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;


    public Client newClient(Client c) {
        return clientRepository.save(c);
    }

    public List<Client> getClient(){
        return clientRepository.findAll();
    }

    public Client updateClient(Client clientUpdated, Integer id) {
        Client client = clientRepository.getReferenceById(id);
        client.setName(clientUpdated.getName());
        client.setLastname(clientUpdated.getLastname());
        return clientRepository.save(client);
    }

    public void deleteClient(int id) {
        clientRepository.deleteById(id);
    }

}
