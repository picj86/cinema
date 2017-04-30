/**
 * 
 */
package com.cinema.ticket.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * The persistent class for the screen database table.
 * 
 * @author Prabhakar Jha
 * 
 */
@Entity
@NamedQuery(name = "Screen.findAll", query = "SELECT s FROM Screen s")
public class Screen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String seatplan;

	// bi-directional many-to-one association to Booking
	@OneToMany(mappedBy = "screenBean")
	private List<Booking> bookings;

	// bi-directional many-to-one association to Cinema
	@ManyToOne
	@JoinColumn(name = "cinema")
	private Cinema cinemaBean;

	// bi-directional many-to-one association to Timetable
	@OneToMany(mappedBy = "screenBean")
	private List<Timetable> timetables;

	public Screen() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeatplan() {
		return this.seatplan;
	}

	public void setSeatplan(String seatplan) {
		this.seatplan = seatplan;
	}

	public List<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public Booking addBooking(Booking booking) {
		getBookings().add(booking);
		booking.setScreenBean(this);

		return booking;
	}

	public Booking removeBooking(Booking booking) {
		getBookings().remove(booking);
		booking.setScreenBean(null);

		return booking;
	}

	public Cinema getCinemaBean() {
		return this.cinemaBean;
	}

	public void setCinemaBean(Cinema cinemaBean) {
		this.cinemaBean = cinemaBean;
	}

	public List<Timetable> getTimetables() {
		return this.timetables;
	}

	public void setTimetables(List<Timetable> timetables) {
		this.timetables = timetables;
	}

	public Timetable addTimetable(Timetable timetable) {
		getTimetables().add(timetable);
		timetable.setScreenBean(this);

		return timetable;
	}

	public Timetable removeTimetable(Timetable timetable) {
		getTimetables().remove(timetable);
		timetable.setScreenBean(null);

		return timetable;
	}

}