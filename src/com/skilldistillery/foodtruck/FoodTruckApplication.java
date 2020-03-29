package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {

	public static void main(String[] args) {
		FoodTruckApplication f = new FoodTruckApplication();
		f.run();
	}

	public void run() {
		Scanner kb = new Scanner(System.in);
		System.out.println("*** Welcome to the official Food Truck App! ***");
		System.out.println("***      Please make a selection below      ***");
		System.out.println();
		printMenu();
		
		kb.close();
	}
	
	public void printMenu() {
		
	}
}
