package com.xworkz.app;

public class TeslaModel extends ElectricCar{
	
	public double costInCrore=10.8;
	
	public TeslaModel() {
		System.out.println("invoking no arg constructor in TeslaModelS");
		System.out.println("TeslaModelS price"+costInCrore);
	}
	
	public void activateSpoiler() {
		System.out.println("invoking activateSpoiler in TeslaModelS");
	}

}