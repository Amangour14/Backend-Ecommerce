package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.entity.Contact;
import com.shopping.service.ContactService;

@RestController
@CrossOrigin("*")
@RequestMapping()
public class ContactController {

	@Autowired
	private ContactService contactService;
	@GetMapping("/allQueries")
	public List<Contact> queryList(){
		return contactService.allQueries();
	}
	
	@PostMapping("/submitForm")
	public Contact cont(@RequestBody Contact contact) {
//		System.out.println(contact.getName());
		return contactService.contactForm(contact);
	}
}
