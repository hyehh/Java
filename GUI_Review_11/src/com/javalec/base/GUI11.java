package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI11 {
	
	ArrayList<String> arrayList = new ArrayList<String>();
	int sw = 0;
	private JFrame frame;
	private JTextField tfResult;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnC;
	private JButton btnEqual;
	private JButton btn0;
	private JButton btnPlus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI11 window = new GUI11();
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
	public GUI11() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {

		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTfResult());
		frame.getContentPane().add(getBtn7());
		frame.getContentPane().add(getBtn8());
		frame.getContentPane().add(getBtn9());
		frame.getContentPane().add(getBtn4());
		frame.getContentPane().add(getBtn5());
		frame.getContentPane().add(getBtn6());
		frame.getContentPane().add(getBtn1());
		frame.getContentPane().add(getBtn2());
		frame.getContentPane().add(getBtn3());
		frame.getContentPane().add(getBtnC());
		frame.getContentPane().add(getBtnEqual());
		frame.getContentPane().add(getBtn0());
		frame.getContentPane().add(getBtnPlus());
	}

	private JTextField getTfResult() {
		if (tfResult == null) {
			tfResult = new JTextField();
			tfResult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			tfResult.setHorizontalAlignment(SwingConstants.TRAILING);
			tfResult.setEditable(false);
			tfResult.setBounds(36, 18, 165, 36);
			tfResult.setColumns(10);
		}
		return tfResult;
	}
	private JButton getBtn7() {
		if (btn7 == null) {
			btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					show7();
				}
			});
			btn7.setBounds(36, 66, 47, 29);
		}
		return btn7;
	}
	private JButton getBtn8() {
		if (btn8 == null) {
			btn8 = new JButton("8");
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					show8();
				}
			});
			btn8.setBounds(95, 66, 47, 29);
		}
		return btn8;
	}
	private JButton getBtn9() {
		if (btn9 == null) {
			btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					show9();
				}
			});
			btn9.setBounds(154, 66, 47, 29);
		}
		return btn9;
	}
	private JButton getBtn4() {
		if (btn4 == null) {
			btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					show4();
				}
			});
			btn4.setBounds(36, 107, 47, 29);
		}
		return btn4;
	}
	private JButton getBtn5() {
		if (btn5 == null) {
			btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					show5();
				}
			});
			btn5.setBounds(95, 107, 47, 29);
		}
		return btn5;
	}
	private JButton getBtn6() {
		if (btn6 == null) {
			btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					show6();
				}
			});
			btn6.setBounds(154, 107, 47, 29);
		}
		return btn6;
	}
	private JButton getBtn1() {
		if (btn1 == null) {
			btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					show1();
				}
			});
			btn1.setBounds(36, 148, 47, 29);
		}
		return btn1;
	}
	private JButton getBtn2() {
		if (btn2 == null) {
			btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					show2();
				}
			});
			btn2.setBounds(95, 148, 47, 29);
		}
		return btn2;
	}
	private JButton getBtn3() {
		if (btn3 == null) {
			btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					show3();
				}
			});
			btn3.setBounds(154, 148, 47, 29);
		}
		return btn3;
	}
	private JButton getBtnC() {
		if (btnC == null) {
			btnC = new JButton("C");
			btnC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					clear();
				}
			});
			btnC.setBounds(36, 230, 165, 29);
		}
		return btnC;
	}
	private JButton getBtnEqual() {
		if (btnEqual == null) {
			btnEqual = new JButton("=");
			btnEqual.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					equal();
				}
			});
			btnEqual.setBounds(36, 189, 47, 29);
		}
		return btnEqual;
	}
	private JButton getBtn0() {
		if (btn0 == null) {
			btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				show0();
				}
			});
			btn0.setBounds(95, 189, 47, 29);
		}
		return btn0;
	}
	private JButton getBtnPlus() {
		if (btnPlus == null) {
			btnPlus = new JButton("+");
			btnPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					plus();
				}
			});
			btnPlus.setBounds(154, 189, 47, 29);
		}
		return btnPlus;
	}
	
	private void show0() {
		if(sw==1) {
			sw=0;
			tfResult.setText("");
		}
		tfResult.setText(tfResult.getText() + "0");
	}
	private void show1() {
		if(sw==1) {
			sw=0;
			tfResult.setText("");
		}
		tfResult.setText(tfResult.getText() + "1");

	}
	private void show2() {
		if(sw==1) {
			sw=0;
			tfResult.setText("");
		}
		tfResult.setText(tfResult.getText() + "2");

	}
	private void show3() {
		if(sw==1) {
			sw=0;
			tfResult.setText("");
		}
		tfResult.setText(tfResult.getText() + "3");

	}
	private void show4() {
		if(sw==1) {
			sw=0;
			tfResult.setText("");
		}
		tfResult.setText(tfResult.getText() + "4");

	}
	private void show5() {
		if(sw==1) {
			sw=0;
			tfResult.setText("");
		}
		tfResult.setText(tfResult.getText() + "5");

	}
	private void show6() {
		if(sw==1) {
			sw=0;
			tfResult.setText("");
		}
		tfResult.setText(tfResult.getText() + "6");

	}
	private void show7() {
		if(sw==1) {
			sw=0;
			tfResult.setText("");
		}
		tfResult.setText(tfResult.getText() + "7");

	}
	private void show8() {
		if(sw==1) {
			sw=0;
			tfResult.setText("");
		}
		tfResult.setText(tfResult.getText() + "8");

	}
	private void show9() {
		if(sw==1) {
			sw=0;
			tfResult.setText("");
		}
		tfResult.setText(tfResult.getText() + "9");

	}
	
	
	private void plus() {
		if(sw==1) {
			sw=0;
			tfResult.setText("");
		}
		arrayList.add(tfResult.getText());
		sw = 1;
	}
	
	private void equal() {

		arrayList.add(tfResult.getText());
		int tot=0;
		for(int i=0; i<arrayList.size(); i++) {
			tot += Integer.parseInt(arrayList.get(i));	
			}
		tfResult.setText(Integer.toString(tot));

		arrayList.clear();
		
		
	}

	
	private void clear() {
		arrayList.clear();
		tfResult.setText("");
	}
	
}
