package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI10 {

	private JFrame frame;
	private JLabel lblID;
	private JLabel lblPassword;
	private JTextField tfID;
	private JPasswordField pfPassword;
	private JButton btnOK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI10 window = new GUI10();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblID());
		frame.getContentPane().add(getLblPassword());
		frame.getContentPane().add(getTfID());
		frame.getContentPane().add(getPfPassword());
		frame.getContentPane().add(getBtnOK());
	}

	private JLabel getLblID() {
		if (lblID == null) {
			lblID = new JLabel("UserID :");
			lblID.setBounds(30, 35, 81, 16);
		}
		return lblID;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("Password :");
			lblPassword.setBounds(30, 73, 81, 16);
		}
		return lblPassword;
	}
	private JTextField getTfID() {
		if (tfID == null) {
			tfID = new JTextField();
			tfID.setBounds(123, 30, 130, 26);
			tfID.setColumns(10);
		}
		return tfID;
	}
	private JPasswordField getPfPassword() {
		if (pfPassword == null) {
			pfPassword = new JPasswordField();
			pfPassword.setBounds(123, 68, 130, 26);
		}
		return pfPassword;
	}
	private JButton getBtnOK() {
		if (btnOK == null) {
			btnOK = new JButton("OK");
			btnOK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				loginShow();
				}
			});
			btnOK.setBounds(277, 68, 117, 29);
		}
		return btnOK;
	}
	
	public void loginShow() {
		
		String stID = tfID.getText();
		char[] chPassword = pfPassword.getPassword();
		String stPassword = new String(chPassword);
		
		if(stID.equals("abc")&&stPassword.equals("1234")) {
			Welcome welcome = new Welcome();
			welcome.setVisible(true);
		}else {
			JOptionPane.showMessageDialog(null, "Not accessible");
		}
		
	}
	
	
	
	
}
