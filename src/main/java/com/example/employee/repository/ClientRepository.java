package com.example.employee.repository;

import com.example.employee.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface ClientRepository extends JpaRepository<Client, Integer>{
    public List<Client> findByCname(String client_name);
}
