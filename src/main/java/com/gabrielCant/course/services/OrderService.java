package com.gabrielCant.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielCant.course.entities.Order;
import com.gabrielCant.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository OrderRepository;
	
	public List<Order> findall(){
		return OrderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj =  OrderRepository.findById(id);
		return obj.get();
	}

}
