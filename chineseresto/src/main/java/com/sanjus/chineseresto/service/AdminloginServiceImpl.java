package com.sanjus.chineseresto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sanjus.chineseresto.model.Adminlogin;
import com.sanjus.chineseresto.repository.AdminloginRepository;

@Service
public class AdminloginServiceImpl  implements AdminloginService{
	
	@Autowired
	@Qualifier("admimRepo")
	private AdminloginRepository adminRepo;

	@Override
	public List<Adminlogin> login(String em, String ps) {
		// TODO Auto-generated method stub
		return adminRepo.findByEmailidAndPassword(em, ps);
	}

}
