/**
 * 
 */
package org.mql.java.models;

import org.mql.java.annotations.Form;
import org.mql.java.annotations.TextField;

/**
 * @author MOUKHAFI Anass
 *
 * Oct 31, 2022
 */
@Form("Nouveau Document")
public class Document {
	@TextField(label ="Identificateur", size = 10)
	private int id;
	/**
	 * 
	 */
	public Document() {
		
		// TODO Auto-generated constructor stub
	}
}
