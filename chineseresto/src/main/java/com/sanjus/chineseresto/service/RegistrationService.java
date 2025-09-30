package com.sanjus.chineseresto.service;

import java.util.List;

import com.sanjus.chineseresto.model.Registration;

public interface RegistrationService {

	Registration insert(Registration r);
	List<Registration> getAllRegistrations();
	List<Registration> login (String em , String ps);
}
