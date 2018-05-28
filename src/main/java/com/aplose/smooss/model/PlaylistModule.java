package com.aplose.smooss.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Class PlaylistModule that will manage the playlist for an event
 * @author tomas
 *
 */
@Entity
public class PlaylistModule extends Module {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY  )
	private long id;
	
	private List<Playlist> playlists;

	public List<Playlist> getPlaylists() {
		return playlists;
	}
	
}
