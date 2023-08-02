package com.xworkz.boot;

import com.xworkz.app.Juice;

public class SeedRunner {
	
	public static void main(String[] args) {
		System.out.println("Running main");
		
		Juice juice=new Juice();
		
		juice.grow();
		juice.growPlant();
		juice.giveOxygen();
		juice.eat();
		juice.drink();
	}

}