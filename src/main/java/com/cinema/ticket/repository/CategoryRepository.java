package com.cinema.ticket.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.cinema.ticket.models.Category;

/**
 * 
 * @author Prabhakar Jha
 *
 */
@Transactional
//@PreAuthorize("hasRole('ROLE_USER')")
public interface CategoryRepository extends CrudRepository<Category, Long>{
	
	Category findByName(String name);
	//@PreAuthorize("hasRole('ROLE_ADMIN')")
	Iterable<Category> findAll();
}
