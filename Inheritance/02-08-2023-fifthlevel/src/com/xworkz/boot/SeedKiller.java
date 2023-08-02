package com.xworkz.boot;

import com.xworkz.app.Table;

public class SeedKiller {

	public static void main(String[] args) {
		System.out.println("Running main");
		
		Table table=new Table();
		table.grow();
		table.growPlant();
		table.giveOxygen();
		table.cutWood();
		table.make();
		table.keepItem();

	}

}