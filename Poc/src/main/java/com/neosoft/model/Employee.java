package com.neosoft.model;

import java.text.DecimalFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private float communication;
	private float basic_of_web_devlopment;
	private float oops_concept;
	private float programing_language;
	private float version_control;
	private float database_concept;
	private float basic_concept;
	private float coding;
	private float advance_concept;
	
	private double avg;

	private String grade;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getCommunication() {
		return communication;
	}

	public void setCommunication(float communication) {
		this.communication = communication;
	}

	public float getBasic_of_web_devlopment() {
		return basic_of_web_devlopment;
	}

	public void setBasic_of_web_devlopment(float basic_of_web_devlopment) {
		this.basic_of_web_devlopment = basic_of_web_devlopment;
	}

	public float getOops_concept() {
		return oops_concept;
	}

	public void setOops_concept(float oops_concept) {
		this.oops_concept = oops_concept;
	}

	public float getPrograming_language() {
		return programing_language;
	}

	public void setPrograming_language(float programing_language) {
		this.programing_language = programing_language;
	}

	public float getVersion_control() {
		return version_control;
	}

	public void setVersion_control(float version_control) {
		this.version_control = version_control;
	}

	public float getDatabase_concept() {
		return database_concept;
	}

	public void setDatabase_concept(float database_concept) {
		this.database_concept = database_concept;
	}

	public float getBasic_concept() {
		return basic_concept;
	}

	public void setBasic_concept(float basic_concept) {
		this.basic_concept = basic_concept;
	}

	public float getCoding() {
		return coding;
	}

	public void setCoding(float coding) {
		this.coding = coding;
	}

	public float getAdvance_concept() {
		return advance_concept;
	}

	public void setAdvance_concept(float advance_concept) {
		this.advance_concept = advance_concept;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	
}
