package com.sample.demo1.repo;

import com.sample.demo1.entity.Designation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesignationRepo extends JpaRepository<Designation,Long> {

}
