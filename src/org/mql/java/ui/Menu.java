/**
 * 
 */
package org.mql.java.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;

import javax.swing.Icon;
import javax.swing.ImageIcon;
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
	private final String iconsFolder = "resources/icons/"; 
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
					ImageIcon icon = new ImageIcon(iconsFolder + a.icon());
					JMenuItem item = new JMenuItem(name, icon);
					menu.add(item);
					item.addActionListener(new ItemListener(controller, method));
				}
			}
		}
	}
	
	public class ItemListener implements ActionListener {
		private Object controller;
		private Method method;
		
		public ItemListener(Object controller, Method method) {
			super();
			this.controller = controller;
			this.method = method;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				String result = (String) method.invoke(controller);
				System.out.println(">>> Result : " + result);
			} catch (Exception ex) {
				System.out.println("Erreur : " +ex.getMessage());
			}
		}
	}
}
