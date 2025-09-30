package com.sanjus.chineseresto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Registration {

	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int regid;
	 private String name,age,gender,contact,emailid,address,city,password;
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(String name, String age, String gender, String contact, String emailid, String address,
			String city, String password) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.contact = contact;
		this.emailid = emailid;
		this.address = address;
		this.city = city;
		this.password = password;
	}
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Registration [regid=" + regid + ", name=" + name + ", age=" + age + ", gender=" + gender + ", contact="
				+ contact + ", emailid=" + emailid + ", address=" + address + ", city=" + city + ", password="
				+ password + "]";
	}
	 
	 
	
}
