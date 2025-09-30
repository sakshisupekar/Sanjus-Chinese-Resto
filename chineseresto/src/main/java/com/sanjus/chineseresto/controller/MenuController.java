package com.sanjus.chineseresto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanjus.chineseresto.model.Menu;
import com.sanjus.chineseresto.service.MenuService;

@RestController
@RequestMapping("/sanjuschineseresto/")
@CrossOrigin(origins="http://localhost:4200")

public class MenuController {
@Autowired
private MenuService ms;

@PostMapping ("/menu")
public Menu insert(@RequestBody Menu m)
{
	return ms.insert(m);
}
@GetMapping ("/menu")
public List<Menu>getAll()
{
	return ms.getAll();
}
@DeleteMapping("/menu/{menuid}")
public void delete(@PathVariable("menuid") int mi)
{
	ms.delete(mi);
}
@PutMapping("/menu/{menuid}")
public Menu update(@PathVariable("menuid") int mennuid ,@RequestBody Menu m)
{
	return ms.update(mennuid, m);
}
@GetMapping("/menu/{menuid}")
public Menu search(@PathVariable ("menuid") int menuid )
{
	return ms.search(menuid);
}
}
