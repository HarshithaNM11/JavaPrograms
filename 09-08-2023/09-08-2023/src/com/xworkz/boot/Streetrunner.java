package com.xworkz.boot;

import com.xworkz.app.Rajajinagar;
import com.xworkz.app.Street;

public class Streetrunner {
	public static void main(String[] args) {
		System.out.println("invoking main in StreetRunner");

		Street street = new Rajajinagar();
		street.addLandMark();
		System.out.println("***********Child ref************");
		Rajajinagar rajajinagar = new Rajajinagar();
		rajajinagar.addLandMark();
	}

}
