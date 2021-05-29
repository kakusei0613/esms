package com.example.esms.service;

import com.example.esms.domain.Position;

import java.util.List;

public interface IPositionService {
    public List<Position> selectAll();
    public void insert(Position record);
    public void deleteById(Integer id);
}
