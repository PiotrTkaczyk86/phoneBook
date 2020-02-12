package com.tkaczyk.phoneBook.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tkaczyk.phoneBook.domain.Contact;
import com.tkaczyk.phoneBook.repositories.ContactRepository;

@Service
public class ContactsService {
	
	@Autowired
	ContactRepository contactsRepository;
	
	public List<Contact> getAllContacts() {
        return contactsRepository.findAll();
	}

	public void deleteContact(Long id) {
		contactsRepository.deleteById(id);
	}

	public void saveContact(Contact contact) {
		contactsRepository.save(contact);
	}

	public void printContacts() {
		System.out.println("***********************************");
		System.out.println("contactsRepository.findAll().toString(): ");
		for (Contact c : contactsRepository.findAll()) 
			System.out.println(c.toString());
		
		System.out.println("***********************************");
	}
}
