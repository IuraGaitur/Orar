package com.example.entities;

import java.util.Date;

import android.R.bool;


public class Lesson {

	private int id;
	private String name;
	private int room;
	private Teacher teacher;
	private Date day;
	private bool odd;
	private String time;
	private Group group;
	private String typeLesson;
	
	public String getTypeLesson() {
		return typeLesson;
	}
	public void setTypeLesson(String typeLesson) {
		this.typeLesson = typeLesson;
	}
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
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public bool getOdd() {
		return odd;
	}
	public void setOdd(bool odd) {
		this.odd = odd;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	
	
	public Lesson(String name, int room, Teacher teacher, Date day, bool odd,
			String time, Group group) {
		super();
		this.name = name;
		this.room = room;
		this.teacher = teacher;
		this.day = day;
		this.odd = odd;
		this.time = time;
		this.group = group;
	}
	public Lesson(int id, String name, int room, Teacher teacher, Date day,
			bool odd, String time, Group group) {
		super();
		this.id = id;
		this.name = name;
		this.room = room;
		this.teacher = teacher;
		this.day = day;
		this.odd = odd;
		this.time = time;
		this.group = group;
	}
	
	
	
	
}
