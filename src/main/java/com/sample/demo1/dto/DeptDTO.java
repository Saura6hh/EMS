package com.sample.demo1.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DeptDTO {
    private String departmentName;

    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;
}
