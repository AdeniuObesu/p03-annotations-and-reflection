/**
 * 
 */
package org.mql.java.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author MOUKHAFI Anass
 *
 * Oct 31, 2022
 */
public class LabeledTextField extends JPanel{
	private static final long serialVersionUID = 1l; 
	/**
	 * 
	 */
	public LabeledTextField(String label, int size) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		if(!label.contains(":")) label = label + " : ";
		JLabel l1 = new JLabel(label);
		JTextField t1 = new JTextField(size);
		add(l1);
		add(t1);
	}
	public LabeledTextField(String label, int size, int labelWidth) {
		this(label, size);
		JLabel l1 = (JLabel) getComponent(0);
		// I cannot call setSize using l1, however we can call setPreferredSize
		l1.setPreferredSize(
				new Dimension(labelWidth, l1.getPreferredSize().height)
				);
	}
}
