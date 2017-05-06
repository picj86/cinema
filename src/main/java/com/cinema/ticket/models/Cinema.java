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
 * The persistent class for the cinema database table.
 * 
 * @author Prabhakar Jha
 * 
 */
@Entity
@NamedQuery(name = "Cinema.findAll", query = "SELECT c FROM Cinema c")
public class Cinema implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	private String address;

	private int capacity;

	private int totalscreen;

	private String municipal;

	private int goldrate;

	private int platinumrate;

	private int silverrate;

	private String telephone;

	private String fax;

	private String manager;

	@Temporal(TemporalType.DATE)
	private Date establishdate = new Date();
	
	// one-to-one association to City
		
	private City cityBean;

	/*// bi-directional many-to-one association to Booking
	@OneToMany(mappedBy = "cinemaBean")
	private List<Booking> bookings;

	

	// bi-directional many-to-one association to Screen
	@OneToMany(mappedBy = "cinemaBean")
	private List<Screen> screens;*/

	public Cinema() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Date getEstablishdate() {
		return this.establishdate;
	}

	public void setEstablishdate(Date establishdate) {
		this.establishdate = establishdate;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public int getGoldrate() {
		return this.goldrate;
	}

	public void setGoldrate(int goldrate) {
		this.goldrate = goldrate;
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getMunicipal() {
		return this.municipal;
	}

	public void setMunicipal(String municipal) {
		this.municipal = municipal;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlatinumrate() {
		return this.platinumrate;
	}

	public void setPlatinumrate(int platinumrate) {
		this.platinumrate = platinumrate;
	}

	public int getSilverrate() {
		return this.silverrate;
	}

	public void setSilverrate(int silverrate) {
		this.silverrate = silverrate;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getTotalscreen() {
		return this.totalscreen;
	}

	public void setTotalscreen(int totalscreen) {
		this.totalscreen = totalscreen;
	}

	/*public List<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public Booking addBooking(Booking booking) {
		getBookings().add(booking);
		booking.setCinemaBean(this);

		return booking;
	}

	public Booking removeBooking(Booking booking) {
		getBookings().remove(booking);
		booking.setCinemaBean(null);

		return booking;
	}

	public City getCityBean() {
		return this.cityBean;
	}

	public void setCityBean(City cityBean) {
		this.cityBean = cityBean;
	}

	public List<Screen> getScreens() {
		return this.screens;
	}

	public void setScreens(List<Screen> screens) {
		this.screens = screens;
	}

	public Screen addScreen(Screen screen) {
		getScreens().add(screen);
		screen.setCinemaBean(this);

		return screen;
	}

	public Screen removeScreen(Screen screen) {
		getScreens().remove(screen);
		screen.setCinemaBean(null);

		return screen;
	}
*/
}