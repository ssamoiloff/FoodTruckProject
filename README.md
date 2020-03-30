# Food Truck Project - Week 2 Skill Distillery

### Overview
This program lists basic information on up to 5 food trucks, which the user inputs.

The user is first greeted with a welcome message, followed by a prompt to input the total number food trucks they would like to enter information for.

	 _______________________________________________
	|***********************************************|
	|**                                           **|
	|**  Welcome to the official Food Truck App!  **|
	|**     Begin by filling in fields below      **|
	|**                                           **|
	|***********************************************|
	 -----------------------------------------------
	
	How many trucks would you like to input? [1-5]: 5


Once a valid input is entered, the user is prompted to input the food truck name, type of food, and rating. If they decide to change their mind and stop input before reaching the number of trucks they initially entered, they can enter "quit" as the name of the next food truck. This will end the data entry portion and move on to the rest of the program.

	Enter the name of truck #1 (type "quit" to finish): Krusty's 'Rona Burger
	Enter type of food: Diseased Burgers
	Enter truck #1 rating (1-5): 2.4
	
	Enter the name of truck #2 (type "quit" to finish): Virexpress
	Enter type of food: BBQ Bats
	Enter truck #2 rating (1-5): 3.0
	
	Enter the name of truck #3 (type "quit" to finish): COVID Corner
	Enter type of food: Antibody Brisket
	Enter truck #3 rating (1-5): 4.9
	
	Enter the name of truck #4 (type "quit" to finish): Pandemic Express
	Enter type of food: Surgeon General Tso's Chicken
	Enter truck #4 rating (1-5): 3.6
	
	Enter the name of truck #5 (type "quit" to finish): McDonald's
	Enter type of food: Complete Filth
	Enter truck #5 rating (1-5): 1.0

The menu has 4 options: 1. View Food Trucks, 2. View Average Rating, 3. View Highest Rated, and 4. Exit.

(This menu loops until the user chooses menu option 4)

				-------------**MENU**-------------
	1. View Food Trucks
	2. View Average Rating
	3. View Highest Rated
	4. Exit

Choosing menu option 1 displays a list of all food trucks that the user has entered.

	> 1
			Truck #1:	Krusty's 'Rona Burger
			Type of food:	Diseased Burgers
			Rating:		2.4
			---------------------------
			Truck #2:	Virexpress
			Type of food:	BBQ Bats
			Rating:		3.0
			---------------------------
			Truck #3:	COVID Corner
			Type of food:	Antibody Brisket
			Rating:		4.9
			---------------------------
			Truck #4:	Pandemic Express
			Type of food:	Surgeon General Tso's Chicken
			Rating:		3.6
			---------------------------
			Truck #5:	McDonald's
			Type of food:	Complete Filth
			Rating:		1.0
			---------------------------

Choosing menu option 2 displays the average rating of all food trucks entered.

	> 2
			Average Rating: 2.98

Choosing menu option 3 displays the highest rated food truck and its details.

	> 3
			Highest Rated Food Truck:
	
			Truck #3:	COVID Corner
			Type of food:	Antibody Brisket
			Rating:		4.9

Choosing menu option 4 displays a farewell message and exits the application.

	> 4
	
				Thanks for using my app!
						Goodbye!

### Technologies Used
- Java SE13
- Eclipse
- Atom
- MacOS Terminal
- GitHub/Git

### Lessons Learned
* In this project, I became significantly more aware of general syntax when passing values into and returning from methods and object instances.


* When an issue at runtime arises, the solution doesn't always have to be a complete refactoring of code (although it should probably be written more efficiently next time).


* Testing, testing, and more testing. Just when you think you're finished, NOPE! There are always bugs.
