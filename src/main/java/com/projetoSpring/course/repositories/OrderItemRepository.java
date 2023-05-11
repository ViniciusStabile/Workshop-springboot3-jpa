package com.projetoSpring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.course.entities.OrderItem;
import com.projetoSpring.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
