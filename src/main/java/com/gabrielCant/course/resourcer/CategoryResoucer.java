package com.gabrielCant.course.resourcer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielCant.course.entities.Category;
import com.gabrielCant.course.services.CategoryService;

//Anotação para mostrar que essa classe é um recurso que pode utilziar um controlador Rest 
@RestController
@RequestMapping(value = "/Categorys")
public class CategoryResoucer {
	
	@Autowired
	
	private CategoryService service;
	
	//endpoint para acesar usuario
	
	//para retornar uma respostas de requisição web
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll( ){
		List<Category> list = service.findall();
		
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}") //@PathVariable para "linkar" com o valor id dado no mapping
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
