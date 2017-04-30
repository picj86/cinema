package com.cinema.ticket.models;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author Prabhakar Jha
 *
 */
@Entity
@Table(name="showtime")
public class ShowTime implements Serializable{

	private static final long serialVersionUID = -7758019614243061966L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Integer interval;
	private Timestamp slot;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getInterval() {
		return interval;
	}
	public void setInterval(Integer interval) {
		this.interval = interval;
	}
	public Timestamp getSlot() {
		return slot;
	}
	public void setSlot(Timestamp slot) {
		this.slot = slot;
	}
}
