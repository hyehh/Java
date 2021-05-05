package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI04 {

	private JFrame frmCheckboxRadio;
	private JCheckBox chApple;
	private JCheckBox chBanana;
	private JButton btnFruits;
	private JTextField tfFruits;
	private JRadioButton rdKBS;
	private JRadioButton rdMBC;
	private JButton btnBroad;
	private JTextField tfBroad;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI04 window = new GUI04();
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
	public GUI04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheckboxRadio = new JFrame();
		frmCheckboxRadio.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				rdKBS.setSelected(true);
			}
		});
		frmCheckboxRadio.setTitle("CheckBox / Radio Button");
		frmCheckboxRadio.setBounds(100, 100, 450, 300);
		frmCheckboxRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckboxRadio.getContentPane().setLayout(null);
		frmCheckboxRadio.getContentPane().add(getChApple());
		frmCheckboxRadio.getContentPane().add(getChBanana());
		frmCheckboxRadio.getContentPane().add(getBtnFruits());
		frmCheckboxRadio.getContentPane().add(getTfFruits());
		frmCheckboxRadio.getContentPane().add(getRdKBS());
		frmCheckboxRadio.getContentPane().add(getRdMBC());
		frmCheckboxRadio.getContentPane().add(getBtnBroad());
		frmCheckboxRadio.getContentPane().add(getTfBroad());
	}
	private JCheckBox getChApple() {
		if (chApple == null) {
			chApple = new JCheckBox("Apple");
			chApple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitResult();
				}
			});
			chApple.setBounds(21, 21, 128, 23);
		}
		return chApple;
	}
	private JCheckBox getChBanana() {
		if (chBanana == null) {
			chBanana = new JCheckBox("Banana");
			chBanana.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					fruitResult();
				}
			});
			chBanana.setBounds(21, 73, 128, 23);
		}
		return chBanana;
	}
	private JButton getBtnFruits() {
		if (btnFruits == null) {
			btnFruits = new JButton("OK");
			btnFruits.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				fruitResult();
				}
			});
			btnFruits.setBounds(21, 126, 117, 29);
		}
		return btnFruits;
	}
	private JTextField getTfFruits() {
		if (tfFruits == null) {
			tfFruits = new JTextField();
			tfFruits.setBounds(19, 194, 190, 26);
			tfFruits.setColumns(10);
		}
		return tfFruits;
	}
	private JRadioButton getRdKBS() {
		if (rdKBS == null) {
			rdKBS = new JRadioButton("KBS");
			rdKBS.setSelected(true);
			rdKBS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadResult();
				}
			});
			buttonGroup.add(rdKBS);
			rdKBS.setBounds(243, 21, 141, 23);
		}
		return rdKBS;
	}
	private JRadioButton getRdMBC() {
		if (rdMBC == null) {
			rdMBC = new JRadioButton("MBC");
			rdMBC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				broadResult();
				}
			});
			buttonGroup.add(rdMBC);
			rdMBC.setBounds(243, 73, 141, 23);
		}
		return rdMBC;
	}
	private JButton getBtnBroad() {
		if (btnBroad == null) {
			btnBroad = new JButton("OK");
			btnBroad.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					broadResult();
				}
			});
			btnBroad.setBounds(243, 126, 117, 29);
		}
		return btnBroad;
	}
	private JTextField getTfBroad() {
		if (tfBroad == null) {
			tfBroad = new JTextField();
			tfBroad.setBounds(243, 194, 190, 26);
			tfBroad.setColumns(10);
		}
		return tfBroad;
	}
	
	private void fruitResult() {
		tfFruits.setText("");
		if(chApple.isSelected()==true) {
			tfFruits.setText("Apple이 선택되었습니다.");
		}
		if(chBanana.isSelected()==true) {
			tfFruits.setText("Banana가 선택되었습니다.");
		}
		if(chApple.isSelected()&&chBanana.isSelected()==true) {
			tfFruits.setText("Apple, Banana가 선택되었습니다.");
		}
		
	}
	
	private void broadResult() {
//		rdKBS.setSelected(true);
		if(rdKBS.isSelected()==true) {
			tfBroad.setText("KBS입니다.");
		}
		if(rdMBC.isSelected()==true) {
			tfBroad.setText("MBC입니다.");
		}
	}
	
	
	
	
	
	
}
