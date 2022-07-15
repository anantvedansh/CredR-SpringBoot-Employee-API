package com.example.employee.controller;

import com.example.employee.model.*;
import com.example.employee.service.ClientService;
import com.example.employee.service.EmployeeService;
import com.example.employee.service.WorksWithService;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {
    private final ClientService clientService;
    private final EmployeeService employeeService;
    private final WorksWithService worksWithService;

    EmployeeController(ClientService clientService, EmployeeService employeeService, WorksWithService worksWithService){
        this.clientService=clientService;
        this.employeeService=employeeService;
        this.worksWithService=worksWithService;
    }


    @GetMapping("/getEmp/{client_name}")
    private String test(@PathVariable String client_name){

        List<app> out = new ArrayList<>();
        List<Client> clientGiven = clientService.getClientByName(client_name);

        for(Client client : clientGiven) {
            int clientId = client.getClient_id();



            List<WorksWith> WorksWithList = worksWithService.getListByClientId(clientId);
            for (WorksWith worksWith : WorksWithList) {

                int empId = worksWith.getEmp_id();
                int total_sales = worksWith.getTotal_sales();
                StringBuilder stb = new StringBuilder();
                stb.append(employeeService.getEmployee(empId).getFirst_name());
                stb.append(" ");
                stb.append(employeeService.getEmployee(empId).getLast_name());

                String emp_name = stb.toString();
                if(employeeService.getEmployee(empId).getSex()=='M') {
                    app a = new app(emp_name, 'M', client_name, total_sales);
                    out.add(a);
                }
            }
        }
        if(out.size()>0) {
            Gson gson = new Gson();
            String jsonStr = gson.toJson(out);
            return jsonStr;
        }
        else {
            return "Not Found";
        }
    }
}
