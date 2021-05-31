package com.example.esms.domain;

public class SalaryRecord {
    private Salary employee;
    private String name;
    private String department;
    private String position;
    private Double deduction;
    private Double actSalary;

    public Salary getEmployee() {
        return employee;
    }

    public void setEmployee(Salary employee) {
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getDeduction() {
        return deduction;
    }

    public void setDeduction(Double deduction) {
        this.deduction = deduction;
    }

    public Double getActSalary() {
        return actSalary;
    }

    public void setActSalary(Double actSalary) {
        this.actSalary = actSalary;
    }
}
