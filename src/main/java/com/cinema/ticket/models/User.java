package com.cinema.ticket.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author Prabhakar Jha
 *
 */

@Entity
@Table(name="user")
public class User implements Serializable {
	private static final long serialVersionUID = -4942572970003143427L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String name;
	@Column
	private Account account;
	@Column
	private String ticketId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

}
