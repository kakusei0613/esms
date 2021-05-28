package com.example.esms.mapper;

import com.example.esms.domain.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IEmployeeMapper {
    public List<Employee> selectAll();
    public void insert(Employee employee);
    public void deleteByEmpId(Long id);
    public void updateByEmpId(Long id, Employee employee);
    public Employee selectById(Long id);
}
