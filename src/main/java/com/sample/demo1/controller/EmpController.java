package com.sample.demo1.controller;

import com.sample.demo1.dto.EmpDTO;
import com.sample.demo1.entity.Employee;
import com.sample.demo1.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/ems")
public class EmpController {
    @Autowired
    EmpService empService;

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody EmpDTO empDTO){
        return new ResponseEntity<Employee>(empService.addEmp(empDTO),CREATED);
    }
}
