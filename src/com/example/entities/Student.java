package com.example.entities;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private boolean gender;
	private Group group;
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Student(String name, int age, boolean gender, Group group) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.group = group;
	}

	public Student(int id, String name, int age, boolean gender, Group group) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.group = group;
	}
	
	

}
