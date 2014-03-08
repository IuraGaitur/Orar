package com.example.entities;

public class Teacher {

	int id;
	String name;
	String description;
	int age;
	String rangul;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRangul() {
		return rangul;
	}
	public void setRangul(String rangul) {
		this.rangul = rangul;
	}
	public Teacher(int id, String name, String description, int age,
			String rangul) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.age = age;
		this.rangul = rangul;
	}
	public Teacher(String name, String description, int age, String rangul) {
		super();
		this.name = name;
		this.description = description;
		this.age = age;
		this.rangul = rangul;
	}
	public Teacher() {
		super();
	}
	
	
	
}
