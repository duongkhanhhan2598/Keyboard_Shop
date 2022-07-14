package edu.poly.thi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.poly.thi.entity.category;

public interface categoryDAO extends JpaRepository<category, String>{
	
}
