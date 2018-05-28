package com.aplose.smooss.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Playlist {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY  )
	private long id;
	
	private List<String> urls;
	private MusicGenre genre;
	
	
	public MusicGenre getGenre() {
		return genre;
	}
	
	public void setGenre(MusicGenre genre) {
		this.genre = genre;
	}
	
	public List<String> getUrls() {
		return urls;
	}
	
}
