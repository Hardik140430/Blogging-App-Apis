package com.blog.repositories;

import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.entities.Category;
import com.blog.entities.User;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

	

	
}
