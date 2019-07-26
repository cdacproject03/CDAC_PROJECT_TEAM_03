package com.dacproject.SocialHelpCarePortal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NeedyUser {
    @Id
    @GeneratedValue
	int userId;
	int contact ,age ;
	double salary;
	String name ,address , email;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
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
	public NeedyUser(int contact, int age, double salary, String name, String address, String email) {
		super();
		this.contact = contact;
		this.age = age;
		this.salary = salary;
		this.name = name;
		this.address = address;
		this.email = email;
	}
	
}
