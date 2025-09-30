package com.sanjus.chineseresto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanjus.chineseresto.model.Registration;
import com.sanjus.chineseresto.service.RegistrationService;


@RestController
@RequestMapping("/sanjuschineseresto/")
@CrossOrigin(origins="http://localhost:4200")
public class RegistrationController {
	
	@Autowired
	private RegistrationService rs;
	
	@GetMapping("/registration")
	public List<Registration>getAll()
	{
		return rs.getAllRegistrations();
	}
	@GetMapping("/registration/{emailid}/{password}")
	public List<Registration>login(@PathVariable ("emailid")String e, @PathVariable ("password") String ps )
	{
		return rs.login(e, ps);
	}
	@PostMapping("/registration")
	public Registration insertrecord(@RequestBody Registration r)
	{
		return rs.insert(r);
	}
}
