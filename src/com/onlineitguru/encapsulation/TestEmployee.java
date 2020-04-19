package com.onlineitguru.encapsulation;

public class TestEmployee {
	
	public static void main(String[] args) {
		Employee employee = new Employee("John", 27,"Newyork");
		employee.printEmployeDetails();
		System.out.println("name: My"+ employee.name);
		}
}
