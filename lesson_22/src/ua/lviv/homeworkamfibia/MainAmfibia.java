/*
 * LOGOS It Academy home work 22
 * Task 2
 * 
 * */

package ua.lviv.homeworkamfibia;

/**
 * This program to demonstrate how to use Lambda expressions.
 * @author Oleksandr
 * 
 */

public class MainAmfibia {

	public static void main(String[] args) {
		
		Amfibia function = (action)-> action;
		
		Frog frog = new Frog();
		frog.actionFrog(function, "A frog are eating.");
		frog.actionFrog(function, "A frog are sleeping.");
		frog.actionFrog(function, "A frog are swimming.");
		frog.actionFrog(function, "A frog are walking.");
	
	}

}

