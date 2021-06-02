package com.example.esms.mapper;

import com.example.esms.domain.Employee;
import com.example.esms.query.EmployeeQueryObject;

import java.util.List;

public interface IEmployeeMapper {
    public List<Employee> selectAll();
    public List<Employee> queryForList(EmployeeQueryObject eqo);
    public Integer queryForCount(EmployeeQueryObject record);
    public void insert(Employee employee);
    public void deleteByEmpId(Long id);
    public void update(Employee employee);
    public Employee selectById(Long id);
    public void todayAbsence(Long id);
    public Integer registered(Long id);
}
