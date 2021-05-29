package com.example.esms.mapper;

import com.example.esms.domain.Education;

import java.util.List;

public interface IEducationMapper {
    public List<Education> selectAll();
    public void insert(Education record);
    public void deleteById(Integer id);
}
