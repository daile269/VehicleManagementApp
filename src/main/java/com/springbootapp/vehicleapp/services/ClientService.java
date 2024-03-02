package com.springbootapp.vehicleapp.services;

import com.springbootapp.vehicleapp.models.Client;
import com.springbootapp.vehicleapp.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getClients(){
        return clientRepository.findAll();
    }

    public void saveClient(Client Client){
        clientRepository.save(Client);
    }
    public Optional<Client> getClientByID(Long id){
        return clientRepository.findById(id);
    }
    public void deleteClient(Long id){
        clientRepository.deleteById(id);
    }
}
