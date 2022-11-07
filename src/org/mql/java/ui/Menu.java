/**
 * 
 */
package org.mql.java.ui;

import java.lang.reflect.Method;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.mql.java.annotations.Action;
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
			add(menu); // accroche un menu a un JMenu
			
			Method methods[] = controller.getClass().getDeclaredMethods();
			for(Method method : methods) {
				Action a = method.getDeclaredAnnotation(Action.class);
				if(a != null) {
					String name = a.value();
					if(name.equals(""))
						name = method.getName();
					JMenuItem item = new JMenuItem(name);
					menu.add(item);
				}
			}
		}
	}
}
