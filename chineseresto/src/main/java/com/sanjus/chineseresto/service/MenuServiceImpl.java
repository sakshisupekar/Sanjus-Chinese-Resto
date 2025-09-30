package com.sanjus.chineseresto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sanjus.chineseresto.model.Menu;
import com.sanjus.chineseresto.repository.MenuRepository;

@Service
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	@Qualifier("menuRepo")
	private MenuRepository menuReo;

	@Override
	public Menu insert(Menu m) {
		// TODO Auto-generated method stub
		return menuReo.save(m);
	}

	@Override
	public List<Menu> getAll() {
		// TODO Auto-generated method stub
		return menuReo.findAll();
	}

	@Override
	public void delete(int menuid) {
		// TODO Auto-generated method stub
		menuReo.deleteById(menuid);
		
	}

	@Override
	public Menu update(int menuid, Menu ndata) {
		Optional<Menu>opt= menuReo.findById(menuid);
		if(opt.isPresent())
		{
			Menu oldmenu = opt.get();
			oldmenu.setName(ndata.getName());
			oldmenu.setPrice(ndata.getPrice());
			oldmenu.setDescription(ndata.getDescription());
			oldmenu.setImagepath(ndata.getImagepath());
			return menuReo.save(oldmenu);
		}
		return null;
	}

	@Override
	public Menu search(int menuid) {
		Optional<Menu > opt = menuReo.findById(menuid);
		if(opt.isPresent())
		{
			Menu oldmenu= opt.get();
			return oldmenu;
		}
		return null;
	}

}
