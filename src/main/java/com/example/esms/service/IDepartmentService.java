package com.example.esms.service;

import com.example.esms.domain.Department;

import java.util.List;

public interface IDepartmentService {
    public List<Department> selectAll();
    public void insert(Department record);
    public void deleteById(Integer id);
}
