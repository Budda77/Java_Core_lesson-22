package ua.lviv.lgs;

import java.sql.SQLClientInfoException;
import java.util.Optional;

public class ApplicationOptional {

	public static void main(String[] args) throws SQLClientInfoException {
		
		// 1. empty optional
		Optional<String> emptyObj = Optional.empty();
		
		if(!emptyObj.isPresent()) {
			System.out.println("emptyObj is empty.");
		}
		
		// 2. create optional
		
		String testName = "Logos";
		Optional<String> ofObj = Optional.of(testName);
		
		if(!ofObj.isPresent()) {
			System.out.println("ofObj is empty.");
		}
		
		//3. work with null
		
		 testName = null;
		Optional<String> nullableObj = Optional.ofNullable(testName);
		
		if(!nullableObj.isPresent()) {
			System.out.println("nullableObj is empty.");
		}
		
		//4. if-present
		
		Optional<String> optObj = Optional.of("test from logos");
		optObj.ifPresent(o-> System.out.println(o.length()));
		
		//5. or-else
		String nameObj = Optional.ofNullable(testName).orElse("Default string");
		System.out.println(nameObj);
		
		//6. orElseGet
		
		nameObj = Optional.ofNullable(testName).orElseGet(()->"run forest run");
		System.out.println(nameObj);
		
		//7. or-else throw		
		//nameObj = Optional.ofNullable(testName).orElseThrow(SQLClientInfoException::new);
		
		//8. get
		
		optObj = Optional.of("test name");
		System.out.println(optObj.get());
		
		// 9. filter
		Integer year = 2022;
		Optional<Integer> yearOptional = Optional.of(year);
		boolean is2022 = yearOptional.filter(y->y==2022).isPresent();
		boolean is2023 = yearOptional.filter(y->y==2023).isPresent();
		System.out.println("It is 2022 year = "+is2022);
		System.out.println("It is 2022 year = "+is2023);
		
		
		
		
	}

}
