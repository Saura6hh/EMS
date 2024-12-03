package com.sample.demo1.service;

import com.sample.demo1.dto.EmpDTO;
import com.sample.demo1.entity.Employee;
import com.sample.demo1.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmpService {

    @Autowired
    EmployeeRepo employeeRepo;

    public Employee addEmp(EmpDTO empDTO) {
        Employee employee = new Employee();
        employee.setFirstName(empDTO.getFirstName());
        employee.setLastName(empDTO.getLastName());
        employee.setActive(true);
        employee.setMail(empDTO.getMail());
        employee.setAddress(empDTO.getAddress());
        employee.setMobNo(empDTO.getMobNo());
        employee.setCreatedBy(empDTO.getCreatedBy());
        employee.setJoinDate(empDTO.getJoinDate());
        employee.setUpdatedBy(empDTO.getUpdatedBy());
        employee.setCreatedDate(LocalDateTime.now());
        employee.setUpdatedDate(LocalDateTime.now());

        return employeeRepo.save(employee);
    }
}
