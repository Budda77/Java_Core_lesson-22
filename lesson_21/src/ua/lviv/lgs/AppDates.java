package ua.lviv.lgs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;


public class AppDates {

	public static void main(String[] args) {
		
		System.out.println("LocalDate:");
	
		LocalDate ld = LocalDate.now();
		
		System.out.println(ld);
		System.out.println(ld.plusDays(2).plusWeeks(2).plusYears(2));
		System.out.println(ld.isLeapYear());
		System.out.println(ld.atStartOfDay());
		System.out.println(ld.atTime(22,58));
		System.out.println(ld.lengthOfYear()+" "+ ld.getDayOfYear());
		System.out.println(ld.get(ChronoField.YEAR));
		
		System.out.println("\nLocalTime:\n");
		
		LocalTime lt = LocalTime.now();
		
		System.out.println(lt);
		System.out.println(lt.plusHours(2).plusMinutes(20).plusSeconds(10));
		System.out.println(lt.truncatedTo(ChronoUnit.HOURS));
		
		System.out.println("\nLocalDateTime:\n");
		
		LocalDateTime cdt = LocalDateTime.now();
		System.out.println(cdt);
		System.out.println(cdt.plusDays(2).plusWeeks(2).plusYears(2));
		System.out.println(cdt.plusHours(2).plusMinutes(20).plusSeconds(10));
		
		
	}

}
