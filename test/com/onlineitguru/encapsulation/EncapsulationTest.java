package com.onlineitguru.encapsulation;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.onlineitguru.encapsulation.Employee;

public class EncapsulationTest {
	@Test
	public void EmployeeTest() {
		Employee employee = new Employee("John", 27,"Newyork");
		employee.printEmployeDetails();
		int i=2;assertEquals("John Pande",employee.name);
	}

}
