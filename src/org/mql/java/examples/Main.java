/**
 * 
 */
package org.mql.java.examples;

import javax.swing.JFrame;

import org.mql.java.models.Author;
import org.mql.java.models.Document;
import org.mql.java.reflection.FormAnnotationEngine;
import org.mql.java.ui.Form;

/**
 * @author MOUKHAFI Anass
 *
 * Oct 31, 2022
 */
public class Main extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private Form form;
	/**
	 * 
	 */
	public Main() {
		exp02();
		setContentPane(form);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack(); // calls the preferred sizes internally
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	void exp01() {
		FormAnnotationEngine engine = new FormAnnotationEngine(new Author());
		form = engine.getForm();
	}
	
	void exp02() {
		FormAnnotationEngine engine = new FormAnnotationEngine(new Document());
		form = engine.getForm();
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
