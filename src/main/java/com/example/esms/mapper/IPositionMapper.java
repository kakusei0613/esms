package com.example.esms.mapper;

import com.example.esms.domain.Position;

import java.util.List;

public interface IPositionMapper {
    public List<Position> selectAll();
    public void insert(Position record);
    public void deleteById(Integer id);
}
