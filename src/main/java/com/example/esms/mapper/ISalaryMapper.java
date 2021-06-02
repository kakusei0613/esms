package com.example.esms.mapper;

import com.example.esms.domain.SalaryRecord;
import com.example.esms.query.SalaryQueryObject;

import java.util.List;

public interface ISalaryMapper {
    public List<SalaryRecord> queryForList(SalaryQueryObject sqo);
    public Integer queryForCount(SalaryQueryObject sqo);
}
