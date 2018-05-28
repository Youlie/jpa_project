package com.aplose.smooss.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Module {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY  )
	private long id;
	
	Event event;
	
	private String name = "Default Module Name";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}