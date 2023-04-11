package com.gp.MyApp.ent;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contacts {
	@Id
	private String name;
	private long number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	
	
	
	
	
	
	
	
	

}
