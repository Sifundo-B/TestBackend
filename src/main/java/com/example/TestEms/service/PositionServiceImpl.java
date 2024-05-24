package com.example.TestEms.service;

import com.example.TestEms.entity.Position;
import com.example.TestEms.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService{
    @Autowired
    private PositionRepository positionRepository;
    @Override
    public void addPosition(Position position) {
        positionRepository.save(position);
    }

    @Override
    public List<Position> getAllPositions() {
        return positionRepository.findAll();
    }

    @Override
    public void softDeletePosition(long positionId) {
        Position position = positionRepository.findById(positionId).orElse(null);
        if (position != null) {
            position.setSoftDeleted(true);
            positionRepository.save(position);
        }
    }

}
