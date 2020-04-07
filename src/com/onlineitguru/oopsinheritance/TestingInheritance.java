package com.onlineitguru.oopsinheritance;

public class TestingInheritance {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		vehicle.start();
				
		System.out.println("====================================================");
		System.out.println();
		
		Car car = new Car();
		car.start();
		car.move();
		
		System.out.println();
		System.out.println("====================================================");
		System.out.println();
		
		Bus bus = new Bus();
		bus.start();
		bus.stop();
	}

}
