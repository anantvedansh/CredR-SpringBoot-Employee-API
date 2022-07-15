package com.example.employee.model;

import javax.persistence.*;

@Entity
@Table(name = "employee")

public class Employee {
    @Id
    private int emp_id;
    @Column(nullable = false)
    private String first_name;
    private String last_name;
    private String birth_day;
    private char sex;
    private int salary;

    //default constructor
    public Employee() {}
    //parameterised constructor
    public Employee(int emp_id, String first_name, String last_name, String birth_day, char sex, int salary){
        this.emp_id=emp_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_day = birth_day;
        this.sex = sex;
        this.salary = salary;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBirth_day() {
        return birth_day;
    }

    public void setBirth_day(String birth_day) {
        this.birth_day = birth_day;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
