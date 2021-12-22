package com.neosoft.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.model.Employee;
import com.neosoft.model.Employeedto;
import com.neosoft.service.EmpService;


@RestController
public class Controller {

	
	@Autowired
	private EmpService empService;
	
	@PostMapping("/add")
	public ResponseEntity<Employee> addAdmin( @RequestBody Employeedto employee)
	{
		
		Employee employee2=empService.adddetails(employee);
		return new ResponseEntity<Employee>(employee2,HttpStatus.CREATED);
		
	}
}
