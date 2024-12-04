package com.sample.demo1.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmpDTO {
    private String firstName;
    private String lastName;
    private String mobNo;
    private String address;
    private String joinDate;
    private String mail;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
}
