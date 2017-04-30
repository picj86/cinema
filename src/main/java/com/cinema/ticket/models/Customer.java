package com.cinema.ticket.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the customer database table.
 * 
 * @author Prabhakar Jha
 * 
 */
@Entity
@NamedQuery(name="Customer.findAll", query="SELECT c FROM Customer c")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String address;

	@Temporal(TemporalType.DATE)
	private Date createdon;

	private String emailid;

	private String firstname;

	private String lastname;

	@Temporal(TemporalType.DATE)
	private Date lastvisted;

	private String middlename;

	@Temporal(TemporalType.DATE)
	private Date modifiedon;

	private int noofvisit;

	private String password;

	private String phoneno;

	private String username;

	//bi-directional many-to-one association to Booking
	@OneToMany(mappedBy="customerBean")
	private List<Booking> bookings;

	//bi-directional many-to-one association to City
	@ManyToOne
	@JoinColumn(name="city")
	private City cityBean;

	public Customer() {
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

	public Date getCreatedon() {
		return this.createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public String getEmailid() {
		return this.emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getLastvisted() {
		return this.lastvisted;
	}

	public void setLastvisted(Date lastvisted) {
		this.lastvisted = lastvisted;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public Date getModifiedon() {
		return this.modifiedon;
	}

	public void setModifiedon(Date modifiedon) {
		this.modifiedon = modifiedon;
	}

	public int getNoofvisit() {
		return this.noofvisit;
	}

	public void setNoofvisit(int noofvisit) {
		this.noofvisit = noofvisit;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneno() {
		return this.phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public Booking addBooking(Booking booking) {
		getBookings().add(booking);
		booking.setCustomerBean(this);

		return booking;
	}

	public Booking removeBooking(Booking booking) {
		getBookings().remove(booking);
		booking.setCustomerBean(null);

		return booking;
	}

	public City getCityBean() {
		return this.cityBean;
	}

	public void setCityBean(City cityBean) {
		this.cityBean = cityBean;
	}

}