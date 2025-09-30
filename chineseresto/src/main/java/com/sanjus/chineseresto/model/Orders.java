package com.sanjus.chineseresto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderid;
    private String emailid;   
    private String dishName;      
    private int quantity;
    private double totalprice;
    private String delivaryAddress;
    private String paymentmethode;
    private String status;
	public Orders() {
		super();
		
	}
	public Orders(String emailid, String dishName, int quantity, double totalprice, String delivaryAddress,
			String paymentmethode, String status) {
		super();
		this.emailid = emailid;
		this.dishName = dishName;
		this.quantity = quantity;
		this.totalprice = totalprice;
		this.delivaryAddress = delivaryAddress;
		this.paymentmethode = paymentmethode;
		this.status = status;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	public String getDelivaryAddress() {
		return delivaryAddress;
	}
	public void setDelivaryAddress(String delivaryAddress) {
		this.delivaryAddress = delivaryAddress;
	}
	public String getPaymentmethode() {
		return paymentmethode;
	}
	public void setPaymentmethode(String paymentmethode) {
		this.paymentmethode = paymentmethode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", emailid=" + emailid + ", dishName=" + dishName + ", quantity="
				+ quantity + ", totalprice=" + totalprice + ", delivaryAddress=" + delivaryAddress + ", paymentmethode="
				+ paymentmethode + ", status=" + status + "]";
	}
	
}
