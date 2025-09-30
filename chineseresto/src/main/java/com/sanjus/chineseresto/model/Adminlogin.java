package com.sanjus.chineseresto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Adminlogin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int adminid;
	private String emailid, password;
	public Adminlogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adminlogin(String emailid, String password) {
		super();
		this.emailid = emailid;
		this.password = password;
	}
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Adminlogin [adminid=" + adminid + ", emailid=" + emailid + ", password=" + password + "]";
	}
}
	