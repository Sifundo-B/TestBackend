package com.example.TestEms.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Getter
@Setter
@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date dateOfBirth;

    @NonNull
    private String idNumber;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date startDate;

    @NonNull
    private String address;

    @NonNull
    private String phoneNumber;

    @NonNull
    private String image;

    @NonNull
    private String gender;

    @NonNull
    private String password;

    @NonNull
    private String email;

    @NonNull
    private String emergencyContactName;

    @NonNull
    private String emergencyContactRelationship;

    @NonNull
    private String emergencyContactNo;

    private boolean softDeleted = false;

    private boolean updateRequestPending = false;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private Department department;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "position_id")
    private Position position;
}
