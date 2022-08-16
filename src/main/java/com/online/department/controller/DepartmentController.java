package com.online.department.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.department.entity.Department;
import com.online.department.service.DepartmentService;


@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/")
	public List<Department> getAll(){
		List<Department> list =   departmentService.getAll();
		System.out.println(list);
		return list;
	}
	
	@GetMapping("/{id}")
	public Optional<Department> findbyId(@PathVariable("id") Long id){
		Optional<Department> list =   departmentService.findById(id);
		System.out.println(list);
		return list;
	}

}
