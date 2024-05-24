package com.example.TestEms.controller;

import com.example.TestEms.entity.Position;
import com.example.TestEms.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
@CrossOrigin("*")
public class PositionController {
    @Autowired
    private PositionService positionService;

    @PostMapping("/add")
    public ResponseEntity<?> addPosition(@RequestBody Position position) {
        positionService.addPosition(position);
        return ResponseEntity.ok("Position added successfully.");
    }
    @GetMapping("/all")
    public ResponseEntity<List<Position>> getAllPositions() {
        List<Position> positionList = positionService.getAllPositions();
        return ResponseEntity.ok(positionList);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> softDeletePosition(@PathVariable("id") long positionId) {
        positionService.softDeletePosition(positionId);
        return ResponseEntity.ok("Position soft deleted successfully");
    }
}
