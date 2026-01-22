package com.gabrielCant.course.resourcer;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.gabrielCant.course.entities.User;
import com.gabrielCant.course.services.UserService;

//Anotação para mostrar que essa classe é um recurso que pode utilziar um controlador Rest 
@RestController
@RequestMapping(value = "/users")
public class UserResoucer {
	
	@Autowired
	
	private UserService service;
	
	//endpoint para acesar usuario
	
	//para retornar uma respostas de requisição web
	
	@GetMapping
	public ResponseEntity<List<User>> findAll( ){
		List<User> list = service.findall();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") //@PathVariable para "linkar" com o valor id dado no mapping
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	//Requisão Padrão Rest para "Postar" algo
	@PostMapping
	public ResponseEntity<User> insert( @RequestBody User obj){
		
		obj = service.insert(obj);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
				
		 
	}
	//Requisão Padrão Rest para "Deletar" algo
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		try {
		service.delete(id);
		return ResponseEntity.noContent().build();
		}
		catch (RuntimeException e) {
	        // Se o ID não existir, cairemos aqui e retornaremos 404
	        return ResponseEntity.notFound().build();
	        
		}
	}
	
	//Requisão Padrão Rest para "Atualizar" algo
	@PutMapping(value = "/{id}")
	public ResponseEntity<User> update(@PathVariable Long id,@RequestBody User obj ){
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
		
	}

}
