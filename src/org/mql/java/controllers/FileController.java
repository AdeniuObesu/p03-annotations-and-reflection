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
@Controller("File")
public class FileController {
	/**
	 * 
	 */
	public FileController() {
		// TODO Auto-generated constructor stub
	}
	
	@Action(value="New", icon="new.gif")
	public String newFile() {
		System.out.println(">> New file");
		return "new-file-ok.jsp";
	}
	
	@Action(value="Open", icon="open.gif")
	public String open() {
		System.out.println(">> Open file");
		return "open-file-ok.jsp";
	}

	@Action(value="Open", icon="save.gif")
	public String save() {
		System.out.println(">> Save file");
		return "save-file-ok.jsp";
	}

	@Action(value="Save as...")
	public String saveAs() {
		System.out.println(">> Save as file a new file");
		return "save-as-file-ok.jsp";
	}

	@Action(value="Exit")
	public String exit() {
		System.out.println(">> Close the application");
		return "exit.jsp";
	}
}
