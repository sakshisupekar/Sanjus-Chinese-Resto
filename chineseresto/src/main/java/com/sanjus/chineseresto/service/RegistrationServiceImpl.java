package com.sanjus.chineseresto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sanjus.chineseresto.model.Registration;
import com.sanjus.chineseresto.repository.RegistrationRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService{
	
	@Autowired
	@Qualifier("regRepo")
	private RegistrationRepository regRepo;

	@Override
	public Registration insert(Registration r) {
		//Save
		return regRepo.save(r);
	}

	@Override
	public List<Registration> getAllRegistrations() {
		// TODO Auto-generated method stub
		return regRepo.findAll();
	}

	@Override
	public List<Registration> login(String em, String ps) {
		// TODO Auto-generated method stub
		return regRepo.findByEmailidAndPassword(em, ps);
	}

}
