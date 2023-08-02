package com.xworkz.app;

public class Vertebrates extends Animal{
	
	public String name="Fish";
	
	public Vertebrates() {
		System.out.println("Invoking no arg constructor in Vertebrate");
		System.out.println("Vertebrate name:"+name);
	}
	
	public void eat() {
		System.out.println("Invoking eat in Vertebrate");
	}
	}