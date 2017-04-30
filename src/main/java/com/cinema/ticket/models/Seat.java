/**
 * 
 */
package com.cinema.ticket.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Prabhakar Jha
 *
 */
@Entity
@Table(name="seat")
public class Seat implements Serializable{

	private static final long serialVersionUID = 4581838399900461884L;
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column
	private String reserved;
	@Column
	private String paid;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getReserved() {
		return reserved;
	}
	public void setReserved(String reserved) {
		this.reserved = reserved;
	}
	public String getPaid() {
		return paid;
	}
	public void setPaid(String paid) {
		this.paid = paid;
	}
}
