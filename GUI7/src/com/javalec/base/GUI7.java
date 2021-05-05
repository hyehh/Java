package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI7 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JTextField tfNum1;
	private JLabel lblNewLabel_1;
	private JTextField tfNum2;
	private JTextField tfNum3;
	private JTextField tfNum4;
	private JTextField tfResult;
	private JLabel lblNewLabel_2;
	private JLabel lblTest;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI7 window = new GUI7();
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
	public GUI7() {
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
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getTfNum3());
		frame.getContentPane().add(getTfNum4());
		frame.getContentPane().add(getTfResult());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getLblTest());
		frame.getContentPane().add(getBtnNewButton());
		frame.getContentPane().add(getBtnNewButton_1());
		frame.getContentPane().add(getBtnNewButton_2());
		frame.getContentPane().add(getBtnNewButton_3());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("1 :");
			lblNewLabel.setBounds(20, 19, 24, 16);
		}
		return lblNewLabel;
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setBounds(47, 14, 67, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("2 :");
			lblNewLabel_1.setBounds(20, 56, 24, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setBounds(47, 51, 67, 26);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}
	private JTextField getTfNum3() {
		if (tfNum3 == null) {
			tfNum3 = new JTextField();
			tfNum3.setEditable(false);
			tfNum3.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum3.setBounds(20, 116, 80, 26);
			tfNum3.setColumns(10);
		}
		return tfNum3;
	}
	private JTextField getTfNum4() {
		if (tfNum4 == null) {
			tfNum4 = new JTextField();
			tfNum4.setEditable(false);
			tfNum4.setHorizontalAlignment(SwingConstants.TRAILING);
			tfNum4.setBounds(131, 116, 80, 26);
			tfNum4.setColumns(10);
		}
		return tfNum4;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfResult.setBounds(252, 116, 130, 26);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("=");
			lblNewLabel_2.setBounds(223, 121, 17, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblTest() {
		if (lblTest == null) {
			lblTest = new JLabel("");
			lblTest.setBounds(101, 121, 24, 16);
		}
		return lblTest;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("+");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sum();
				}
			});
			btnNewButton.setBounds(196, 14, 44, 29);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("-");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					minus();
				}
			});
			btnNewButton_1.setBounds(239, 14, 44, 29);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("X");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				multiple();
				}
			});
			btnNewButton_2.setBounds(283, 14, 44, 29);
		}
		return btnNewButton_2;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("/");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				division();
				}
			});
			btnNewButton_3.setBounds(327, 14, 44, 29);
		}
		return btnNewButton_3;
	}
	
	
	// sum
	private void sum() {
		int wkNum1 = Integer.parseInt(tfNum1.getText());
		int wkNum2 = Integer.parseInt(tfNum2.getText());
		int wkResult = wkNum1 + wkNum2;
		
		tfNum3.setText(tfNum1.getText());
		tfNum4.setText(tfNum2.getText());
		lblTest.setText("+");
		tfResult.setText(Integer.toString(wkResult));
	}
	
	
	// minus
	private void minus() {
		int wkNum1 = Integer.parseInt(tfNum1.getText());
		int wkNum2 = Integer.parseInt(tfNum2.getText());
		int wkResult = wkNum1 - wkNum2;
		
		tfNum3.setText(tfNum1.getText());
		tfNum4.setText(tfNum2.getText());
		lblTest.setText("-");
		tfResult.setText(Integer.toString(wkResult));
	}
	
	// multiple
	private void multiple() {
		int wkNum1 = Integer.parseInt(tfNum1.getText());
		int wkNum2 = Integer.parseInt(tfNum2.getText());
		int wkResult = wkNum1 * wkNum2;
		
		tfNum3.setText(tfNum1.getText());
		tfNum4.setText(tfNum2.getText());
		lblTest.setText("/");
		tfResult.setText(Integer.toString(wkResult));
	}
	
	// division
	private void division() {
		int wkNum1 = Integer.parseInt(tfNum1.getText());
		int wkNum2 = Integer.parseInt(tfNum2.getText());
		if(wkNum1==0&&wkNum2==0) {
			JOptionPane.showMessageDialog(null, "0이 아닌 다른 수를 입력해주세요.");
		}else if(wkNum1!=0&&wkNum2==0) {
			JOptionPane.showMessageDialog(null, "0이 아닌 다른 수를 입력해주세요.");
		}else{
			double wkResult = (double)wkNum1 / wkNum2;
			
			tfNum3.setText(tfNum1.getText());
			tfNum4.setText(tfNum2.getText());
			lblTest.setText("/");
			tfResult.setText(String.format("%.2f", wkResult));
		}
		

			
		
		
		
	}
	
	
}
