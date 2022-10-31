/**
 * 
 */
package org.mql.java.examples;

import java.lang.reflect.Field;

import org.mql.java.models.Author;
import org.mql.java.reflection.FormAnnotationEngine;

/**
 * @author MOUKHAFI Anass
 *
 * Oct 31, 2022
 */
public class Examples {
	
	/**
	 * 
	 */
	public Examples() {
		exp01();
		exp02();
	}
	
	void exp01() {
		Author a1 = new Author(101, "Eric Gamma", 1961, "Suisse");
		Class<?> c1 = a1.getClass();
		Field fields[] = c1.getDeclaredFields();
		for(Field field : fields){
			System.out.print(field.getName() + " : ");
			field.setAccessible(true);
			try {
				System.out.println(field.get(a1));
			} catch (Exception e) { }
			field.setAccessible(false);
		}
		
		
		
		Class<?> c2 = Author.class;
		
		String className = "org.mql.java.models.Author";
		try {
		Class<?> c3 = Class.forName(className);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	void exp02() {
		new FormAnnotationEngine(new Author());
	}
	
	public static void main(String[] args) {
		new Examples();
	}
}
