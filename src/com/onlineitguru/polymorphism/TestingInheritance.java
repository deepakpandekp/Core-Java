package com.onlineitguru.polymorphism;

public class TestingInheritance {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		vehicle.move();;
		
		System.out.println("====================================================");
		System.out.println();
		
		Vehicle vehicle1 = new Car();
		vehicle1.move();
		
		System.out.println();
		System.out.println("====================================================");
		System.out.println();
		
		Vehicle vehicle2 = new Bus();
		vehicle2.move();
	}
}
