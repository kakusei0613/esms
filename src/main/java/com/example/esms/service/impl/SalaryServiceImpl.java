package com.example.esms.service.impl;

import com.example.esms.domain.SalaryRecord;
import com.example.esms.mapper.ISalaryMapper;
import com.example.esms.query.SalaryQueryObject;
import com.example.esms.service.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements ISalaryService {
    @Autowired
    ISalaryMapper salaryMapper;
    @Override
    public List<SalaryRecord> queryForList(SalaryQueryObject sqo) {
        return salaryMapper.queryForList(sqo);
    }
}
