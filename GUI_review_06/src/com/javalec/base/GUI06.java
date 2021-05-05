package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GUI06 {

	private JFrame frame;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JCheckBox chAdd;
	private JCheckBox chMinus;
	private JCheckBox chMultiple;
	private JCheckBox chDivision;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI06 window = new GUI06();
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
	public GUI06() {
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
		frame.getContentPane().add(getTfNum1());
		frame.getContentPane().add(getTfNum2());
		frame.getContentPane().add(getChAdd());
		frame.getContentPane().add(getChMinus());
		frame.getContentPane().add(getChMultiple());
		frame.getContentPane().add(getChDivision());
		frame.getContentPane().add(getLbl1());
		frame.getContentPane().add(getLbl2());
		frame.getContentPane().add(getLbl3());
		frame.getContentPane().add(getLbl4());
	}
	private JTextField getTfNum1() {
		if (tfNum1 == null) {
			tfNum1 = new JTextField();
			tfNum1.setBounds(21, 22, 94, 26);
			tfNum1.setColumns(10);
		}
		return tfNum1;
	}
	private JTextField getTfNum2() {
		if (tfNum2 == null) {
			tfNum2 = new JTextField();
			tfNum2.setBounds(21, 70, 96, 26);
			tfNum2.setColumns(10);
		}
		return tfNum2;
	}
	private JCheckBox getChAdd() {
		if (chAdd == null) {
			chAdd = new JCheckBox("+");
			chAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				result();
				}
			});
			chAdd.setBounds(173, 22, 128, 23);
		}
		return chAdd;
	}
	private JCheckBox getChMinus() {
		if (chMinus == null) {
			chMinus = new JCheckBox("-");
			chMinus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			chMinus.setBounds(173, 55, 128, 23);
		}
		return chMinus;
	}
	private JCheckBox getChMultiple() {
		if (chMultiple == null) {
			chMultiple = new JCheckBox("X");
			chMultiple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					result();
				}
			});
			chMultiple.setBounds(173, 84, 128, 23);
		}
		return chMultiple;
	}
	private JCheckBox getChDivision() {
		if (chDivision == null) {
			chDivision = new JCheckBox("/");
			chDivision.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				result();
				}
			});
			chDivision.setBounds(173, 114, 128, 23);
		}
		return chDivision;
	}
	private JLabel getLbl1() {
		if (lbl1 == null) {
			lbl1 = new JLabel("");
			lbl1.setBounds(28, 162, 236, 16);
		}
		return lbl1;
	}
	private JLabel getLbl2() {
		if (lbl2 == null) {
			lbl2 = new JLabel("");
			lbl2.setBounds(28, 190, 272, 16);
		}
		return lbl2;
	}
	private JLabel getLbl3() {
		if (lbl3 == null) {
			lbl3 = new JLabel("");
			lbl3.setBounds(28, 221, 249, 16);
		}
		return lbl3;
	}
	private JLabel getLbl4() {
		if (lbl4 == null) {
			lbl4 = new JLabel("");
			lbl4.setBounds(28, 248, 263, 16);
		}
		return lbl4;
	}
	
	public void result() {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		int wkNum1 = Integer.parseInt(tfNum1.getText());
		int wkNum2 = Integer.parseInt(tfNum2.getText());
		Calculation calculation = new Calculation(wkNum1, wkNum2);
//		calculation.num1 = wkNum1;
//		calculation.num2 = wkNum2;
		
		lbl1.setText("");
		lbl2.setText("");
		lbl3.setText("");
		lbl4.setText("");
		
		if(chAdd.isSelected()==true) {
			arrayList.add(calculation.add());
		}
		
		if(chMinus.isSelected()==true) {
			arrayList.add(calculation.minus());
		}
		
		if(chMultiple.isSelected()==true) {
			arrayList.add(calculation.multiple());
		}
		
		if(chDivision.isSelected()==true) {
			arrayList.add(calculation.division());
		}
		
		for(int i=0; i<arrayList.size(); i++) {
			switch (i) {
			case 0:
				lbl1.setText(arrayList.get(i));
				break;
			case 1:
				lbl2.setText(arrayList.get(i));
				break;
			case 2:
				lbl3.setText(arrayList.get(i));
				break;
			case 3:
				lbl4.setText(arrayList.get(i));
			default:
				break;
			}
			
		}
		
		
	}
	
	
	
	
	
}
