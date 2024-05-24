package com.example.TestEms.service;

import com.example.TestEms.entity.Department;

import java.util.List;

public interface DepartmentService {
    void addDepartment(Department department);

    List<Department> getAllDepartments();

    void softDeleteDepartment(long departmentId);
}
