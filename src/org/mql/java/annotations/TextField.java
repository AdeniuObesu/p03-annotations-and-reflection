/**
 * 
 */
package org.mql.java.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author MOUKHAFI Anass
 *
 * Oct 31, 2022
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TextField {
	String label() default "";
	int size();
}
