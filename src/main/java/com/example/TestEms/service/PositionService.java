package com.example.TestEms.service;

import com.example.TestEms.entity.Department;
import com.example.TestEms.entity.Position;

import java.util.List;

public interface PositionService {
    void addPosition(Position position);

    List<Position> getAllPositions();

    void softDeletePosition(long positionId);
}
