package com.aplose.smooss.model;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY  )
	private long id;
	
	private String comment;
	private Instant createInstant; 
	private User author;
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Instant getCreateInstant() {
		return createInstant;
	}
	public void setCreateInstant(Instant createInstant) {
		this.createInstant = createInstant;
	}
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	
}
