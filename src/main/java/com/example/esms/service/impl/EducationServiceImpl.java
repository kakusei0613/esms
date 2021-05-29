package com.example.esms.service.impl;

import com.example.esms.domain.Education;
import com.example.esms.mapper.IEducationMapper;
import com.example.esms.service.IEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements IEducationService {
    @Autowired
    IEducationMapper educationMapper;
    @Override
    public List<Education> selectAll() {
        return educationMapper.selectAll();
    }

    @Override
    public void insert(Education record) {
        educationMapper.insert(record);
    }

    @Override
    public void deleteById(Integer id) {
        educationMapper.deleteById(id);
    }
}
