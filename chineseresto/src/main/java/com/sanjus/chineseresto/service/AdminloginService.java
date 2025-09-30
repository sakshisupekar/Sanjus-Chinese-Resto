package com.sanjus.chineseresto.service;

import java.util.List;

import com.sanjus.chineseresto.model.Adminlogin;

public interface AdminloginService {

	List<Adminlogin> login(String em, String ps);
}
