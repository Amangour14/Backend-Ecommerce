package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {



}

