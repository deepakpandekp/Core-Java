package com.onlineitguru.encapsulation;

public class Employee {
	public String name;
	private int age;
	private String address;
private int k=0;	
	
	public Employee(String name, int age, String address) {
		//super();
		this.name = name;
		this.age = age;
		this.address = address;
	}


	public void printEmployeDetails() {
		System.out.println(" Employee name: "+ name+ " age: "+ age+" addess: "+ address);
	}

}
