package com.example.employee.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

public class app {

    private String emp_name;
    private char sex;
    private String client_name;
    private int total_sales;

    public app(){

    }
    public app(String emp_name, char sex, String client_name, int total_sales){
        this.emp_name = emp_name;
        this.sex = sex;
        this.client_name = client_name;
        this.total_sales = total_sales;
    }

    @Override
    public String toString() {
        return "app{" +
                "emp_name='" + emp_name + '\'' +
                ", sex=" + sex +
                ", client_name='" + client_name + '\'' +
                ", total_sales=" + total_sales +
                '}';
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public int getTotal_sales() {
        return total_sales;
    }

    public void setTotal_sales(int total_sales) {
        this.total_sales = total_sales;
    }
}
