package com.example.employee.service;

import com.example.employee.model.Client;
import com.example.employee.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import java.util.List;

@Service
@Transactional
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    public List<Client> listAllClient(){
        return clientRepository.findAll();
    }

    public void saveClient (Client client){
        clientRepository.save(client);
    }

    public Client getClient(Integer emp_id){
        return clientRepository.findById(emp_id).get();
    }

    public void deleteClient(Integer emp_id){
        clientRepository.deleteById(emp_id);
    }
    public List<Client> getClientByName(String client_name){
        return clientRepository.findByCname(client_name);
    }

}
