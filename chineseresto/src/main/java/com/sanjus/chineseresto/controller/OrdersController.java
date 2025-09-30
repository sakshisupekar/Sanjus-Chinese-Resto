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

import com.sanjus.chineseresto.model.Orders;
import com.sanjus.chineseresto.service.OrdersService;

import jakarta.persistence.criteria.Order;

@RestController
@RequestMapping("/sanjuschineseresto/")
@CrossOrigin(origins="http://localhost:4200")


public class OrdersController {

	@Autowired
	private OrdersService os;
	
	@PostMapping("/order")
	public Orders insert (@RequestBody Orders o)
	{
		return os.insert(o);
	}
	@GetMapping("/order")
	public List<Orders> getAll()
	{
		return os.getAllOrders();
	}
	@PutMapping("/order/{orderid}")
	public Orders cancelOrder(@PathVariable("orderid") int orderid) {
	    Orders order = os.getOrderById(orderid);  
	    if(order != null) {
	        order.setStatus("Cancelled");  
	        return os.insert(order); 
	    }
	    return null;
	}

}
