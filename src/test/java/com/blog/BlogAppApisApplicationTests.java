package com.blog;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blog.entities.Category;
import com.blog.repositories.CategoryRepo;
import com.blog.repositories.UserRepo;

@SpringBootTest
class BlogAppApisApplicationTests {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void repoTest() {
		String className = this.userRepo.getClass().getName();
		String packageName = this.userRepo.getClass().getPackageName();
		
		System.out.println(className);
		System.out.println(packageName);
		
	}
	
	@Test
	public void catTest() {
		List<Category> findAll = this.categoryRepo.findAll();
		System.out.println(findAll.get(0).getCategoryDescription());
	}
}
