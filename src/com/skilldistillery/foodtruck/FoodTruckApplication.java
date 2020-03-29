package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {
	Scanner kb = new Scanner(System.in);
	private int numOfTrucks = 0;
	private FoodTruck[] trucksArr;
	private double avgRating;

	public static void main(String[] args) {
		FoodTruckApplication f = new FoodTruckApplication();

		f.run();
	}

	public void run() {

//		printBanner();
//		inputInfo();

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
		String name = null;
		String food = null;
		int rating = 0;
		System.out.print("How many trucks would you like info on? [1-5]: ");
		while (isValid) {
			numOfTrucks = kb.nextInt();
			if (numOfTrucks > 5 || numOfTrucks == 0) {
				System.err.println("Please enter a value between 1-5");
			} else {
				trucksArr = new FoodTruck[numOfTrucks];
				isValid = false;
			}
		}

		for (int i = 0; i < numOfTrucks; i++) {
			System.out.print("Enter the name of truck #" + (i + 1) + " (type \"quit\" to finish): ");
			kb.nextLine(); // had issues with two lines printing on the same line
			name = kb.nextLine();
			if (name.equals("quit")) {
				break;
			}
			System.out.print("Enter type of food: ");
			food = kb.nextLine();
			System.out.print("Enter truck #" + (i + 1) + " rating: ");
			rating = kb.nextInt();
			trucksArr[i] = new FoodTruck(name, food, rating);
		}

	}
	
	public void calcAvg() {
		double average = 0.0;
		for (int i = 0; i < numOfTrucks; i++) {
			average += trucksArr[i].getRating();
		}
		avgRating = average / numOfTrucks;
	}

	public void printMenu() {
		System.out.println();
		System.out.print("\t\t");
		System.out.println("-------------**MENU**-------------");
		System.out.println("1. View Food Trucks");
		System.out.println("2. View Average Rating");
		System.out.println("3. View Highest Rated");
		System.out.println("4. Exit");
		System.out.println();
	}

	public void menuSelect() {
		int selection = 0;
		while (selection != 4) {
			printMenu();
			System.out.print("> ");
			selection = kb.nextInt();

			switch (selection) {
			case 1:
				for (int i = 0; i < trucksArr.length; i++) {
					System.out.println(trucksArr[i].toString());
				}
			case 2:
				System.out.println(avgRating);
			case 3:
			}
		}
	}
}
