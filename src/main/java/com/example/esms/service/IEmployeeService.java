package com.example.esms.service;

import com.example.esms.domain.Employee;
import com.example.esms.query.EmployeeQueryObject;
import com.example.esms.query.PageResult;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> selectAll();
    public Employee selectById(Long id);
    public PageResult<Employee> query(EmployeeQueryObject record);
    public void saveOrUpdate(Employee employee);
    public void deleteById(Long id);
    public void todayAbsence(Long id);
}
