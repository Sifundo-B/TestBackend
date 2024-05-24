package com.example.TestEms.service;

import com.example.TestEms.entity.UserModel;
import com.example.TestEms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserModel> getAllEmployees() {
        return userRepository.findBySoftDeletedFalse();
    }

    @Override
    public void requestUpdate(UserModel userModel) {
        userModel.setUpdateRequestPending(true);
        userRepository.save(userModel);

    }

    @Override
    public void addEmployee(UserModel userModel) {
        userRepository.save(userModel);
    }

    @Override
    public void softDeleteEmployee(Long id) {
        UserModel userModel = userRepository.findById(id).orElseThrow(() -> new RuntimeException("UserModel not found"));
        userModel.setSoftDeleted(true);
        userRepository.save(userModel);

    }

    @Override
    public void approveUpdate(UserModel userModel) {
        userModel.setUpdateRequestPending(false);
        userRepository.save(userModel);
    }
}
