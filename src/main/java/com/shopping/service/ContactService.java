package com.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.entity.Contact;
import com.shopping.repository.ContactRepository;

@Service
public class ContactService {
	@Autowired
	private ContactRepository contactRepository;
 
	
	public Contact contactForm(Contact contact) {
		return contactRepository.save(contact);
	}
	public List<Contact> allQueries() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}
}
