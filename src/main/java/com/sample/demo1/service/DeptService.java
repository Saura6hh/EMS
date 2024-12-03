package com.sample.demo1.service;

import com.sample.demo1.dto.DeptDTO;
import com.sample.demo1.entity.Department;
import com.sample.demo1.repo.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeptService {
    @Autowired
    DepartmentRepo departmentRepo;

    public Department addDept(DeptDTO deptDTO) {
        Department department = new Department();
        department.setDepartmentName(deptDTO.getDepartmentName());

        department.setActive(true);
        department.setCreatedBy(deptDTO.getCreatedBy());
        department.setUpdatedBy(deptDTO.getUpdatedBy());
        department.setCreatedDate(LocalDateTime.now());
        department.setUpdatedDate(LocalDateTime.now());

        return departmentRepo.save(department);
    }

    public List<Department> getAllDept(){
        return departmentRepo.findAll();
    }
}
