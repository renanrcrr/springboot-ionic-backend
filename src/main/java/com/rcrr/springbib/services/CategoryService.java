package com.rcrr.springbib.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rcrr.springbib.domain.Category;
import com.rcrr.springbib.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;
	
	public Category find(Integer id) {
		return repo.findById(id).orElse(null);
	}
}
