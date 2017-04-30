package com.cinema.ticket.repository;
/**
 * 
 * @author Prabhakar Jha
 *
 */
import org.springframework.data.repository.CrudRepository;

import com.cinema.ticket.models.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {

	Movie findByTitle(String title);
	Movie findByActor(String actor);
}
