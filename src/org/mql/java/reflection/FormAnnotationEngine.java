/**
 * 
 */
package org.mql.java.reflection;

import java.lang.reflect.Field;

import org.mql.java.annotations.Form;
import org.mql.java.annotations.TextField;

/**
 * @author MOUKHAFI Anass
 *
 * Oct 31, 2022
 */
public class FormAnnotationEngine {
	/**
	 * 
	 */
	public FormAnnotationEngine(Object target) {
		Form form = target.getClass().getDeclaredAnnotation(Form.class);
		if(form != null) {
			String title = form.value();
			if("".equals(title)) {
				title = "New " + target.getClass().getSimpleName();
			}
			System.out.println("Title : " + title);
			Field[] fields = target.getClass().getDeclaredFields();
			for(Field field : fields) {
				TextField tf = field.getDeclaredAnnotation(TextField.class);
				if( tf!= null ) {
					String label = tf.label();
					if("".equals(label))
						label = field.getName();
					System.out.println(" - " + label + " : "+ tf.size());
				}
			}
		}
	}
}
