package com.example.employee.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

public class WorksWithId implements Serializable {
    private Integer emp_id;
    @Column(name="client_id")
    private Integer clientId;
    public WorksWithId(){}
    public WorksWithId(Integer emp_id, Integer client_id){
        this.emp_id = emp_id;
        this.clientId = client_id;
    }
}
