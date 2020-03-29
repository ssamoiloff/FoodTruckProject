package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {
	Scanner kb = new Scanner(System.in);
	private int numOfTrucks = 0;
	private FoodTruck[] trucksArr;

	public static void main(String[] args) {
		FoodTruckApplication f = new FoodTruckApplication();
		FoodTruck a = new FoodTruck("Krusty Anus", "Literal shit", 1);
		
		System.out.println(a);
		
//		f.run();
	}

	public void run() {
		printBanner();
		inputInfo();

		printMenu();

		kb.close();
	}

	public void printBanner() {
		System.out.println(" _______________________________________________ ");
		System.out.println("|***********************************************|");
		System.out.println("|**                                           **|");
		System.out.println("|**  Welcome to the official Food Truck App!  **|");
		System.out.println("|**     Begin by filling in fields below      **|");
		System.out.println("|**                                           **|");
		System.out.println("|***********************************************|");
		System.out.println(" ----------------------------------------------- ");
		System.out.println();
	}

	public void inputInfo() {
		boolean isValid = true;
		String name = "";
		String food = "";
		int rating = 0;
		System.out.print("How many trucks would you like info on? [1-5]: ");
		while (isValid) {
			numOfTrucks = kb.nextInt();
			if (numOfTrucks > 5 || numOfTrucks == 0) {
				System.err.println("Please enter a value between 1-5");
			} else {
				isValid = false;
			}
		}

		for (int i = 1; i <= numOfTrucks; i++) {
			System.out.print("Enter name of truck #" + i + " (type \"quit\" to finish): ");
			kb.nextLine(); // had issues with two lines printing on the same line
			name = kb.nextLine();
			if (name.equals("quit")) {
				break;
			}
			System.out.print("Enter type of food: ");
			food = kb.nextLine();
			System.out.print("Enter truck #" + i + " rating: ");
			rating = kb.nextInt();

		}

	}

	public void printMenu() {
		System.out.println("1. ");
	}
}
