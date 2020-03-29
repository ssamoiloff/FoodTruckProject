package com.skilldistillery.foodtruck;

public class FoodTruck {
	private static int id = 1;
	private int uniqueId;
	private String truckName;
	private String foodType;
	private int rating;
	
	public FoodTruck() {
	}
	public FoodTruck(String truckName, String foodType, int rating) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
		uniqueId = id;
		id++;
	}
	public String getTruckName() {
		return truckName;
	}
	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getId() {
		return uniqueId;
	}
	public void setId(int _id) {
		uniqueId = _id;
	}
	@Override
	public String toString() {
		return "Truck " + getId() + ": " + getTruckName() + "\nType of food: " + getFoodType() + "\nRating: "
				+ getRating();
	}
	
	
}
