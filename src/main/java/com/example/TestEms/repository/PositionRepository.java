package com.example.TestEms.repository;

import com.example.TestEms.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PositionRepository extends JpaRepository<Position, Long> {
}
