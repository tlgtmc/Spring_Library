package com.atmaca.library.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atmaca.library.dao.BookDao;
import com.atmaca.library.dao.BookCategoryDao;
import com.atmaca.library.model.Books;

@RestController
public class BookController {

	@Autowired
	BookDao bookDao;
	
	@Autowired
	BookCategoryDao typeDao;

//	public String home() {
//		return "home.jsp";
//	}

	@PostMapping("/addBook")
	public Books addBook(@RequestBody Books book) {
		bookDao.save(book);
		return book;
	}
	
	@RequestMapping("/getBooks")
	public List<Books> getBooks() {
		List<Books> findAll = bookDao.findAll();
		System.out.println("Total Book Count: " + findAll.size());
		return findAll;
	}

	@PutMapping(path="/updateBook", consumes= {"application/json"})
	public Books updateBook(@RequestBody Books book) {
		bookDao.save(book);
		return book;
	}
	
	@DeleteMapping("/books/{aid}")
	public String deleteBook(@PathVariable int aid) {
		Books one = bookDao.getOne(aid);
		bookDao.delete(one);
		return "Deleted";
	}
}
