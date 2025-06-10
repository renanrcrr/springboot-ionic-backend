package com.rcrr.springbib;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rcrr.springbib.domain.Category;
import com.rcrr.springbib.repositories.CategoryRepository;

@SpringBootApplication
public class SpringbibApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbibApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "IT");
		Category cat2 = new Category(null, "Office");
		
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
	}
	
	
}
