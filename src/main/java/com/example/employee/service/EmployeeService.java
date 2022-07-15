package com.example.employee.service;

import com.example.employee.model.Client;
import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> listAllEmployee(){
        return employeeRepository.findAll();
    }

    public void saveEmployee (Employee employee){
        employeeRepository.save(employee);
    }

    public Employee getEmployee(Integer emp_id){
            return employeeRepository.findById(emp_id).get();
    }

    public void deleteEmployee(Integer emp_id){
        employeeRepository.deleteById(emp_id);
    }

}
