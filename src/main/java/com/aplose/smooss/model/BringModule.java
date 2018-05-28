package com.aplose.smooss.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BringModule extends Module {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY  )
	private long id;
	
	private TypeOfBring type;
	public TypeOfBring getType() {
		return type;
	}
	
	private String what;
	public String getWhat() {
		return what;
	}
	public void setWhat (String what) {
		this.what = what;
	}

	private String howMany;
	public String getHowMany() {
		return howMany;
	}
	public void setHowMany (String howmany) {
		this.howMany = howmany;
	}
	
	private String who;
	public String getWho() {
		return who;
	}
	public void setWho(String who) {
		this.who = who;
	}
	
	
}
