/**
 * 
 */
package org.mql.java.annotations;

/**
 * @author MOUKHAFI Anass
 *
 * Oct 31, 2022
 */
public @interface TextField {
	String label() default "";
	int size();
}
