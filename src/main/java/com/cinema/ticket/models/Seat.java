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
import javax.persistence.NamedQuery;

/**
 * The persistent class for the seat database table.
 * 
 * @author Prabhakar Jha
 *
 */
@Entity
@NamedQuery(name = "Seat.findAll", query = "SELECT s FROM Seat s")
public class Seat implements Serializable {

	private static final long serialVersionUID = 4581838399900461884L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String rowName;

	private String colName;

	@Column
	private String reserved;
	@Column
	private String paid;

	private ScreenLayout scrrenlayout;

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

	public String getRowName() {
		return rowName;
	}

	public void setRowName(String rowName) {
		this.rowName = rowName;
	}

	public String getColName() {
		return colName;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}

	public ScreenLayout getScrrenlayout() {
		return scrrenlayout;
	}

	public void setScrrenlayout(ScreenLayout scrrenlayout) {
		this.scrrenlayout = scrrenlayout;
	}
}
