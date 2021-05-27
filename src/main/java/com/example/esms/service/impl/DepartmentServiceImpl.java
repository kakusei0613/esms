package com.example.esms.service.impl;

import com.example.esms.domain.Department;
import com.example.esms.mapper.IDepartmentMapper;
import com.example.esms.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    IDepartmentMapper departmentMapper;
    @Override
    public List<Department> selectAll() {
        return departmentMapper.selectAll();
    }
}
