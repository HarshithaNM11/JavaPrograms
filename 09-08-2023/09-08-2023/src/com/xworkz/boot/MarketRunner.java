package com.xworkz.boot;

import com.xworkz.app.FishMarket;
import com.xworkz.app.Market;

public class MarketRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in MarketRunner");

		Market market = new FishMarket();
		market.sell();
		System.out.println("*********Child ref*************");
		FishMarket fishMarket = new FishMarket();
		fishMarket.sell();

	}


}
