package com.gabrielCant.course.resourcer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielCant.course.entities.Product;
import com.gabrielCant.course.services.ProductService;

//Anotação para mostrar que essa classe é um recurso que pode utilziar um controlador Rest 
@RestController
@RequestMapping(value = "/products")
@CrossOrigin(origins = "*")
public class ProductResoucer {
	
	@Autowired
	
	private ProductService service;
	
	//endpoint para acesar usuario
	
	//para retornar uma respostas de requisição web
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll( ){
		List<Product> list = service.findall();
		
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}") //@PathVariable para "linkar" com o valor id dado no mapping
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
