package com.example.employee.repository;

import com.example.employee.model.WorksWith;
import com.example.employee.model.WorksWithId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorksWithRepository extends JpaRepository<WorksWith, WorksWithId>{
    public List<WorksWith> findAllByClientId(Integer clientId);
}
