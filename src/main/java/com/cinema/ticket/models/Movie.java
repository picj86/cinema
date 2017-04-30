/**
 * 
 */
package com.cinema.ticket.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the movie database table.
 * 
 * @author Prabhakar Jha
 *
 */

@Entity
@Table(name="movie")
public class Movie implements Serializable{
	
	private static final long serialVersionUID = 7503989258278036117L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String image;
	private String story;
	private Integer raiting;
	private String trailer;
	@ManyToOne
	@JoinColumn(name="cat_id")
	private Category category;
	@Column
	private String actor;
	@Column
	private String author;
	@Column
	private String year;
	@Column
	private Date createdOn = new Date();
	
	@OneToMany
	@JoinColumn(name="mov_id")
	private Collection<Screen> room = new ArrayList<Screen>();
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public Collection<Screen> getRoom() {
		return room;
	}
	public void setRoom(Collection<Screen> room) {
		this.room = room;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public Integer getRaiting() {
		return raiting;
	}
	public void setRaiting(Integer raiting) {
		this.raiting = raiting;
	}
	public String getTrailer() {
		return trailer;
	}
	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
}
