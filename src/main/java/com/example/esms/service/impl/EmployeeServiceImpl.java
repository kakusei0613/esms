package com.example.esms.service.impl;

import com.example.esms.domain.Employee;
import com.example.esms.mapper.IEmployeeMapper;
import com.example.esms.service.IEmployeeService;
import com.example.esms.util.EmployeeQueryObject;
import com.example.esms.util.PageResult;
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
        if(employee.getId() == null) {
            employeeMapper.insert(employee);
        }
        else {
            employeeMapper.update(employee);
        }
    }

    @Override
    public void deleteById(Long id) {
        employeeMapper.deleteByEmpId(id);
    }

    @Override
    public PageResult<Employee> query(EmployeeQueryObject record) {
        int totalCount = employeeMapper.queryForCount(record);
//        System.out.println(totalCount);
        if(totalCount == 0) {
            return new PageResult<Employee>(record.getPageSize(), record.getCurrentPage());
        }
        return new PageResult<Employee>(employeeMapper.queryForList(record), totalCount, record.getPageSize(), record.getCurrentPage());
    }
}
