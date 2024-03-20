package com.shopping.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import jakarta.persistence.JoinColumn;
@Data
@Entity
public class Orders {
   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long orderId;
	private String address;
	private Double totalCost;
	

	
	@ManyToMany
		@JoinTable(name = "order_product", joinColumns = @JoinColumn(name = "order_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
		private List<Product> products;
	
}
