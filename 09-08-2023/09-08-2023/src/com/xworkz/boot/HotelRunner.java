package com.xworkz.boot;

import com.xworkz.app.Hotel;
import com.xworkz.app.ShabariHotel;

public class HotelRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in HotelRunner ");

		Hotel hotel = new ShabariHotel();
		hotel.serve();
		System.out.println("**********Child ref**********");
		ShabariHotel shabariHotel = new ShabariHotel();
		shabariHotel.serve();

	}


}
