package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI05 {

	private JFrame frame;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JRadioButton rdAdd;
	private JRadioButton rdMinus;
	private JRadioButton rdMultiple;
	private JRadioButton rdDivision;
	private JLabel lblResult;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI05 window = new GUI05();
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
	public GUI05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				rdAdd.setSelected(true);
			}
		});
		frame.setBounds(100, 100, 410, 277);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getRdAdd());
		frame.getContentPane().add(getRdMinus());
		frame.getContentPane().add(getRdMultiple());
		frame.getContentPane().add(getRdDivision());
		frame.getContentPane().add(getLblResult());
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setBounds(26, 30, 99, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setBounds(26, 68, 99, 26);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}
	private JRadioButton getRdAdd() {
		if (rdAdd == null) {
			rdAdd = new JRadioButton("+");
			rdAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			buttonGroup.add(rdAdd);
			rdAdd.setBounds(218, 31, 141, 23);
		}
		return rdAdd;
	}
	private JRadioButton getRdMinus() {
		if (rdMinus == null) {
			rdMinus = new JRadioButton("-");
			rdMinus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			buttonGroup.add(rdMinus);
			rdMinus.setBounds(218, 66, 141, 23);
		}
		return rdMinus;
	}
	private JRadioButton getRdMultiple() {
		if (rdMultiple == null) {
			rdMultiple = new JRadioButton("X");
			rdMultiple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
				
			});
			buttonGroup.add(rdMultiple);
			rdMultiple.setBounds(218, 101, 141, 23);
		}
		return rdMultiple;
	}
	private JRadioButton getRdDivision() {
		if (rdDivision == null) {
			rdDivision = new JRadioButton("/");
			rdDivision.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			buttonGroup.add(rdDivision);
			rdDivision.setBounds(218, 136, 141, 23);
		}
		return rdDivision;
	}
	private JLabel getLblResult() {
		if (lblResult == null) {
			lblResult = new JLabel("");
			lblResult.setBounds(26, 215, 292, 16);
		}
		return lblResult;
	}
	
	private void result() {
		int wkNum1 = Integer.parseInt(tfNum1.getText());
		int wkNum2 = Integer.parseInt(tfNum2.getText());
		
		if(rdAdd.isSelected()==true) {
			lblResult.setText(Integer.toString(wkNum1) + " + " + Integer.toString(wkNum2) + " = " + Integer.toString(wkNum1+wkNum2));
		}
		if(rdMinus.isSelected()==true) {
			lblResult.setText(Integer.toString(wkNum1) + " - " + Integer.toString(wkNum2) + " = " + Integer.toString(wkNum1-wkNum2));
		}
		if(rdMultiple.isSelected()==true) {
			lblResult.setText(Integer.toString(wkNum1) + " X " + Integer.toString(wkNum2) + " = " + Integer.toString(wkNum1*wkNum2));
		}
		if(rdDivision.isSelected()==true) {
			if(wkNum1==0&&wkNum2==0) {
				JOptionPane.showMessageDialog(null, "not available");
			}
			if(wkNum1!=0&&wkNum2==0) {
				JOptionPane.showMessageDialog(null, "not available");
			}
			else {
				
				try{
					lblResult.setText(Integer.toString(wkNum1) + " / " + Integer.toString(wkNum2) + " = " + String.format("%.2f", (double)wkNum1/wkNum2));
				}catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
			
			
			
		}
	}
	
	
	
	
	
	
	
}
