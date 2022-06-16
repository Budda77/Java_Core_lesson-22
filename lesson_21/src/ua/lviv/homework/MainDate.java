/*
 * LOGOS It Academy home work 21
 * Task 2
 * 
 * */
package ua.lviv.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * This program to demonstrate methods how to convert Date to LocalDate, LocalDateTime and LocalTime.
 * @author Oleksandr
 * @param input parameters is Date.
 * 
 */

public class MainDate {

	public static void main(String[] args) {
		

		Date now = new Date();
		System.out.println("Current date: " +now);

		System.out.println("\nMethod to convert from Date to LocalDate:");
		LocalDate ld = convertToLocalDate(now);
		System.out.println(ld);
		
		System.out.println("\nMethod to convert from Date to LocalDateTime:");
		LocalDateTime ldt = convertToLocalDateTime(now);		
		System.out.println(ldt);
		
		System.out.println("\nMethod to convert from Date to LocalTime:");
		LocalTime lt = convertToLocalTime(now);		
		System.out.println(lt);
	}
	

	public static LocalDate convertToLocalDate(Date date) {	
		return LocalDate.ofInstant(date.toInstant(), ZoneId.systemDefault());
	}
	
	public static LocalDateTime convertToLocalDateTime(Date date) {	
		return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
	}
	
	public static LocalTime convertToLocalTime(Date date) {	
		return LocalTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
	}

}
