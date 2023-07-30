package com.xworkz.boot;

import com.xworkz.app.PowerBank;

public class PowerBankRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Running main in PowerBankrunner");
		
		PowerBank powerBank = new PowerBank();
		
		powerBank.printInfo();
		
		powerBank.charge();
		
		

	}

}
