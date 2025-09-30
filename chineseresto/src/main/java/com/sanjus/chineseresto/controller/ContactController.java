package com.sanjus.chineseresto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanjus.chineseresto.model.Contact;
import com.sanjus.chineseresto.model.Registration;
import com.sanjus.chineseresto.service.ContactService;


@RestController
@RequestMapping("/sanjuschineseresto/")
@CrossOrigin(origins="http://localhost:4200")

public class ContactController {

	@Autowired
	private ContactService cs;
	@PostMapping("/contact")
	
	public Contact insert(@RequestBody Contact c)
	{
		return cs.insert(c);
	}
	@GetMapping("/contact")
	public List<Contact>getAll()
	{
		return cs.getAllContact();
	}
}
