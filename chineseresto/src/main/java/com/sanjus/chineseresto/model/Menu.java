package com.sanjus.chineseresto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int menuid;
	private String name, Description, imagepath ;
	private int price;
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(String name, String description, String imagepath, int price) {
		super();
		this.name = name;
		Description = description;
		this.imagepath = imagepath;
		this.price = price;
	}
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Menu [menuid=" + menuid + ", name=" + name + ", Description=" + Description + ", imagepath=" + imagepath
				+ ", price=" + price + "]";
	}
	
	
}
