package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI00 {

	private JFrame frmJavaSwingTest;
	private JButton btnNewButton;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI00 window = new GUI00();
					window.frmJavaSwingTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI00() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavaSwingTest = new JFrame();
		frmJavaSwingTest.setTitle("Java Swing Test");
		frmJavaSwingTest.setBounds(100, 100, 450, 300);
		frmJavaSwingTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavaSwingTest.getContentPane().setLayout(null);
		frmJavaSwingTest.getContentPane().add(getBtnNewButton());
		frmJavaSwingTest.getContentPane().add(getLblNewLabel());
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("OK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "OK버튼을 눌렀습니다.");
				
				}
			});
			btnNewButton.setBounds(160, 102, 117, 29);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Java Swing Button Test");
			lblNewLabel.setBounds(25, 6, 142, 16);
		}
		return lblNewLabel;
	}
}
