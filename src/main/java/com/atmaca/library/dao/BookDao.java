package com.atmaca.library.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atmaca.library.model.Books;

@Repository
public interface BookDao extends JpaRepository<Books, Integer> {

}
