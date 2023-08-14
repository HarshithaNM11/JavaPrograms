package com.xworkz.boot;

import com.xworkz.app.Employee;
import com.xworkz.app.Manager;

public class EmployeeRunner {

	public static void main(String[] args) {
		System.out.println("invoking  main in EmployeeRunner");

		Employee employee = new Manager();
		employee.displayInfo();
		employee.attendMeeting();
		employee.printRole();
		employee.needsVacation();
		employee.printVacationStatus();
		System.out.println("*******abstract method********");
		employee.calculateSalary();
		employee.performWork();
		employee.submitTimesheet();
		employee.getRole();
		employee.isFullTime();

	}

}