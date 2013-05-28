package com.charlie.SpringDB.springJDBC.model;

import org.springframework.stereotype.Component;

@Component
public class Company {
	private int id;
	private String name;
	public Company(){
		
	}
	public Company(int id, String name){
		setId(id);
		setName(name);
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
}
