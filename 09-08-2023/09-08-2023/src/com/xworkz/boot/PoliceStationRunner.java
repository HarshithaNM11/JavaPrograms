package com.xworkz.boot;

import com.xworkz.app.PoliceStation;
import com.xworkz.app.TraficPoliceStation;

public class PoliceStationRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in PoliceStationRunner");

		PoliceStation policeStation = new TraficPoliceStation();
		policeStation.arrest();
		System.out.println("*********Child ref**********");

		TraficPoliceStation traficPoliceStation = new TraficPoliceStation();
		traficPoliceStation.arrest();

	}

}
