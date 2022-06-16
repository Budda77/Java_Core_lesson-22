/*
 * LOGOS It Academy home work 21
 * Task 1
 * 
 * */

package ua.lviv.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;

/**
 * This program to demonstrate how to create a user`s annotation.
 * @author Oleksandr
 * @param input parameters is String.
 * @exception IOException
 * 
 */

public class MainAnnotation {
	public static void main(String[] args) throws IOException {
		
		// Deriving annotation parameters to a string.
		String annotationData = getAnnotatedFieldsAndValues(Car.class);
		
		File file = new File("annotationSetting.txt");
		
		// The method to write annotation parameters to a file.
		writeDate(file, annotationData);
		
		//The methods to read annotation parameters from a file.
		System.out.println(readData(file));
			
	}
	
	
	public static String getAnnotatedFieldsAndValues(Class<?> customClass) {

		StringBuilder sb = new StringBuilder();
		Field[] fields = customClass.getDeclaredFields();

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];

			if(field.getAnnotation(MyAnnotation.class) instanceof MyAnnotation) {

				sb.append("\n"+field.getAnnotation(MyAnnotation.class).annotationType()+"--->");			
				sb.append(" type: " +field.getType());
				sb.append(" field: "+field.getName());
				sb.append(" annotation value: " + field.getAnnotation(MyAnnotation.class).value());
			}
		}
		return sb.toString();
	}
	
	
	public static void writeDate(File file, String data) throws IOException {
		OutputStream os = new FileOutputStream(file);
		os.write(data.getBytes());
		os.close();	
	}
	
	public static String readData(File file) throws IOException {
		InputStream is = new FileInputStream(file);
		int information;  	
		char data;
		StringBuilder st = new StringBuilder();
		
		while((information = is.read()) != -1){
			data = (char)information;
			st.append(data);
		}
		is.close();
		
		return st.toString();
	}
}
