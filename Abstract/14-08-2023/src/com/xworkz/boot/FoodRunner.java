package com.xworkz.boot;

import com.xworkz.app.Burger;
import com.xworkz.app.Food;

public class FoodRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in FoodRunner");

		Food food = new Burger();
		food.displayInfo();
		food.eat();
		food.printType();
		food.isHealthy();
		food.printHealthStatus();
		System.out.println("******abstract method********");
		food.prepareIngredients();
		food.cook();
		food.serve();
		food.getType();
		food.isVegetarian();

	}

}