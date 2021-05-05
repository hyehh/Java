package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI02 {

	private JFrame frmCheckboxRadio;
	private JComboBox cbDanNumber;
	private JComboBox cbCalculation;
	private JComboBox cbMulNumber;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI02 window = new GUI02();
					window.frmCheckboxRadio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheckboxRadio = new JFrame();
		frmCheckboxRadio.setTitle("CheckBox / Radio Button");
		frmCheckboxRadio.setBounds(100, 100, 450, 111);
		frmCheckboxRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckboxRadio.getContentPane().setLayout(null);
		frmCheckboxRadio.getContentPane().add(getCbDanNumber());
		frmCheckboxRadio.getContentPane().add(getCbCalculation());
		frmCheckboxRadio.getContentPane().add(getCbMulNumber());
		frmCheckboxRadio.getContentPane().add(getTfResult());
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
			cbDanNumber.setBounds(29, 23, 84, 27);
		}
		return cbDanNumber;
	}
	private JComboBox getCbCalculation() {
		if (cbCalculation == null) {
			cbCalculation = new JComboBox();
			cbCalculation.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				result();
				}
			});
			cbCalculation.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "X", "/"}));
			cbCalculation.setBounds(125, 23, 68, 27);
		}
		return cbCalculation;
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
			cbMulNumber.setBounds(205, 23, 84, 27);
		}
		return cbMulNumber;
	}
	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.setEditable(false);
			tfResult.setBounds(301, 22, 130, 26);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	
	private void result() {
		int wkNum1 = Integer.parseInt(cbDanNumber.getSelectedItem().toString());
		int wkNum2 = Integer.parseInt(cbMulNumber.getSelectedItem().toString());
		String calc = cbCalculation.getSelectedItem().toString();
		
		if(calc=="+") {
			tfResult.setText(Integer.toString(wkNum1+wkNum2));
		}else if(calc=="-") {
			tfResult.setText(Integer.toString(wkNum1-wkNum2));
		}else if(calc=="X") {
			tfResult.setText(Integer.toString(wkNum1*wkNum2));
		}else {
			try {
				
				tfResult.setText(String.format("%.2f", (double)wkNum1/wkNum2));
			}catch (Exception e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		
		
		
		
		
		
	}
	
	
}
