package com.skilldistillery.foodtruck;

public class FoodTruck {
	private String truckName;
	private String foodType;
	private int rating;
	private int id;
	
	public FoodTruck() {
//		uniqueID = ;
	}
	public FoodTruck(String truckName) {
		this.truckName = truckName;
	}
	public FoodTruck(String truckName, String foodType) {
		this.truckName = truckName;
		this.foodType = foodType;
	}
	public FoodTruck(String truckName, String foodType, int rating) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
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
		return id;
	}
	public void setId(int uniqueID) {
		this.id = uniqueID;
	}
	@Override
	public String toString() {
		return "Truck " + getId() + ": " + getTruckName() + "\nType of food: " + getFoodType() + "\nRating: "
				+ getRating();
	}
	
	
}
