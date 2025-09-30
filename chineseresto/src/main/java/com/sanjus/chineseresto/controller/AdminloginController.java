package com.sanjus.chineseresto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanjus.chineseresto.model.Adminlogin;
import com.sanjus.chineseresto.service.AdminloginService;

@RestController
@RequestMapping("/sanjuschineseresto/")
@CrossOrigin(origins="http://localhost:4200")

public class AdminloginController {

	@Autowired
	private AdminloginService as;
	
	@GetMapping("/adminlogin/{emailid}/{password}")
	public List< Adminlogin> login(@PathVariable("emailid") String emailid, @PathVariable ("password") String password)
	{
		return as.login(emailid, password);
	}
}
