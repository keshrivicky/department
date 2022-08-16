package com.online.department.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.department.entity.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
