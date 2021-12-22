package com.neosoft.service;

import java.text.DecimalFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.model.Employee;
import com.neosoft.model.Employeedto;
import com.neosoft.repos.EmpRepos;

@Service
public class EmpserviceImp implements EmpService {

	private static final DecimalFormat dfZero = new DecimalFormat("0.0");
	
	@Autowired
	private EmpRepos empRepos;
	
	   public Employee adddetails(Employee employee) {
	  
	 
	 return empRepos.save(employee); }
	 

	@Override
	 public Employee adddetails(Employeedto employee) {
	 //Employee employee2= employee.getEmployeedto();
		 
		//modify
		 Employee emp= new Employee();
		 emp.setCommunication(employee.getCommunication());
		 emp.setBasic_of_web_devlopment(employee.getBasic_of_web_devlopment());
		 emp.setOops_concept(employee.getOops_concept());
		 emp.setPrograming_language(employee.getPrograming_language());
		 emp.setVersion_control(employee.getVersion_control());
		 emp.setDatabase_concept(employee.getDatabase_concept());
		 emp.setBasic_concept(employee.getBasic_concept());
		 emp.setCoding(employee.getCoding());
		 emp.setAdvance_concept(employee.getAdvance_concept());
		 
		 
		 double sum=emp.getCommunication()+emp.getBasic_of_web_devlopment()+emp.getOops_concept()+emp.getPrograming_language()
		 +emp.getVersion_control()+emp.getDatabase_concept()+emp.getBasic_concept()+emp.getCoding()+emp.getAdvance_concept();
		 
		 emp.setAvg(Double.valueOf(dfZero.format(sum/9))  );
		 
		 if(emp.getAvg()>=3)
		 {
			 emp.setGrade("A(good)");
		 }else
			 if(emp.getAvg()<3)
			 {
				 emp.setGrade("B(Bad)");
			 }
			 
		 		 return empRepos.save(emp); 
		 		 }
	 
}
