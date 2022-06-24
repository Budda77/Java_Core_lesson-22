package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMethodReference {
	public static void main(String[] args) {
		
		List<String> nameOfpeople = new ArrayList();
		nameOfpeople.add("Ivan");
		nameOfpeople.add("Petro");
		nameOfpeople.add("John");
		nameOfpeople.add("Chris");
		nameOfpeople.add("Simon");
		nameOfpeople.add("Yura");
		
		nameOfpeople.forEach(System.out::println);
		
		
	}

}
