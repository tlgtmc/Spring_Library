package com.atmaca.library.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atmaca.library.dao.BookCategoryDao;
import com.atmaca.library.model.BookCategory;

import java.util.List;
@RestController
public class BookCategoryController {
	
	@Autowired
	BookCategoryDao typeDao;
	
	@PostMapping("/createCategory")
	public BookCategory createCategory(@Valid @RequestBody BookCategory type) {
		return typeDao.save(type);
	}
	
	public List<BookCategory> getAllTypes() {
		return typeDao.findAll();
	}
	

}
