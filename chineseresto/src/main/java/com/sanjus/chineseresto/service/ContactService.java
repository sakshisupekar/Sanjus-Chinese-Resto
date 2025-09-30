package com.sanjus.chineseresto.service;

import java.util.List;

import com.sanjus.chineseresto.model.Contact;


public interface ContactService {

	Contact insert( Contact c);
	List<Contact > getAllContact();
}
