package com.example.testerfunction;

import java.util.ArrayList;
import java.util.List;

public class Grupa {

	private int id;
	private String name;
	private int anul;
	private List<Pereche> list;
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
	public int getAnul() {
		return anul;
	}
	public void setAnul(int anul) {
		this.anul = anul;
	}
	public List<Pereche> getList() {
		return list;
	}
	public void setList(List<Pereche> list) {
		this.list = list;
	}
	public Grupa(int id, String name, int anul, List<Pereche> list) {
		super();
		this.id = id;
		this.name = name;
		this.anul = anul;
		this.list = list;
	}
	public Grupa(String name, int anul, List<Pereche> list) {
		super();
		this.name = name;
		this.anul = anul;
		this.list = list;
	}
	public Grupa() {
		this.id = 0;
		this.anul = 1;
		this.name = "Unknown";
		this.list = new ArrayList<Pereche>();
	}
	
	
	
	
	
	
	
}
