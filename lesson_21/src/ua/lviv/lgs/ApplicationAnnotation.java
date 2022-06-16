package ua.lviv.lgs;

import java.lang.reflect.Field;

public class ApplicationAnnotation {

	public static void main(String[] args) {
		
		
		System.out.println("Get Annotation Value");
		getAnnotationValue(Droid.class);
		System.out.println("\nGet NOT Annotation Value");
		getNotAnnotationValue(Droid.class);
		System.out.println();
		System.out.println("\nGet Annotated Fields And Values");
		getAnnotatedFieldsAndValues(Student.class);
		

	}
	
	public static void getAnnotationValue(Class<?> customClass) {

		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if(field.getAnnotation(Fielder.class) instanceof Fielder) {
				System.out.print(field.getName()+ " ----- ");
				System.out.println(" annotation value - " + field.getAnnotation(Fielder.class).params());
			}
		}
	}
	
	public static void getNotAnnotationValue(Class<?> customClass) {

		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if(!(field.getAnnotation(Fielder.class) instanceof Fielder)) {
				System.out.print(field.getType()+ " "+ field.getName()+ " ----- ");
			}
		}
	}
	
	
	public static void getAnnotatedFieldsAndValues(Class<?> customClass) {

		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			field.getAnnotation(StudentSocial.class).annotationType();
			if(field.getAnnotation(StudentSocial.class) instanceof StudentSocial) {
				System.out.println(field.getType()+ " -- "+field.getName()+ " -----> ");
				System.out.println(" annotation type - " + field.getAnnotation(StudentSocial.class).annotationType());			
				System.out.println(" annotation value - " + field.getAnnotation(StudentSocial.class).value());
			}
		}
	}
	
	
	
	
	
	

}
