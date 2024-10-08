package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BooksEntity;
import com.example.demo.repo.BookRepo;

@RestController
@RequestMapping("api/books")
public class BookController {

	@Autowired
	BookRepo repo;
	
	@GetMapping
	public List<BooksEntity> getallbooks(){
		return repo.findAll();
	}
	
	@GetMapping("{id}")
	public BooksEntity getabook(@PathVariable int id) {
		return repo.findById(id).get();
	}
	@PostMapping()
	public BooksEntity Addabook(@RequestBody BooksEntity book) {
		return repo.save(book);
	}
	
	@DeleteMapping("{id}")
	public void deleteabook(@PathVariable int id) {
		    repo.deleteById(id);
		
	}
}
