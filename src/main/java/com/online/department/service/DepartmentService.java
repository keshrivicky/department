package com.online.department.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.department.entity.Department;
import com.online.department.repo.DepartmentRepo;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	
	public List<Department> getAll(){
		List<Department> list = departmentRepo.findAll();
		return list;
	}


	public Optional<Department> findById(Long id) {
		Optional<Department> list=  departmentRepo.findById(id);
		return list;
	}

}
