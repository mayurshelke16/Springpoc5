package com.neosoft.service;

import java.util.List;

import com.neosoft.model.Employee;
import com.neosoft.model.Employeedto;
import com.neosoft.model.Expereince;

public interface EmpService {

	Employee adddetails(Employeedto employee);

	List<Employee> getDetail();

	Expereince insertData(Expereince expereince);

	List<Expereince> getDetailsOfexpeince();

	List<Expereince> geDetaiByID(long E_id);

	
}
