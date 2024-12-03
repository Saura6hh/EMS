package com.sample.demo1.controller;

import com.sample.demo1.dto.DesignationDTO;
import com.sample.demo1.entity.Designation;
import com.sample.demo1.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.FOUND;

@RestController
@RequestMapping("/dsgn")
public class DesignationController {
    @Autowired
    DesignationService designationService;

    @PostMapping
    public ResponseEntity<Designation> addEntity(@RequestBody DesignationDTO designationDTO){
        return new ResponseEntity<Designation>(designationService.addDesignation(designationDTO),CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Designation>> getEntities(){
        return new ResponseEntity<List<Designation>>(designationService.getAllDesignations(),FOUND);
    }
}
