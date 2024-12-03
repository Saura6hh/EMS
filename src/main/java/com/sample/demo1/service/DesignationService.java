package com.sample.demo1.service;

import com.sample.demo1.dto.DesignationDTO;
import com.sample.demo1.entity.Designation;
import com.sample.demo1.repo.DesignationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DesignationService {
    @Autowired
    DesignationRepo designationRepo;

    public Designation addDesignation(DesignationDTO designationDTO){
        Designation designation = new Designation();
        designation.setDesignationName(designationDTO.getDesignationName());

        designation.setActive(true);
        designation.setCreatedBy(designationDTO.getCreatedBy());
        designation.setUpdatedBy(designationDTO.getUpdatedBy());
        designation.setCreatedDate(LocalDateTime.now());
        designation.setUpdatedDate(LocalDateTime.now());

        return designationRepo.save(designation);
    }

    public List<Designation> getAllDesignations(){
        return designationRepo.findAll();
    }
}
