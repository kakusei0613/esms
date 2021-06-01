package com.example.esms.service;

import com.example.esms.domain.SalaryRecord;
import com.example.esms.query.SalaryQueryObject;

import java.util.List;

public interface ISalaryService {
    public List<SalaryRecord> queryForList(SalaryQueryObject sqo);
}
