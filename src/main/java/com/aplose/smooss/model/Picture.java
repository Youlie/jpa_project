package com.aplose.smooss.model;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Picture Class, create a picture.
 * @author Smooss Team
 * Last revision Martin M.
 */
@Entity
public class Picture {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY  )
	private long id;

	private Image picture;
	private String name;
	private String description;
	private User author;
	private List<Comment> comments = new ArrayList<Comment>();
	
	public Picture(Image picture, String name, String description, User author){
		this.picture = picture;
		this.name = name;
		this.description = description;
		this.author = author;
	}
	
	public Image getPicture(){
		return picture;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		this.name = newName;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String newDescription){
		this.description = newDescription;
	}
	
	public User getAuthor(){
		return author;
	}
	
	public List<Comment> getComments(){
		return comments;
		
	}
	
}
