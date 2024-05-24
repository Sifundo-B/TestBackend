package com.example.TestEms.service;

import com.example.TestEms.entity.Department;
import com.example.TestEms.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public void addDepartment(Department department) {
        departmentRepository.save(department);
    }
    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public void softDeleteDepartment(long departmentId) {
        Department department = departmentRepository.findById(departmentId).orElse(null);
        if (department != null) {
            department.setSoftDeleted(true);
            departmentRepository.save(department);
        }
    }
}
