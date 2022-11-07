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
 * Nov 7, 2022
 */
@Target(ElementType.METHOD) // s'appliquera aux methodes
@Retention(RetentionPolicy.RUNTIME)
public @interface Action {
	String value() default "";
	String icon() default "";
}
