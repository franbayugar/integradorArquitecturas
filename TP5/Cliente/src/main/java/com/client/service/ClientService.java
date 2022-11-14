package com.client.service;

import com.client.model.Client;
import com.client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

}
