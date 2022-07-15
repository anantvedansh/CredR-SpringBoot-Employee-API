package com.example.employee.model;

import javax.persistence.*;

@Entity
@Table(name = "works_with")
@IdClass(WorksWithId.class)
public class WorksWith {
    @Id
    private int emp_id;

    @Id
    @Column(name="client_id")
    private int clientId;
    private int total_sales;

    //default constructor
    public WorksWith() {}

    //parameterised constructor
    public WorksWith(Integer emp_id, Integer client_id, int total_sales){
        this.emp_id = emp_id;
        this.clientId = client_id;
        this.total_sales = total_sales;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getTotal_sales() {
        return total_sales;
    }

    public void setTotal_sales(int total_sales) {
        this.total_sales = total_sales;
    }
}


