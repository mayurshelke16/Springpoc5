package com.neosoft.model;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class Topics {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE )
	private long T_id;
	private String langauge;
	private double version;

	private long E_id;
	
     @OneToMany
	List<Subtopic> subtopic= new ArrayList<>();

	public long getT_id() {
		return T_id;
	}

	public void setT_id(long t_id) {
		T_id = t_id;
	}

	public String getLangauge() {
		return langauge;
	}

	public void setLangauge(String langauge) {
		this.langauge = langauge;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public long getE_id() {
		return E_id;
	}

	public void setE_id(long e_id) {
		E_id = e_id;
	}

	public List<Subtopic> getSubtopic() {
		return subtopic;
	}

	public void setSubtopic(List<Subtopic> subtopic) {
		this.subtopic = subtopic;
	}
     
     
}
