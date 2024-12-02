package com.sample.demo1.repo;

import com.sample.demo1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Long> {

}
