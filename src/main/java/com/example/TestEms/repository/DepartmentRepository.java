package com.example.TestEms.repository;

import com.example.TestEms.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository <Department, Long> {
}
