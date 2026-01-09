package com.gabrielCant.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielCant.course.entities.Category;
import com.gabrielCant.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
