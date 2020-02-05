package com.tkaczyk.phoneBook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tkaczyk.phoneBook.domain.Contact;
import com.tkaczyk.phoneBook.services.ContactsService;

@Controller
public class ContactsController {
	@Autowired
	ContactsService contactsService;
	
	@GetMapping("/")
	public String getAllContacts(Model model) {
		List<Contact> allContacts = contactsService.getAllContacts();
		model.addAttribute("contacts", allContacts);
		System.out.println(allContacts.toString());
		return "index";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteContact(@PathVariable("id") Long id, Model model) {
		System.out.println("ContactsController - id:" + id );
		contactsService.deleteContact(id);
		contactsService.printContacts();
		model.addAttribute("contacts", contactsService.getAllContacts());
		return "index";
	}
}
