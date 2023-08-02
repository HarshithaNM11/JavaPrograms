package com.xworkz.app;

public class TeslaModelSLongRange extends TeslaModel{
	
	public long range=100;
	
	public TeslaModelSLongRange() {
		System.out.println("Invoking no arg constructor in TeslaModelSLongRange");
		System.out.println("TeslaModelSLongRange range"+range);
	}
	
	public void chargingCapacity() {
		System.out.println("Invoking activateSpoiler in TeslaModelSLongRange");
	}

}