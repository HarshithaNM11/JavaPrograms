package com.xworkz.boot;

import com.xworkz.app.Pub;
import com.xworkz.app.SportsPub;

public class PubRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in PubRunner");

		Pub pub = new SportsPub();
		pub.enjoy();
		System.out.println("********Child ref**********");

		SportsPub sportsPub = new SportsPub();
		sportsPub.enjoy();
	}

}
