package com.neosoft.model;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Expereince {

	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE)
	private long E_id;
	private String name;
	private int no_of_years;
	
	@OneToMany
	  List<Topics> topics= new  ArrayList<>();

	

	public long getE_id() {
		return E_id;
	}

	public void setE_id(long e_id) {
		E_id = e_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo_of_years() {
		return no_of_years;
	}

	public void setNo_of_years(int no_of_years) {
		this.no_of_years = no_of_years;
	}

	public List<Topics> getTopics() {
		return topics;
	}

	public void setTopics(List<Topics> topics) {
		this.topics = topics;
	}
	  
	  
}
