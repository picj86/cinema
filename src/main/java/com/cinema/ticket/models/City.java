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
 * The persistent class for the city database table.
 * 
 * @author Prabhakar Jha
 *
 */

@Entity
@NamedQuery(name = "City.findAll", query = "SELECT c FROM City c")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	// bi-directional many-to-one association to Cinema
	@OneToMany(mappedBy = "cityBean")
	private List<Cinema> cinemas;

	// bi-directional many-to-one association to State
	@ManyToOne
	@JoinColumn(name = "state")
	private State stateBean;

	// bi-directional many-to-one association to Customer
	@OneToMany(mappedBy = "cityBean")
	private List<Customer> customers;

	public City() {
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

	public List<Cinema> getCinemas() {
		return this.cinemas;
	}

	public void setCinemas(List<Cinema> cinemas) {
		this.cinemas = cinemas;
	}

	public Cinema addCinema(Cinema cinema) {
		getCinemas().add(cinema);
		cinema.setCityBean(this);

		return cinema;
	}

	public Cinema removeCinema(Cinema cinema) {
		getCinemas().remove(cinema);
		cinema.setCityBean(null);

		return cinema;
	}

	public State getStateBean() {
		return this.stateBean;
	}

	public void setStateBean(State stateBean) {
		this.stateBean = stateBean;
	}

	public List<Customer> getCustomers() {
		return this.customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Customer addCustomer(Customer customer) {
		getCustomers().add(customer);
		customer.setCityBean(this);

		return customer;
	}

	public Customer removeCustomer(Customer customer) {
		getCustomers().remove(customer);
		customer.setCityBean(null);

		return customer;
	}

}