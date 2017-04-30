package com.cinema.ticket.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the timetable database table.
 * 
 */
@Entity
@NamedQuery(name="Timetable.findAll", query="SELECT t FROM Timetable t")
public class Timetable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date slot;

	//bi-directional many-to-one association to Booking
	@OneToMany(mappedBy="timetableBean")
	private List<Booking> bookings;

	//bi-directional many-to-one association to Screen
	@ManyToOne
	@JoinColumn(name="screen")
	private Screen screenBean;

	public Timetable() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getSlot() {
		return this.slot;
	}

	public void setSlot(Date slot) {
		this.slot = slot;
	}

	public List<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public Booking addBooking(Booking booking) {
		getBookings().add(booking);
		booking.setTimetableBean(this);

		return booking;
	}

	public Booking removeBooking(Booking booking) {
		getBookings().remove(booking);
		booking.setTimetableBean(null);

		return booking;
	}

	public Screen getScreenBean() {
		return this.screenBean;
	}

	public void setScreenBean(Screen screenBean) {
		this.screenBean = screenBean;
	}

}