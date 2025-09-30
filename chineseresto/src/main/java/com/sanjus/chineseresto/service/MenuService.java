package com.sanjus.chineseresto.service;

import java.util.List;

import com.sanjus.chineseresto.model.Menu;

public interface MenuService {

	Menu insert(Menu m);
	List< Menu>getAll();
	void delete (int menuid);
	Menu update(int menuid, Menu ndata);
	Menu search (int menuid);
}
