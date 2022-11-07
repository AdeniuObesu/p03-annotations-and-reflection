/**
 * 
 */
package org.mql.java.ui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import org.mql.java.annotations.Controller;

/**
 * @author MOUKHAFI Anass
 *
 * Nov 7, 2022
 */
public class Menu extends JMenuBar{
	private static final long serialVersionUID = 1l;
	
	public Menu() {
		
	}
	
	public void add(Object controller) {
		Controller ca = controller.getClass().getDeclaredAnnotation(Controller.class);
		if(ca != null) {
			JMenu menu = new JMenu(ca.value());
			add(menu); // accroche un menu a un JMenuBar
		}
	}
}
