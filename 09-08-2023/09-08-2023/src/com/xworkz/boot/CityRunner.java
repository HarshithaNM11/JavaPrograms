package com.xworkz.boot;

import com.xworkz.app.BelagaviCity;
import com.xworkz.app.City;

public class CityRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in CityRunner");

		City city = new BelagaviCity();
		city.welcome();
		System.out.println("***********Child ref***************");
		BelagaviCity belagaviCity = new BelagaviCity();
		belagaviCity.welcome();

	}

}
