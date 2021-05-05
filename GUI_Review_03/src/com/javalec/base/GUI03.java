package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI03 {

	private JFrame frame;
	private JComboBox cbDanNumber;
	private JComboBox cbCalc;
	private JComboBox cbMulNumber;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03 window = new GUI03();
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
	public GUI03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 93);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getCbDanNumber());
		frame.getContentPane().add(getCbCalc());
		frame.getContentPane().add(getCbMulNumber());
		frame.getContentPane().add(getTextField());
	}

	private JComboBox getCbDanNumber() {
		if (cbDanNumber == null) {
			cbDanNumber = new JComboBox();
			cbDanNumber.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			cbDanNumber.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4", "5", "6", "7", "8", "9"}));
			cbDanNumber.setBounds(26, 18, 86, 27);
		}
		return cbDanNumber;
	}
	private JComboBox getCbCalc() {
		if (cbCalc == null) {
			cbCalc = new JComboBox();
			cbCalc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			cbCalc.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "X", "/"}));
			cbCalc.setBounds(124, 18, 67, 27);
		}
		return cbCalc;
	}
	private JComboBox getCbMulNumber() {
		if (cbMulNumber == null) {
			cbMulNumber = new JComboBox();
			cbMulNumber.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				result();
				}
			});
			cbMulNumber.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
			cbMulNumber.setBounds(203, 18, 86, 27);
		}
		return cbMulNumber;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			textField.setEditable(false);
			textField.setBounds(301, 17, 130, 26);
			textField.setColumns(10);
		}
		return textField;
	}
	
	private void result() {
		
		int wkNum1 = cbDanNumber.getSelectedIndex()+2;
		int wkNum2 = cbMulNumber.getSelectedIndex()+1;
		int wkCalc = cbCalc.getSelectedIndex();
		
		switch (wkCalc) {
		case 0:
			textField.setText(Integer.toString(wkNum1+wkNum2));
			break;
		case 1:
			textField.setText(Integer.toString(wkNum1-wkNum2));
			break;
		case 2:
			textField.setText(Integer.toString(wkNum1*wkNum2));
			break;	
		default:
			try {
				
				textField.setText(String.format("%.2f", (double)wkNum1/wkNum2));
			}catch (Exception e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			break;
		}
		
		
	}
	
	
}
