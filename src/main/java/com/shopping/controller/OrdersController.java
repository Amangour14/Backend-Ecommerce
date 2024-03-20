package com.shopping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.entity.Orders;
import com.shopping.service.OrdersService;

@RestController
@CrossOrigin("*")
public class OrdersController {
  
	@Autowired
	private OrdersService orderService;
	
	@PostMapping("/order")
	public Orders orderItem(@RequestBody Orders order) {
		return orderService.orders(order);
	}
	
	@GetMapping("/order/{id}")
	public Optional<Orders> getOrders(@PathVariable Long id) {
		return orderService.getOrder(id);
	}
	@GetMapping("/order/list")
	public List<Orders> olist(){
		return orderService.listOrders();
	}
}
