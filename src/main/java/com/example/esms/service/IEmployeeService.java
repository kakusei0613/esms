package com.example.esms.service;

import com.example.esms.domain.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> selectAll();
    public Employee selectById(Long id);
    public void saveOrUpdate(Employee employee);
    public void deleteById(Long id);
}
