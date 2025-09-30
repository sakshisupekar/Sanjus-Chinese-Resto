package com.sanjus.chineseresto.service;

import java.util.List;

import com.sanjus.chineseresto.model.Orders;

public interface OrdersService {

	Orders insert( Orders o);
	List<Orders > getAllOrders ();
	void cancelorder(int orderid);
	Orders getOrderById(int orderid); 

}
