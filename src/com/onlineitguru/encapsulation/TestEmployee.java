package com.onlineitguru.encapsulation;

public class TestEmployee {
	
	public static void main(String[] args) {
		Employee employee = new Employee("John", 27,"Newyork");
		employee.printEmployeDetails();
		double j=2.6;System.out.println("name: Your"+ employee.name);
		}
}
