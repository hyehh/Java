package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI01 {

	private JFrame frmCombobox;
	private JComboBox cbFruits1;
	private JTextField tfFruits1;
	private JTextField tfFruits2;
	private JComboBox cbFruits2;
	private JButton btnFruits;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI01 window = new GUI01();
					window.frmCombobox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCombobox = new JFrame();
		frmCombobox.setTitle("ComboBox");
		frmCombobox.setBounds(100, 100, 450, 300);
		frmCombobox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCombobox.getContentPane().setLayout(null);
		frmCombobox.getContentPane().add(getCbFruits1());
		frmCombobox.getContentPane().add(getTfFruits1());
		frmCombobox.getContentPane().add(getTfFruits2());
		frmCombobox.getContentPane().add(getCbFruits2());
		frmCombobox.getContentPane().add(getBtnFruits());
	}
	private JComboBox getCbFruits1() {
		if (cbFruits1 == null) {
			cbFruits1 = new JComboBox();
			cbFruits1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruits1();
				}
			});
			cbFruits1.setModel(new DefaultComboBoxModel(new String[] {"Apple", "Banana", "Grape"}));
			cbFruits1.setBounds(30, 19, 137, 27);
		}
		return cbFruits1;
	}
	private JTextField getTfFruits1() {
		if (tfFruits1 == null) {
			tfFruits1 = new JTextField();
			tfFruits1.setEditable(false);
			tfFruits1.setBounds(238, 18, 130, 26);
			tfFruits1.setColumns(10);
		}
		return tfFruits1;
	}
	private JTextField getTfFruits2() {
		if (tfFruits2 == null) {
			tfFruits2 = new JTextField();
			tfFruits2.setBounds(30, 88, 130, 26);
			tfFruits2.setColumns(10);
		}
		return tfFruits2;
	}
	private JComboBox getCbFruits2() {
		if (cbFruits2 == null) {
			cbFruits2 = new JComboBox();
			cbFruits2.setBounds(238, 89, 130, 27);
		}
		return cbFruits2;
	}
	private JButton getBtnFruits() {
		if (btnFruits == null) {
			btnFruits = new JButton("Add");
			btnFruits.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruits2();
				}
			});
			btnFruits.setBounds(30, 154, 117, 29);
		}
		return btnFruits;
	}
	
	
	private void fruits1() {
		String fruit = cbFruits1.getSelectedItem().toString();
		tfFruits1.setText(fruit);
	}
	
	
	private void fruits2() {
		String inputFruit = tfFruits2.getText();
		cbFruits2.addItem(inputFruit);
		
	}
	
	
}
