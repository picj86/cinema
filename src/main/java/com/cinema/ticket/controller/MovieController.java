/**
 * 
 */
package com.cinema.ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.ticket.models.Category;
import com.cinema.ticket.models.Movie;
import com.cinema.ticket.repository.MovieRepository;

/**
 * @author Prabhakar Jha
 *
 */
@RestController
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	private MovieRepository movieRepository;
	
	@RequestMapping("/create")
	public Movie create(Movie movie){
		return movieRepository.save(movie);
	}
	
	@RequestMapping("/read")
	public Movie read(@RequestParam Long movieId){
		return movieRepository.findOne(movieId);
	}
	
	@RequestMapping("/update")
	public Movie update(@RequestParam Long movieId, @RequestParam String title, @RequestParam String actor, @RequestParam String author, @RequestParam String year, @RequestParam Category category){
		Movie movie = movieRepository.findOne(movieId);
		movie.setTitle(title);
		movie.setActor(actor);
		movie.setActor(actor);
		movie.setYear(year);
		movie.setCategory(category);
		return movie;
		
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam Long movieId) {
		movieRepository.delete(movieId);
		return "movie #" + movieId + " deleted successfull";
	}

}
