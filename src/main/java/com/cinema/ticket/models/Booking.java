package com.cinema.ticket.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the booking database table.
 * 
 * @author Prabhakar Jha
 * 
 */
@Entity
@NamedQuery(name = "Booking.findAll", query = "SELECT b FROM Booking b")
public class Booking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int amount;

	private int quantity;

	private String seat;

	@Temporal(TemporalType.TIMESTAMP)
	private Date showdate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date solddate;

	// bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name = "customer")
	private Customer customerBean;

	// bi-directional many-to-one association to Cinema
	@ManyToOne
	@JoinColumn(name = "cinema")
	private Cinema cinemaBean;

	// bi-directional many-to-one association to Screen
	@ManyToOne
	@JoinColumn(name = "screen")
	private Screen screenBean;

	// bi-directional many-to-one association to Timetable
	@ManyToOne
	@JoinColumn(name = "timetable")
	private Timetable timetableBean;

	public Booking() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSeat() {
		return this.seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public Date getShowdate() {
		return this.showdate;
	}

	public void setShowdate(Date showdate) {
		this.showdate = showdate;
	}

	public Date getSolddate() {
		return this.solddate;
	}

	public void setSolddate(Date solddate) {
		this.solddate = solddate;
	}

	public Customer getCustomerBean() {
		return this.customerBean;
	}

	public void setCustomerBean(Customer customerBean) {
		this.customerBean = customerBean;
	}

	public Cinema getCinemaBean() {
		return this.cinemaBean;
	}

	public void setCinemaBean(Cinema cinemaBean) {
		this.cinemaBean = cinemaBean;
	}

	public Screen getScreenBean() {
		return this.screenBean;
	}

	public void setScreenBean(Screen screenBean) {
		this.screenBean = screenBean;
	}

	public Timetable getTimetableBean() {
		return this.timetableBean;
	}

	public void setTimetableBean(Timetable timetableBean) {
		this.timetableBean = timetableBean;
	}

}