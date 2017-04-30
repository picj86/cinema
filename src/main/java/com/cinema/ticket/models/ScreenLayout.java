/**
 * 
 */
package com.cinema.ticket.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

/**
 * The persistent class for the ScreenLayout database table.
 * 
 * @author Prabhakar Jha
 *
 */
@Entity
@NamedQuery(name="ScreenLayout.findAll", query="SELECT s FROM ScreenLayout s")
public class ScreenLayout implements Serializable{

	private static final long serialVersionUID = -1551617353296309269L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // Column id
	private String rowName; // A, B, C ... Z

	private Screen screenDetail;

	@ManyToOne
	@JoinColumn(name = "seatBean")
	private Seat seat;

	public String getRowName() {
		return rowName;
	}

	public void setRowName(String rowName) {
		this.rowName = rowName;
	}

	public Screen getScreenDetail() {
		return screenDetail;
	}

	public void setScreenDetail(Screen screenDetail) {
		this.screenDetail = screenDetail;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

}
