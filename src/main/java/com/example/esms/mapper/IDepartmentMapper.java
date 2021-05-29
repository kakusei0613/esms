package com.example.esms.mapper;

import com.example.esms.domain.Department;

import java.util.List;

public interface IDepartmentMapper {
    public List<Department> selectAll();
    public void insert(Department record);
    public void deleteById(Integer id);
}
