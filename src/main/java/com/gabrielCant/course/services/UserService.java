package com.gabrielCant.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielCant.course.entities.User;
import com.gabrielCant.course.repositories.UserRepository;
import com.gabrielCant.course.services.exeption.ResourseNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findall(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj =  userRepository.findById(id);
		//implementação da chamadda da classe criada passando o Id 
		return obj.orElseThrow(() -> new ResourseNotFoundException(id));
	}
	
	public User insert(User obj) {
		return userRepository.save(obj);
	}
	
	public void delete (Long id) {
	userRepository.deleteById(id);;
	}
	
	public User update(Long id, User obj) {
		try {
		User entity = userRepository.getReferenceById(id);
		
		updateData(entity, obj);
		return userRepository.save(entity);
		}
		catch ( EntityNotFoundException e) {
			
			throw new ResourseNotFoundException(id);
		}
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}

}
