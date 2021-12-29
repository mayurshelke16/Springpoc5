package com.neosoft.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.model.Employee;
import com.neosoft.model.Employeedto;
import com.neosoft.model.Expereince;
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
	
	@GetMapping("/show")
	public ResponseEntity<List<Employee>> getData()
	{
		List<Employee> list=empService.getDetail();
		return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
		
	}
	
	@RequestMapping("/")
	public String getPage()
	{
		System.out.println("hi");
		return "index.html";
		
	}
	
	@PostMapping("/experience")
	public ResponseEntity<Expereince> insertData(@RequestBody Expereince expereince)
	{
		Expereince expereince2= empService.insertData(expereince);
		
		return new ResponseEntity<Expereince>(expereince2,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/exp")
	public ResponseEntity<List<Expereince>> getDetails(){
		List<Expereince> list= empService.getDetailsOfexpeince();
		return new ResponseEntity<List<Expereince>>(list,HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<List<Expereince>> getID(@PathVariable long E_id){
		List<Expereince> list= empService.geDetaiByID(E_id);
		return new ResponseEntity<List<Expereince>>(list,HttpStatus.OK);
		
	}
}
