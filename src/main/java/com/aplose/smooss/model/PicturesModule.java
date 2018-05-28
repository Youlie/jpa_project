package com.aplose.smooss.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PicturesModule extends Module {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY  )
	private long id;

	private List<PicturesModule> picture;

	public List<PicturesModule> asList(PicturesModule[] picture) {

		List<PicturesModule> result = new ArrayList<PicturesModule>();
		for (PicturesModule pict : result) {

			result.add(pict);

		}
		return result;

	}

		public List<PicturesModule> getPicture() {
			return picture;
		}

//		public void setPicture(List<PicturesModule> picture) {
//			this.picture = picture;
//		}

}
