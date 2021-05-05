package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Search {

	private JFrame frame;
	private JComboBox comboBox;
	private JTextField tfSearch;
	private JButton btnSearch;
	private JScrollPane scrollPane;
	private JTable Inner_table;
	private JTextField tfCount;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField tfSeq;
	private JLabel lblNewLabel_1_1;
	private JTextField tfName;
	private JLabel lblNewLabel_1_2;
	private JTextField tfTelno;
	private JLabel lblNewLabel_1_3;
	private JTextField tfAddress;
	private JLabel lblNewLabel_1_4;
	private JTextField tfEmail;
	private JLabel lblNewLabel_1_4_1;
	private JTextField tfRelation;
	
	// Database 환경정의
	private final String url_mysql = "jdbc:mysql://192.168.0.3/useraddress?serverTimezone=UTC&characterEncoding=utf8&useSSL=FALSE";
	private final String id_mysql = "root";
	private final String pw_mysql = "qwer1234";
	
	// Table 환경정의
	private final DefaultTableModel Outer_table = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search window = new Search();
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
	public Search() {
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
				tableInit();
				searchAction();
			}
		});
		frame.setTitle("주소록 검색");
		frame.setBounds(100, 100, 450, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getComboBox());
		frame.getContentPane().add(getTfSearch());
		frame.getContentPane().add(getBtnSearch());
		frame.getContentPane().add(getScrollPane());
		frame.getContentPane().add(getTfCount());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getTfSeq());
		frame.getContentPane().add(getLblNewLabel_1_1());
		frame.getContentPane().add(getTfName());
		frame.getContentPane().add(getLblNewLabel_1_2());
		frame.getContentPane().add(getTfTelno());
		frame.getContentPane().add(getLblNewLabel_1_3());
		frame.getContentPane().add(getTfAddress());
		frame.getContentPane().add(getLblNewLabel_1_4());
		frame.getContentPane().add(getTfEmail());
		frame.getContentPane().add(getLblNewLabel_1_4_1());
		frame.getContentPane().add(getTfRelation());
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"이름", "주소", "관계"}));
			comboBox.setBounds(18, 16, 98, 27);
		}
		return comboBox;
	}
	private JTextField getTfSearch() {
		if (tfSearch == null) {
			tfSearch = new JTextField();
			tfSearch.setBounds(128, 15, 204, 26);
			tfSearch.setColumns(10);
		}
		return tfSearch;
	}
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton("검색");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					tableInit();
//					searchAction();
					
				}
			});
			btnSearch.setBounds(344, 15, 100, 29);
		}
		return btnSearch;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.addMouseListener(new MouseAdapter() {

			});
			scrollPane.setBounds(28, 55, 404, 111);
			scrollPane.setViewportView(getInner_table());
		}
		return scrollPane;
	}
	private JTable getInner_table() {
		if (Inner_table == null) {
			Inner_table = new JTable();
			Inner_table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					tableClick();
				}
			});
			Inner_table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			
			Inner_table.setModel(Outer_table);
		}
		return Inner_table;
	}
	private JTextField getTfCount() {
		if (tfCount == null) {
			tfCount = new JTextField();
			tfCount.setEditable(false);
			tfCount.setBounds(384, 167, 29, 26);
			tfCount.setColumns(10);
		}
		return tfCount;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("명");
			lblNewLabel.setBounds(415, 172, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Sequence No");
			lblNewLabel_1.setBounds(38, 187, 98, 16);
		}
		return lblNewLabel_1;
	}
	private JTextField getTfSeq() {
		if (tfSeq == null) {
			tfSeq = new JTextField();
			tfSeq.setEditable(false);
			tfSeq.setBounds(148, 182, 49, 26);
			tfSeq.setColumns(10);
		}
		return tfSeq;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("이름");
			lblNewLabel_1_1.setBounds(38, 224, 98, 16);
		}
		return lblNewLabel_1_1;
	}
	private JTextField getTfName() {
		if (tfName == null) {
			tfName = new JTextField();
			tfName.setEditable(false);
			tfName.setColumns(10);
			tfName.setBounds(148, 219, 85, 26);
		}
		return tfName;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("전화번호");
			lblNewLabel_1_2.setBounds(38, 263, 98, 16);
		}
		return lblNewLabel_1_2;
	}
	private JTextField getTfTelno() {
		if (tfTelno == null) {
			tfTelno = new JTextField();
			tfTelno.setEditable(false);
			tfTelno.setColumns(10);
			tfTelno.setBounds(148, 258, 155, 26);
		}
		return tfTelno;
	}
	private JLabel getLblNewLabel_1_3() {
		if (lblNewLabel_1_3 == null) {
			lblNewLabel_1_3 = new JLabel("주소");
			lblNewLabel_1_3.setBounds(38, 307, 98, 16);
		}
		return lblNewLabel_1_3;
	}
	private JTextField getTfAddress() {
		if (tfAddress == null) {
			tfAddress = new JTextField();
			tfAddress.setEditable(false);
			tfAddress.setColumns(10);
			tfAddress.setBounds(148, 302, 284, 26);
		}
		return tfAddress;
	}
	private JLabel getLblNewLabel_1_4() {
		if (lblNewLabel_1_4 == null) {
			lblNewLabel_1_4 = new JLabel("전자우편");
			lblNewLabel_1_4.setBounds(38, 345, 98, 16);
		}
		return lblNewLabel_1_4;
	}
	private JTextField getTfEmail() {
		if (tfEmail == null) {
			tfEmail = new JTextField();
			tfEmail.setEditable(false);
			tfEmail.setColumns(10);
			tfEmail.setBounds(148, 340, 215, 26);
		}
		return tfEmail;
	}
	private JLabel getLblNewLabel_1_4_1() {
		if (lblNewLabel_1_4_1 == null) {
			lblNewLabel_1_4_1 = new JLabel("관계");
			lblNewLabel_1_4_1.setBounds(38, 385, 98, 16);
		}
		return lblNewLabel_1_4_1;
	}
	private JTextField getTfRelation() {
		if (tfRelation == null) {
			tfRelation = new JTextField();
			tfRelation.setEditable(false);
			tfRelation.setColumns(10);
			tfRelation.setBounds(148, 380, 215, 26);
		}
		return tfRelation;
	}
	
	private void tableInit() {
		
		Outer_table.addColumn("순서");
		Outer_table.addColumn("이름");
		Outer_table.addColumn("전화번호");
		Outer_table.addColumn("관계");
		Outer_table.setColumnCount(4);
		
		int i = Outer_table.getRowCount();
		for(int j=0; j<i; j++) {
			Outer_table.removeRow(0);
		}
		
		Inner_table.setAutoResizeMode(Inner_table.AUTO_RESIZE_OFF);
		
		int vColIndex = 0;
		TableColumn col = Inner_table.getColumnModel().getColumn(vColIndex);
		int width = 30;
		col.setPreferredWidth(width);
		
		vColIndex = 1;
		col = Inner_table.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);
		
		vColIndex = 2;
		col = Inner_table.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);
		
		vColIndex = 3;
		col = Inner_table.getColumnModel().getColumn(vColIndex);
		width = 200;
		col.setPreferredWidth(width);
		
		
	}
	
	
	private void searchAction() {
		String query = "select seqno, name, telno, relation from userinfo";
		int dataCount = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(query);
			
			while(rs.next()) {
				String[] str = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
				Outer_table.addRow(str);
				dataCount++;
			}
			
			conn_mysql.close();
			tfCount.setText(Integer.toString(dataCount));
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
	}
	
	
	private void tableClick() {
		int i = Inner_table.getSelectedRow();
		String str = (String) Inner_table.getValueAt(i, 0);
		String query = "select seqno, name, telno, address, email, relation from userinfo where seqno=" + str;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql, pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			ResultSet rs = stmt_mysql.executeQuery(query);
			
			while(rs.next()) {
				
				tfSeq.setText(rs.getString(1));
				tfName.setText(rs.getString(2));
				tfTelno.setText(rs.getString(3));
				tfAddress.setText(rs.getString(4));
				tfEmail.setText(rs.getString(5));
				tfRelation.setText(rs.getString(6));
			}
			
			conn_mysql.close();
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	
	
}
