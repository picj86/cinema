package com.cinema.ticket.models;

import java.io.Serializable;
import java.util.Date;

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
@Table(name="schedule")
public class Schedule implements Serializable{
	
	private static final long serialVersionUID = 1883156224937688714L;
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Integer room_id;
	private Date startDate;
	private Date enddate;
	private Integer movieid;
	private Integer room_no;
	@ManyToOne
	@JoinColumn(name="show_id")
	private ShowTime showTime;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRoom_id() {
		return room_id;
	}
	public void setRoom_id(Integer room_id) {
		this.room_id = room_id;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public Integer getMovieid() {
		return movieid;
	}
	public void setMovieid(Integer movieid) {
		this.movieid = movieid;
	}
	public Integer getRoom_no() {
		return room_no;
	}
	public void setRoom_no(Integer room_no) {
		this.room_no = room_no;
	}
	public ShowTime getShowTime() {
		return showTime;
	}
	public void setShowTime(ShowTime showTime) {
		this.showTime = showTime;
	}
}
