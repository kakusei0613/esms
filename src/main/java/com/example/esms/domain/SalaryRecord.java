package com.example.esms.domain;

public class SalaryRecord {
    private Salary employee;
    private String name;
    private Department department;
    private Position position;
    private String date;
    private Double deduction;

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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getDeduction() {
        return deduction;
    }

    public void setDeduction(Double deduction) {
        this.deduction = deduction;
    }

    public Double getActSalary() {
        return (employee.getBase() + employee.getExtra() - this.deduction);
    }
}
