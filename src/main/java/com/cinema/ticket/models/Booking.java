package com.cinema.ticket.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author Prabhakar Jha
 *
 */
@Entity
@Table(name="booking")
public class Booking implements Serializable{
	
	private static final long serialVersionUID = -4238617932918891603L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String movieName;
	@Column
	private int totalTicketsCount;
	@ManyToOne
	@JoinColumn(name="mov_id")
	private Movie movie;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getTotalTicketsCount() {
		return totalTicketsCount;
	}
	public void setTotalTicketsCount(int totalTicketsCount) {
		this.totalTicketsCount = totalTicketsCount;
	}
	
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
}
