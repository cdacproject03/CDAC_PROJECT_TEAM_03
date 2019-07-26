package com.dacproject.SHCP.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ngo")
public class Ngo {
	@Id
	@GeneratedValue
	int id;
	int contact;
	String name,address, email;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Ngo(int contact, String name, String address, String email) {
		super();
		this.contact = contact;
		this.name = name;
		this.address = address;
		this.email = email;
	}
	
	
	
}
