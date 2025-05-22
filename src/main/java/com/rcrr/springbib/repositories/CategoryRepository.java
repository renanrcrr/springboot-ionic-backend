package com.rcrr.springbib.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rcrr.springbib.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
