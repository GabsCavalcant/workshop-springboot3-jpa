package com.gabrielCant.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielCant.course.entities.Product;
import com.gabrielCant.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository ProductRepository;
	
	public List<Product> findall(){
		return ProductRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj =  ProductRepository.findById(id);
		return obj.get();
	}

}
