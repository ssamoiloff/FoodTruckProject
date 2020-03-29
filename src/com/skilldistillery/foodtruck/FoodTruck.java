package com.skilldistillery.foodtruck;

public class FoodTruck {

	private static String[] truckName = {"Aiberto's Tacos", "Tony's Hot Dogs", "Old Oak Oven",
										"Krusty's 'Rona Burger", "Samurai Sushi"};
	private static String[] foodType = {"Burritos", "Ballpark Franks", "Sicilian Pizza",
										"Bat Burgers", "Japanese Cuisine"};
	private int uniqueID;
	private int rating;
	
	public FoodTruck() {
	}
	public FoodTruck(int uniqueID) {
		this.uniqueID = uniqueID;
	}
	public FoodTruck(int uniqueID, int rating) {
		this.uniqueID = uniqueID;
		this.rating = rating;
	}
	public static String[] getTruckName() {
		return truckName;
	}
	public static String[] getFoodType() {
		return foodType;
	}
	public int getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(int uniqueID) {
		this.uniqueID = uniqueID;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
		
}
