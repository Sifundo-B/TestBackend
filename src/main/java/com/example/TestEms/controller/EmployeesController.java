package com.example.TestEms.controller;

import com.example.TestEms.entity.UserModel;
import com.example.TestEms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/employees")
@CrossOrigin("*")
public class EmployeesController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserModel> getAllEmployees() {
        return userService.getAllEmployees();
    }

    @PostMapping("/request-update")
    public ResponseEntity<?> requestUpdate(@RequestBody UserModel userModel) {
        userService.requestUpdate(userModel);
        return ResponseEntity.ok("Update request submitted.");
    }

    @PostMapping("/upload-image")
    public ResponseEntity<?> uploadImage(@RequestParam("image") MultipartFile image) {
        // Handle image upload logic here
        return ResponseEntity.ok("Image uploaded successfully.");
    }
}

