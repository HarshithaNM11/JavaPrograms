package com.xworkz.boot;

import com.xworkz.app.TeslaModelSPlaidPlus;

public class VehicleRunner {
	public static void main(String[] args) {
		System.out.println("Running main");
		
		TeslaModelSPlaidPlus model=new TeslaModelSPlaidPlus();
		
		model.start();
		model.stop();
		model.activateSpoiler();
		model.batteryCapacity();
		model.chargingCapacity();
		model.drive();
		model.charge();
		model.leatherInterior();
	}


}
