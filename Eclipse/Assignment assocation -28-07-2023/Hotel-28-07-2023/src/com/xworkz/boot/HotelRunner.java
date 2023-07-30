package com.xworkz.boot;

import com.xworkz.app.Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Running main in HotelRunner");
		
		Hotel hotel=new Hotel();
		
		hotel.printInfo();
		hotel.provideFood();

	}

}
