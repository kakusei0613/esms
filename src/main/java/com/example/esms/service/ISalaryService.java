package com.example.esms.service;

import com.example.esms.domain.AbsenceRecord;
import com.example.esms.domain.SalaryRecord;
import com.example.esms.query.PageResult;
import com.example.esms.query.SalaryQueryObject;

import java.util.List;


public interface ISalaryService {
    public PageResult<SalaryRecord> queryForList(SalaryQueryObject sqo);
    public List<AbsenceRecord> queryForToday();
}
