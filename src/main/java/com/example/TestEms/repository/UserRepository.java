package com.example.TestEms.repository;

import com.example.TestEms.entity.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    List<UserModel> findBySoftDeletedFalse();
    List<UserModel> findByUpdateRequestPendingTrue();

}
