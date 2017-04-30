package com.cinema.ticket.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.ticket.models.Booking;
import com.cinema.ticket.repository.BookingRepository;
/**
 * 
 * @author Prabhakar Jha
 *
 */
@RestController
@RequestMapping("/tktbooking")
public class BookingController {
	
	private BookingRepository movieTicketBookingRepository;
	
	@RequestMapping("/create")
	public Booking create(Booking booking){
		return movieTicketBookingRepository.save(booking);
	}

	@RequestMapping("/read")
	public Booking read(@RequestParam Long id){
		return movieTicketBookingRepository.findOne(id);
	}
	
}
