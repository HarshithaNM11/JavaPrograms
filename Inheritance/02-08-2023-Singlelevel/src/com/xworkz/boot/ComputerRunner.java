package com.xworkz.boot;

import com.xworkz.app.Laptop;

public class ComputerRunner {
	public static void main(String[] args) {
		
		System.out.println("Running main in ComputerRunner");
		
		//Computer computer=new Laptop();
		Laptop laptop=new Laptop();
	    laptop.turnOn();
		laptop.shutDown();

	}


}
