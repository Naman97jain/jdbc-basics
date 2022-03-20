package com.spring.jdbc.entities;

public class Student {
	private int id;
	private String name;
	private String city;

	public Student() {

	}

	public Student(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
}
