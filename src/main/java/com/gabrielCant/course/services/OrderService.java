package com.gabrielCant.course.services;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gabrielCant.course.entities.Order;
import com.gabrielCant.course.entities.OrderItem;
import com.gabrielCant.course.repositories.OrderItemRepository; // Certifique-se de ter criado esta interface
import com.gabrielCant.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository; // Mudado para minúsculo por convenção
	
	@Autowired
	private OrderItemRepository orderItemRepository; // Precisamos disso para salvar os itens
	
	public List<Order> findall(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj =  repository.findById(id);
		return obj.get();
	}
	
	@Transactional
	public Order insert(Order obj) {
		// 1. Define o momento do pedido para AGORA
		obj.setMoment(Instant.now());
		
		// 2. Salva o "cabeçalho" do pedido para gerar o ID
		obj = repository.save(obj);
		
		// 3. Percorre a lista de itens que veio do Front-end
		for (OrderItem item : obj.getItems()) {
			// Associa o item ao Pedido recém-criado (Preenche o ID da chave composta)
			item.setOrder(obj);
			
			// Salva o item na tabela tb_order_item
			orderItemRepository.save(item);
		}
		
		return obj;
	}
}