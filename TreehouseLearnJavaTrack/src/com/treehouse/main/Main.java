package com.treehouse.main;

import java.util.Scanner;




public class Main {

		public static void main(String[] args) {

			//Declared mission:		
			System.out.println("We are going to make a new PEZ Dispenser");
			
		//Created a New Scanner to receive input, giving a title to our new creation
			Scanner text = new Scanner(System.in); 
			 System.out.println("What is your full name?  ");
			 String heroName = text.nextLine(); 

		//Using our Pez Dispenser class, we created a constructor for a pez dispenser
			PezDispenser dispenser = new PezDispenser(heroName);

		//Gave the title
			System.out.printf("The new pez dispenser is called '%s' %n",
					dispenser.getCharacterName());
			
		//Calling the CONSTANT static variable I created:
			System.out.printf("FUN FACT: There are %d PEZ allowed in every dispenser\n",
					PezDispenser.MAX_PEZ);
			
		//Calling the methods to fill and empty the dispenser during production	
			if (dispenser.isEmpty()) {
				System.out.println("Dispenser is Empty!!");
			}
			
			System.out.println("The dispenser is being filled with delicioius PEZ...");
			dispenser.fill();
			
			if (!dispenser.isEmpty()) {
				System.out.println("Dispenser is Full!");
			}
		//Calling the method used for decremation		
			while (dispenser.dispense()) {
			 System.out.println("CHOMP!!");
			}
			
			if (dispenser.isEmpty()) {
			 System.out.println("Youe ate all the Pez!!");		 
			}
		//Using the overloaded method "fill" ex multiple methods of the same name!!!
			dispenser.fill(4);
			dispenser.fill(2);
			while (dispenser.dispense()) {
				System.out.println("CHOMP!!!!");
			}
			
		//Introducing runtime throwing and catching exceptions but not allowing the user to overfill the pez dispensers :)		
			try {
				dispenser.fill(400);
				System.out.println("This will never happen!!");
			} catch (IllegalArgumentException iae) {
				System.out.println("Woah there!");
				System.out.printf("That error was %s",
						iae.getMessage());
			}
			
		//Created a class to show url and reason why its important for pez dispensers
			NameAndLink link = new NameAndLink("3D Printing of Pez Dispensers", 
					"http://www.instructables.com/id/Personalized-3D-Printed-PEZ-Dispensers/");
			
		//Final Message:
			System.out.printf("Why is this important, because when you cerate "
					+ "objects in the world of programming..."+"\nThere is always a reason: \n%s, \n%s", 
							link.name, link.url);

		}
			
		
}
