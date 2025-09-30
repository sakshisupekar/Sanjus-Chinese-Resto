package com.sanjus.chineseresto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sanjus.chineseresto.model.Contact;
import com.sanjus.chineseresto.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	@Qualifier("conRepo")
	private ContactRepository conRepo;
	
	@Override
	public Contact insert(Contact c) {
		
		return conRepo.save(c);
	}

	@Override
	public List<Contact> getAllContact() {
		
		return conRepo.findAll();
	}

}
