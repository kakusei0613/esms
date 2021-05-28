package com.example.esms.service.impl;

import com.example.esms.domain.Employee;
import com.example.esms.mapper.IEmployeeMapper;
import com.example.esms.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    IEmployeeMapper employeeMapper;
    @Override
    public List<Employee> selectAll() {
        return employeeMapper.selectAll();
    }

    @Override
    public Employee selectById(Long id) {
        return employeeMapper.selectById(id);
    }

    @Override
    public void saveOrUpdate(Employee employee) {
        employeeMapper.insert(employee);
    }

    @Override
    public void deleteById(Long id) {
        employeeMapper.deleteByEmpId(id);
    }
}
