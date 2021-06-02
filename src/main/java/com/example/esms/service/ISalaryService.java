package com.example.esms.service;

import com.example.esms.domain.SalaryRecord;
import com.example.esms.query.PageResult;
import com.example.esms.query.SalaryQueryObject;


public interface ISalaryService {
    public PageResult<SalaryRecord> queryForList(SalaryQueryObject sqo);
}
