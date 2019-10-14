package com.mysprhib.demos.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Games {
	@Id
	String name;
	String genre;
	String publisher;
	float rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
}
