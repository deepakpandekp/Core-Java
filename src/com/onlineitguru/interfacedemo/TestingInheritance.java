package com.onlineitguru.interfacedemo;

public class TestingInheritance {

	public static void main(String[] args) {
		
		System.out.println("====================================================");
		System.out.println();
		
		Vehicle vehicle = new Car();
		vehicle.move();
		
		System.out.println();
		System.out.println("====================================================");
		System.out.println();
		
		vehicle = new Bus();
		vehicle.move();
	}
}
