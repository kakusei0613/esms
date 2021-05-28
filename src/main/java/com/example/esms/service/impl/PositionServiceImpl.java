package com.example.esms.service.impl;

import com.example.esms.domain.Position;
import com.example.esms.mapper.IPositionMapper;
import com.example.esms.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements IPositionService {
    @Autowired
    IPositionMapper positionMapper;

    @Override
    public List<Position> selectAll() {
        return positionMapper.selectAll();
    }
}
