/**
 * 
 */
package org.mql.java.examples;

import javax.swing.JFrame;

import org.mql.java.controllers.EditController;
import org.mql.java.controllers.FileController;
import org.mql.java.controllers.InternalService;
import org.mql.java.ui.Menu;

/**
 * @author MOUKHAFI Anass
 *
 * Nov 7, 2022
 */
public class MenuGenerator extends JFrame {
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	public MenuGenerator() {
		exp01();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	void exp01() {
		Menu menu = new Menu();
		setJMenuBar(menu);
		menu.add(new FileController());
		menu.add(new EditController());
		menu.add(new InternalService());
	}
	public static void main(String[] args) {
		new MenuGenerator();
		
	}
}
