/**
 * 
 */
package org.mql.java.controllers;

import org.mql.java.annotations.Action;
import org.mql.java.annotations.Controller;

/**
 * @author MOUKHAFI Anass
 *
 * Nov 7, 2022
 */
@Controller("Edit")
public class EditController {
	
	/**
	 * 
	 */
	public EditController() {
		// TODO Auto-generated constructor stub
	}

	@Action(value="Copy", icon="Copy.gif")
	public String copy() {
		System.out.println("Copy");
		return "copy.jsp";
	}

	@Action(value="Cut", icon="Cut.gif")
	public String cut() {
		System.out.println("Cut");
		return "cut.jsp";
	}

	@Action(value="Paste", icon="Paste.gif")
	public String paste() {
		System.out.println("Paste");
		return "paste.jsp";
	}
	
	public void service() {
		
	}
}
