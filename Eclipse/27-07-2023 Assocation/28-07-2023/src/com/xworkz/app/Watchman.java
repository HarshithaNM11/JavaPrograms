package com.xworkz.app;

public class Watchman {
	public Gun gun;
	
	public void secure() {
		System.out.println("running secure info in watchman");
		
		if(gun!=null) {
			System.out.println("invoking secure in watchman");
			gun.shoot();
		}
		else {
			System.out.println("Gun is pointing null");
		}
		
	}

}


