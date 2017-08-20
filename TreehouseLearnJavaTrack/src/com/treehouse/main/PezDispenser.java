package com.treehouse.main;
//name of class
public class PezDispenser {
	
//CONSTANTS Variables are capitals	
	final static public int MAX_PEZ = 12;
	
	private int pezCount;
	
//provide the variables for name, that cannot be changed (protected)
	final private String characterName;
	
//adding constructor to create pez dispenser	with the parameter "name"
	public PezDispenser (String name) {
		this.characterName = name;
		pezCount = 0;
	}
	
	//Writing a method that functions as Getter example:
	//String.contains
	//returns a boolean(String MatchingText)
	//methods and functions below -->
	
	//Introducing decrements with if statements
	public boolean dispense () {
		boolean wasDispensed = false;
		if (!isEmpty()) {
			pezCount--;
			wasDispensed = true;
		}
		return wasDispensed;
	}
	
	public boolean isEmpty () {
		return pezCount == 0;	
	}
	
	
	//Example of Overloading a method
	public void fill (int pezAmount) {
		int newAmount = pezCount += pezAmount;
		if (newAmount > MAX_PEZ) {
			throw new IllegalArgumentException("TOO MANY PEZ!");
		}
		pezCount = newAmount;
	}
	
	public void fill () {
		fill(MAX_PEZ);
	}
	public String getCharacterName() {
		return  characterName;
	}
	
}
	
