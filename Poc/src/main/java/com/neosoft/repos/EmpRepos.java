package com.neosoft.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.model.Employee;

@Repository
public interface EmpRepos extends JpaRepository<Employee, Integer>{

}
