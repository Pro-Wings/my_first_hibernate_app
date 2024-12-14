package com.prowings.dao;

public class Car {
	
	private int id;
	private String name;
	private String companyName;
	private int speed;

	public Car() {
	}

	public Car(int id, String name, String companyName, int speed) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.speed = speed;
	}

	public Car(String name, String companyName, int speed) {
		super();
		this.name = name;
		this.companyName = companyName;
		this.speed = speed;
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", companyName=" + companyName + ", speed=" + speed + "]";
	}
	
}
