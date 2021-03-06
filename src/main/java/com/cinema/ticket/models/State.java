package com.cinema.ticket.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the state database table.
 * 
 * @author Prabhakar Jha
 * 
 */
@Entity
@NamedQuery(name="State.findAll", query="SELECT s FROM State s")
public class State implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	//bi-directional many-to-one association to City
	@OneToMany(mappedBy="stateBean")
	private List<City> cities;

	//bi-directional many-to-one association to Country
	@ManyToOne
	@JoinColumn(name="country")
	private Country countryBean;

	public State() {
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

	public List<City> getCities() {
		return this.cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public City addCity(City city) {
		getCities().add(city);
		city.setStateBean(this);

		return city;
	}

	public City removeCity(City city) {
		getCities().remove(city);
		city.setStateBean(null);

		return city;
	}

	public Country getCountryBean() {
		return this.countryBean;
	}

	public void setCountryBean(Country countryBean) {
		this.countryBean = countryBean;
	}

}