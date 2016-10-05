package com.iia.shop.entity;

public class Vehicule {

	private String brand;
	private int year;
	private int speed;
	private String model;
	private String color;
	private double price;
	
	public Vehicule(String brand, int year, int speed, String model, String color, double price) {
		super();
		this.brand = brand;
		this.year = year;
		this.speed = speed;
		this.model = model;
		this.color = color;
		this.price = price;
	}

	public Vehicule() {
		super();
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	// faire avancer la voiture si elle est a l'arret
	public void start() {
			
	}

	// arreter la voiture si elle roule
	public void stop() {
	}

	// augmenter la vitesse de la voiture
	public void speedUp(int speed) {
		this.speed = this.speed + speed;
	}

	// diminuer la vitesse de la voiture
	public void speedDown(int speed) {
		this.speed = this.speed + speed;
	}
}
