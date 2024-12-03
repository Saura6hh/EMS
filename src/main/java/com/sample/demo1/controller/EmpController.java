package com.sample.demo1.controller;

import com.sample.demo1.dto.EmpDTO;
import com.sample.demo1.entity.Employee;
import com.sample.demo1.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.FOUND;

@RestController
@RequestMapping("/ems")
public class EmpController {
    @Autowired
    EmpService empService;

    @PostMapping
    public ResponseEntity<Employee> addEmployee(@RequestBody EmpDTO empDTO){
        return new ResponseEntity<Employee>(empService.addEmp(empDTO),CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmp(){
        return new ResponseEntity<List<Employee>>(empService.getAllEmp(),FOUND);
    }
}
