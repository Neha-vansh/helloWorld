package org.vehicle;

public class Vehicle {
	
	private String engine;
	private String wheels;
	private String seats;
	
	
	public Vehicle(String engine, String wheels, String seats) {
		
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
	}


	public String getEngine() {
		return engine;
	}


	public String getWheels() {
		return wheels;
	}


	public String getSeats() {
		return seats;
	}
	
	
	

}
