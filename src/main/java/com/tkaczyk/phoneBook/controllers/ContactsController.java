package com.tkaczyk.phoneBook.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
		return "index";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteContact(@PathVariable("id") Long id, Model model) {
		contactsService.deleteContact(id);
		contactsService.printContacts();
		model.addAttribute("contacts", contactsService.getAllContacts());
		return "index";
	}
	
	@GetMapping("/add")
	public String contactForm(Model model) {
        model.addAttribute("contact", new Contact());
		return "contactForm";
	}
	
	@PostMapping("/add")
	public String addContact(@Valid @ModelAttribute Contact contact, BindingResult bindingResult, Model model) {
		
		if (bindingResult.hasErrors()) {
			return "contactForm";
		}
		
		System.out.println(contact.toString());
		contactsService.saveContact(contact);
		getAllContacts(model);
		return "index";
	}
}
