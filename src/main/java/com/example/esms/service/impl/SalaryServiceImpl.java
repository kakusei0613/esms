package com.example.esms.service.impl;

import com.example.esms.domain.Employee;
import com.example.esms.domain.SalaryRecord;
import com.example.esms.mapper.ISalaryMapper;
import com.example.esms.query.PageResult;
import com.example.esms.query.SalaryQueryObject;
import com.example.esms.service.ISalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SalaryServiceImpl implements ISalaryService {
    @Autowired
    ISalaryMapper salaryMapper;
    @Override
    public PageResult<SalaryRecord> queryForList(SalaryQueryObject sqo) {
        int totalCount = salaryMapper.queryForCount(sqo);
        if(totalCount == 0) {
            return new PageResult<SalaryRecord>(sqo.getPageSize(), sqo.getCurrentPage());
        }
//        for(SalaryRecord sr: salaryMapper.queryForList(sqo)) {
//            System.out.println(sr);
//        }
        return new PageResult<SalaryRecord>(salaryMapper.queryForList(sqo), totalCount, sqo.getPageSize(), sqo.getCurrentPage());
    }
}
