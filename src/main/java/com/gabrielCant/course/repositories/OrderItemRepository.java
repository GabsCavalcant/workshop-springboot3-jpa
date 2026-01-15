package com.gabrielCant.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielCant.course.entities.OrderItem;
import com.gabrielCant.course.entities.User;
import com.gabrielCant.course.entities.pk.OrdemItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrdemItemPk>{

}
