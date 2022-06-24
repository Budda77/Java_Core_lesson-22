/*
 * LOGOS It Academy home work 22
 * Task 1
 * 
 * */

package ua.lviv.homeworkpet;

/**
 * This program to demonstrate how to use Method Reference in Lambda expressions.
 * @author Oleksandr
 * 
 */

public class MainPet {
	public static void main(String[] args) {
		
		
		Cat cat = new Cat();
		Cow cow = new Cow();
		Dog dog = new Dog();
		
		Pet function = cat::voice;
		System.out.println(function.voice());	
		
		function = cow::voice;
		System.out.println(function.voice());
		
		function = dog::voice;
		System.out.println(function.voice());
			
		
	}

}
