/**
 * 
 */
package com.cinema.ticket.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.ticket.models.Category;
import com.cinema.ticket.repository.CategoryRepository;

/**
 * @author Prabhakar Jha
 *
 */
@RestController
@RequestMapping("/api/category")
public class CategoryController {
	@Autowired
	private CategoryRepository categoryRepository;
	
	@RequestMapping("/create")
	public Category create(Category category){
		return categoryRepository.save(category);
	}
	
	@RequestMapping("/read")
	public Category read(@RequestParam Long categoryId){
		return categoryRepository.findOne(categoryId);
	}
	
	@RequestMapping("/readAll")
	public Iterable<Category> readAll(){
		return categoryRepository.findAll();
	}
	
	@RequestMapping("/update")
	public Category update(@RequestParam Long categoryId, @RequestParam String name, @RequestParam String description){
		Category category= categoryRepository.findOne(categoryId);
		category.setName(name);
		category.setDescription(description);
		return category;
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam Long categoryId) {
		categoryRepository.delete(categoryId);
		return "category #" + categoryId + " deleted successfully";
	}
}
