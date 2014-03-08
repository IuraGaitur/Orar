package com.example.testerfunction;

public class Pereche {

	int id;
	String name;
	Profesor profesorul;
	int room;
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
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
	public Profesor getProfesorul() {
		return profesorul;
	}
	public void setProfesorul(Profesor profesorul) {
		this.profesorul = profesorul;
	}
	String tipPereche;
	public String getTipPereche() {
		return tipPereche;
	}
	public void setTipPereche(String tipPereche) {
		this.tipPereche = tipPereche;
	}
	@Override
	public String toString() {
		return "Pereche [id=" + id + ", name=" + name + ", profesorul="
				+ profesorul + ", tipPereche=" + tipPereche + "]";
	}
	public Pereche(int id, String name, Profesor profesorul, String tipPereche) {
		super();
		this.id = id;
		this.name = name;
		this.profesorul = profesorul;
		this.tipPereche = tipPereche;
	}
	public Pereche(String name, Profesor profesorul, String tipPereche,int room) {
		super();
		this.name = name;
		this.profesorul = profesorul;
		this.tipPereche = tipPereche;
		this.room = room;
	}
	public Pereche() {
		super();
		this.id = 0;
		this.name = "";
		this.profesorul = null;
	}
	
	
}
