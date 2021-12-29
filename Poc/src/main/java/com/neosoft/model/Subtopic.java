package com.neosoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subtopic {
	
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private long S_id;
    private String point;
    private String data_type;
    
    private long T_id;

	

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public String getData_type() {
		return data_type;
	}

	public void setData_type(String data_type) {
		this.data_type = data_type;
	}

	public long getS_id() {
		return S_id;
	}

	public void setS_id(long s_id) {
		S_id = s_id;
	}

	public long getT_id() {
		return T_id;
	}

	public void setT_id(long t_id) {
		T_id = t_id;
	}

	
    
    
}
