package com.spring.entity;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class FormEntity {
	private String name;
//	@DateTimeFormat(pattern = DateTimeFormat.ISO.DATE)
	private Date date;
	private Long number;
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	private List<String> courses;
	private String Fruit;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "FormEntity [name=" + name + ", date=" + date + ", number=" + number + ", courses=" + courses
				+ ", Fruit=" + Fruit + ", address=" + address + "]";
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getFruit() {
		return Fruit;
	}
	public void setFruit(String fruit) {
		Fruit = fruit;
	}
	public FormEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
