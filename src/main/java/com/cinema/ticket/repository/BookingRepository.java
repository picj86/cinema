/**
 * 
 */
package com.cinema.ticket.repository;

import org.springframework.data.repository.CrudRepository;

import com.cinema.ticket.models.Booking;

/**
 * @author Prabhakar Jha
 *
 */
public interface BookingRepository extends CrudRepository<Booking, Long> {
	
}
