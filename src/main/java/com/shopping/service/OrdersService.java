package com.shopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.entity.Orders;
import com.shopping.repository.OrdersRepository;

@Service
public class OrdersService {
	
	@Autowired
	private OrdersRepository orderRepository;
    

	public Orders orders(Orders order) {
		return orderRepository.save(order);
	}
	
	public Optional<Orders> getOrder(Long id) {
		return orderRepository.findById(id);
	}

   public List<Orders> listOrders(){
	   return orderRepository.findAll();
   }

}
