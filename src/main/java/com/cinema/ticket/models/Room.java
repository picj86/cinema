/**
 * 
 */
package com.cinema.ticket.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Prabhakar Jha
 *
 */
@Entity
@Table(name="room")
public class Room implements Serializable{
	private static final long serialVersionUID = 2434579385603809176L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String seatplan;
	
	@OneToMany
	@JoinColumn(name="movie_id")
	private Collection<Movie> movie= new ArrayList<Movie>();
	
	@OneToMany
	@JoinColumn(name="room_id")
	private Collection<Seat> seat = new ArrayList<Seat>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSeatplan() {
		return seatplan;
	}
	public void setSeatplan(String seatplan) {
		this.seatplan = seatplan;
	}
	public Collection<Seat> getSeat() {
		return seat;
	}
	public void setSeat(Collection<Seat> seat) {
		this.seat = seat;
	}
}
