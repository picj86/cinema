/**
 * 
 */
package com.cinema.ticket.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

/**
 * @author Prabhakar Jha
 *
 */
@Entity
@NamedQuery(name = "Review.findAll", query = "SELECT r FROM Review r")
public class Review implements Serializable {

	private static final long serialVersionUID = 1566572546892573350L;
	private Long id;
	private Float raiting;
	private String comments;
	
	@ManyToOne
	@JoinColumn(name = "customer_review")
	private Customer customer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getRaiting() {
		return raiting;
	}

	public void setRaiting(Float raiting) {
		this.raiting = raiting;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
