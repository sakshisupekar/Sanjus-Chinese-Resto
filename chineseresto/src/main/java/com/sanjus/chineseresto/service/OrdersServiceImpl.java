package com.sanjus.chineseresto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sanjus.chineseresto.model.Orders;
import com.sanjus.chineseresto.repository.OrdersRepository;



@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	@Qualifier("orderRepo")
	private OrdersRepository orderRepo;

	@Override
	public Orders insert(Orders o) {
		// TODO Auto-generated method stub
		return orderRepo.save(o);
	}

	@Override
	public List<Orders> getAllOrders() {
		
		return orderRepo.findAll();
	}

	@Override
	public void cancelorder(int orderid) {
		Orders order = orderRepo.findById(orderid).orElse(null);
        if(order != null) {
            order.setStatus("Cancelled");  
            orderRepo.save(order);        
        }
	}
	@Override
    public Orders getOrderById(int orderid) {
        return orderRepo.findById(orderid).orElse(null);
    }


	
}
