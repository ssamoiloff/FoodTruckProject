package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {
	Scanner kb = new Scanner(System.in);
	private int numOfTrucks = 0;
	private FoodTruck[] trucksArr;
	private double avgRating;

	public static void main(String[] args) {
		FoodTruckApplication f = new FoodTruckApplication();

		f.run(); // Starts app
	}

	public void run() {

		printBanner();
		inputInfo();
		menuSelect();

		kb.close();
	}

//	First thing you see
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

//	Get initial data
	public void inputInfo() {
		boolean isValid = true;
		String name = null;
		String food = null;
		double rating = 0.0;
		System.out.print("How many trucks would you like to input? [1-5]: ");
		while (isValid) {
			numOfTrucks = kb.nextInt();
			System.out.println();
			if (numOfTrucks > 5 || numOfTrucks == 0) {
				System.err.println("Please enter a value between 1-5");
			} else {
				trucksArr = new FoodTruck[numOfTrucks];
				isValid = false;
			}
		}

		for (int i = 0; i < numOfTrucks; i++) {
			System.out.print("Enter the name of truck #" + (i + 1) + " (type \"quit\" to finish): ");
			kb.nextLine();
			name = kb.nextLine();
			if (name.equals("quit")) {
				break;
			}
			System.out.print("Enter type of food: ");
			food = kb.nextLine();
			System.out.print("Enter truck #" + (i + 1) + " rating (1-5): ");
			rating = kb.nextDouble();
			while (rating < 1.0 || rating > 5.0) {
				System.out.println();
				System.out.println("*** Ratings are on a scale of 1-5 ***\n");
				System.out.print("Enter truck #" + (i + 1) + " rating (1-5): ");
				rating = kb.nextDouble();
			}

			trucksArr[i] = new FoodTruck(name, food, rating);
			System.out.println();
		}

	}

//	Calculates average rating and stores it in avgRating
	public void calcAvg() {
		double average = 0.0;
		int counter = 0;
		for (int i = 0; i < numOfTrucks; i++) {
			if (trucksArr[i] == null) {
				break;
			}
			average += trucksArr[i].getRating();
			counter++;
		}
		avgRating = average / counter;
	}

//	Finds highest rated food truck
	public int getHighest() {
		double highestRating = trucksArr[0].getRating();
		int highestID = trucksArr[0].getId();
		for (int i = 0; i < numOfTrucks; i++) {
			if (trucksArr[i] == null) {
				break;
			}
			double currentRating = trucksArr[i].getRating();
			int currentID = trucksArr[i].getId();
			if (highestRating < currentRating) {
				highestRating = currentRating;
				highestID = currentID;
			}
		}
		return highestID - 1;
	}

//	Prints out user menu after initial data input
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

//	Loops menu until exit condition
	public void menuSelect() {
		int selection = 0;
		while (selection != 4) {
			printMenu();
			System.out.print("> ");
			selection = kb.nextInt();

			switch (selection) {
			case 1:
				for (int i = 0; i < trucksArr.length; i++) {
					if (trucksArr[i] == null) {
						break;
					} else {
						System.out.println(trucksArr[i].toString());
						System.out.println("\t---------------------------");
					}
				}
				break;

			case 2:
				calcAvg();
				System.out.println("\tAverage Rating: " + avgRating);
				break;

			case 3:
				System.out.println("\tHighest Rated Food Truck:\n");
				System.out.println(trucksArr[getHighest()].toString());
				break;

			case 4:
				System.out.println();
				System.out.println("\t\tThanks for using my app!");
				System.out.println("\t\t\tGoodbye!");
				System.exit(0);
			}
		}
	}
}
