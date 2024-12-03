package com.sample.demo1.controller;

import com.sample.demo1.dto.DeptDTO;
import com.sample.demo1.entity.Department;
import com.sample.demo1.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.FOUND;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    DeptService deptService;

    @PostMapping
    public ResponseEntity<Department> addDept(@RequestBody DeptDTO deptDTO) {
        return new ResponseEntity<Department>(deptService.addDept(deptDTO), CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Department>> getAllDept() {
        return new ResponseEntity<List<Department>>(deptService.getAllDept(), FOUND);
    }
}
