package com.example.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Orarul {
	private Integer id;
	private Boolean para;
	private List<Grupa> list;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getPara() {
		return para;
	}
	public void setPara(Boolean para) {
		this.para = para;
	}
	public List<Grupa> getList() {
		return list;
	}
	public void setList(List<Grupa> list){
		this.list = list;
	}
	
	
	
	
	
	public Orarul() {
		this.id = 0;
		this.para = false;
		this.list = new ArrayList<Grupa>(); 
	}
	
	public Orarul(Boolean para, List<Grupa> list) {
		super();
		this.para = para;
		this.list = list;
	}
	public Orarul(Integer id, Boolean para, List<Grupa> list) {
		super();
		this.id = id;
		this.para = para;
		this.list = list;
	}
	
	
	
	

}
