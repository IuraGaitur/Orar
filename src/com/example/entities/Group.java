package com.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Group {

	private int id;
	private String name;
	private int year;
	private Speciality speciality;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Speciality getSpeciality() {
		return speciality;
	}
	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}
	
	public Group() {
		super();
	}
	public Group(String name, int year, Speciality speciality) {
		super();
		this.name = name;
		this.year = year;
		this.speciality = speciality;
	}
	
	
	
	
	
	
	
	
	
	
}
