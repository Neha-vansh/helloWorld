package org.car;

import org.vehicle.Vehicle;

public class Car extends Vehicle {

	public Car( String seat_belt , String engine, String wheels, String seats) {
		super(engine, wheels, seats);
		// TODO Auto-generated constructor stub
		this.seat_belt=seat_belt;
	}
	private String seat_belt;
	private String Ac;
	private String diggy;
	public String getSeat_belt() {
		return seat_belt;
	}
	public String getAc() {
		return Ac;
	}
	public String getDiggy() {
		return diggy;
	}
	
	
}
