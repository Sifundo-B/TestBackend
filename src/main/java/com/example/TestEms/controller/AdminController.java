package com.example.TestEms.controller;

import com.example.TestEms.entity.UserModel;
import com.example.TestEms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public ResponseEntity<?> addEmployee(@RequestBody UserModel userModel) {
        userService.addEmployee(userModel);
        return ResponseEntity.ok("Employee added successfully.");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Long id) {
        userService.softDeleteEmployee(id);
        return ResponseEntity.ok("Employee deleted successfully.");
    }

    @PostMapping("/approve-update")
    public ResponseEntity<?> approveUpdate(@RequestBody UserModel userModel) {
        userService.approveUpdate(userModel);
        return ResponseEntity.ok("Update approved.");
    }

}
