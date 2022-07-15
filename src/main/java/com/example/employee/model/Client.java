package com.example.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")

public class Client {
    @Id
    private int client_id;
    @Column(name="client_name")
    private String cname;

    //default constructor
    public Client() {}

    //parameterised constructor
    public Client(int client_id, String client_name){
        this.client_id = client_id;
        this.cname = client_name;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
