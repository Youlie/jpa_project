package com.aplose.smooss.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CarPoolingModule extends Module {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY  )
	private long id;

	private List<String> carPooling;

	public List<String> getCarPooling() {
		return carPooling;
	}
	
	
	
	
}
