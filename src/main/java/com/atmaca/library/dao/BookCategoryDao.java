package com.atmaca.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atmaca.library.model.BookCategory;

@Repository
public interface BookCategoryDao extends JpaRepository<BookCategory, Integer> {

}
