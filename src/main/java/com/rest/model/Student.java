package com.rest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "connection")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "mobile")
	private long mobile;

	@Column(name = "city")
	private String city;

	public Student() {
		super();
	}

	public Student(int id, String name, long mobile, String city) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", city=" + city + "]";
	}

}
