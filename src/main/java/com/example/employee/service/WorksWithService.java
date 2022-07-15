package com.example.employee.service;

import com.example.employee.model.WorksWith;
import com.example.employee.model.WorksWithId;
import com.example.employee.repository.WorksWithRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import java.util.List;
@Service
@Transactional
public class WorksWithService {
    @Autowired
    private WorksWithRepository worksWithRepository;
    public List<WorksWith> listAllWorksWith(){
        return worksWithRepository.findAll();
    }

    public void saveWorksWith(WorksWith worksWith){
        worksWithRepository.save(worksWith);
    }

    public WorksWith getWorksWith (Integer client_id, Integer emp_id){
        WorksWithId id = new WorksWithId(emp_id,client_id);
        return worksWithRepository.findById(id).get();
    }

//    public boolean existsByClientId(Integer client_id, Integer emp_id){
//        WorksWithId id = new WorksWithId(emp_id,client_id);
//        return worksWithRepository.existsById(id);
//    }

    public void deleteWorksWith(Integer client_id, Integer emp_id){
        WorksWithId id = new WorksWithId(emp_id,client_id);
        worksWithRepository.deleteById(id);
    }
    public List<WorksWith> getListByClientId(Integer clientId){
        return worksWithRepository.findAllByClientId(clientId);
    }
}
