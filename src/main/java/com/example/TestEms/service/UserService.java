package com.example.TestEms.service;

import com.example.TestEms.entity.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> getAllEmployees();

    void requestUpdate(UserModel userModel);
    void addEmployee(UserModel userModel);
    void softDeleteEmployee(Long id);
    void approveUpdate(UserModel userModel);


}
