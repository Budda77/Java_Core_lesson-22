package ua.lviv.lgs;

public class ApplicationLambda {
	public static void main(String[] args) {
		
		MathOperations add = (int a, int b) -> a+b;
		MathOperations substract = (int a, int b) -> a-b;
		MathOperations multiply = (int a, int b) -> {return a*b;};
		MathOperations devision = (int a, int b) -> {return a/b;};
		
		System.out.println(operate(2,5, add));
		System.out.println(operate(19,5, substract));
		System.out.println(operate(5,4, multiply));
		System.out.println(operate(100,20, devision));
		
		Greeting hi1 = message -> System.out.println(message); 
		Greeting hi2 = message -> System.out.println(message +"Mary Christmas"); 
		
		hi1.sayHi("Hi folks");
		hi2.sayHi("Hi Dude ");
		
	}
	
	private static int operate(int a, int b, MathOperations operation) {
		return operation.operation(a, b);
	}
}

	interface MathOperations {
	
	int operation(int a, int b);
	}
	
	interface Greeting {
		void sayHi(String msg);
	}
	
	
	
	
	
	
	