package com.example.esms.service;

import com.example.esms.domain.Education;

import java.util.List;

public interface IEducationService {
    public List<Education> selectAll();
    public void insert(Education record);
    public void deleteById(Integer id);
}
