package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long>{

}
