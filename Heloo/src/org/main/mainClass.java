package org.main;

import org.bike.Bike;
import org.car.Car;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car( "weeer", "hello", null, null);
		Bike bike=new Bike(null, null, null, null);
	
		System.out.println(car.getEngine());
		System.out.println(car.getSeat_belt());
		System.out.println(bike.getHandle());
		

	}

}

