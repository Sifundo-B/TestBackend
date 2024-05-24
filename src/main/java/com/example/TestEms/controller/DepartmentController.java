package com.example.TestEms.controller;


import com.example.TestEms.entity.Department;
import com.example.TestEms.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
@CrossOrigin("*")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartments() {
        List<Department> departments = departmentService.getAllDepartments();
        return ResponseEntity.ok(departments);
    }


    @PostMapping
    public ResponseEntity<?> addDepartment(@RequestBody Department department) {
        departmentService.addDepartment(department);
        return ResponseEntity.ok("Department added successfully.");
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> softDeleteDepartment(@PathVariable("id") long departmentId) {
        departmentService.softDeleteDepartment(departmentId);
        return ResponseEntity.ok("Department soft deleted successfully");
    }

}
