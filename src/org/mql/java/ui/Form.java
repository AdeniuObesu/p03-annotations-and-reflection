/**
 * 
 */
package org.mql.java.ui;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 * @author MOUKHAFI Anass
 *
 * Oct 31, 2022
 */
public class Form extends JPanel {
	private static final long serialVersionUID = 1l;
	
	private int labelWidth = 120;
	private JPanel container;
	/**
	 * 
	 */
	public Form(String title) {
		this(title, 120);
	}
	
	public Form(String title, int labelWidth) {
		container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		add(container);
		
		EtchedBorder border = new EtchedBorder();
		container.setBorder(new TitledBorder(border, title));
	}
	
	public void add(LabeledTextField field) {
		container.add(field);
	}
	
	public void add(String label, int size) {
		container.add(new LabeledTextField(label, size, labelWidth));
	}
}
