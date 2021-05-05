package com.javaHJ.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import com.javaHJ.function.Bean;
import com.javaHJ.function.DbAction;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.ButtonGroup;

public class Main {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_1;
	private JButton btnCancel;
	private JTable Inner_Table_After;
	private JScrollPane scrollPane_1;
	private JTable Inner_Table_Before;
	private JButton btnReview;
	private final DefaultTableModel Outer_Table_After = new DefaultTableModel(); // ################
	private final DefaultTableModel Outer_Table_Before = new DefaultTableModel(); // ################
	private JPanel mylecturePanel;
	private JPanel ReviewPanel;
	private JLabel lblNewLabel_2;
	private JTextField tfReviewContents;
	private JRadioButton rd1;
	private JRadioButton rd2;
	private JRadioButton rd3;
	private JRadioButton rd4;
	private JRadioButton rd5;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnRegister;

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				TableInitAfter();
				TableInitBefore();
				SearchActionAfter();
				SearchActionBefore();
				mylecturePanel.setVisible(true);
				ReviewPanel.setVisible(false);
				
			}
		});
		frame.setTitle("금손양성소");
		frame.setBounds(100, 100, 544, 608);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getReviewPanel());
		frame.getContentPane().add(getMylecturePanel());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("수강예정");
			lblNewLabel.setBounds(24, 21, 44, 16);
		}
		return lblNewLabel;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(24, 47, 497, 202);
			scrollPane.setViewportView(getInner_Table_After());
		}
		return scrollPane;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("수강이력");
			lblNewLabel_1.setBounds(23, 303, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton("수강취소");
			btnCancel.setBounds(403, 255, 117, 29);
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CancleClick();
				}
			});
		}
		return btnCancel;
	}
	private JTable getInner_Table_After() {
		if (Inner_Table_After == null) {
			Inner_Table_After = new JTable();
			Inner_Table_After.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			Inner_Table_After.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			Inner_Table_After.setModel(Outer_Table_After); // <--***************************************************

		}
		return Inner_Table_After;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(24, 330, 497, 190);
			scrollPane_1.setViewportView(getInner_Table_Before());
		}
		return scrollPane_1;
	}
	private JTable getInner_Table_Before() {
		if (Inner_Table_Before == null) {
			Inner_Table_Before = new JTable();
			Inner_Table_Before.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			Inner_Table_Before.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			Inner_Table_Before.setModel(Outer_Table_Before); // <--***************************************************

		}
		return Inner_Table_Before;
	}
	private JButton getBtnReview() {
		if (btnReview == null) {
			btnReview = new JButton("후기등록");
			btnReview.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					mylecturePanel.setVisible(false);
					ReviewPanel.setVisible(true);
				}
			});
			btnReview.setBounds(402, 525, 117, 29);
		}
		return btnReview;
	}
	private JPanel getMylecturePanel() {
		if (mylecturePanel == null) {
			mylecturePanel = new JPanel();
			mylecturePanel.setBounds(0, 0, 538, 574);
			mylecturePanel.setLayout(null);
			mylecturePanel.add(getLblNewLabel());
			mylecturePanel.add(getLblNewLabel_1());
			mylecturePanel.add(getScrollPane());
			mylecturePanel.add(getBtnCancel());
			mylecturePanel.add(getScrollPane_1());
			mylecturePanel.add(getBtnReview());
		}
		return mylecturePanel;
	}
	
	private JPanel getReviewPanel() {
		if (ReviewPanel == null) {
			ReviewPanel = new JPanel();
			ReviewPanel.setBounds(0, 0, 538, 574);
			ReviewPanel.setLayout(null);
			ReviewPanel.add(getLblNewLabel_2());
			ReviewPanel.add(getTfReviewContents());
			ReviewPanel.add(getRd1());
			ReviewPanel.add(getRd2());
			ReviewPanel.add(getRd3());
			ReviewPanel.add(getRd4());
			ReviewPanel.add(getRd5());
			ReviewPanel.add(getBtnRegister());
		}
		return ReviewPanel;
	}
	
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("후기작성");
			lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
			lblNewLabel_2.setBounds(26, 20, 97, 31);
		}
		return lblNewLabel_2;
	}
	private JTextField getTfReviewContents() {
		if (tfReviewContents == null) {
			tfReviewContents = new JTextField();
			tfReviewContents.setBounds(26, 57, 489, 368);
			tfReviewContents.setColumns(10);
		}
		return tfReviewContents;
	}
	private JRadioButton getRd1() {
		if (rd1 == null) {
			rd1 = new JRadioButton("★");
			buttonGroup.add(rd1);
			rd1.setForeground(Color.ORANGE);
			rd1.setBounds(26, 448, 97, 23);
		}
		return rd1;
	}
	private JRadioButton getRd2() {
		if (rd2 == null) {
			rd2 = new JRadioButton("★★");
			buttonGroup.add(rd2);
			rd2.setForeground(Color.ORANGE);
			rd2.setBounds(108, 448, 84, 23);
		}
		return rd2;
	}
	private JRadioButton getRd3() {
		if (rd3 == null) {
			rd3 = new JRadioButton("★★★");
			buttonGroup.add(rd3);
			rd3.setForeground(Color.ORANGE);
			rd3.setBounds(204, 448, 84, 23);
		}
		return rd3;
	}
	private JRadioButton getRd4() {
		if (rd4 == null) {
			rd4 = new JRadioButton("★★★★");
			buttonGroup.add(rd4);
			rd4.setForeground(Color.ORANGE);
			rd4.setBounds(312, 448, 84, 23);
		}
		return rd4;
	}
	private JRadioButton getRd5() {
		if (rd5 == null) {
			rd5 = new JRadioButton("★★★★★");
			rd5.setSelected(true);
			buttonGroup.add(rd5);
			rd5.setForeground(Color.ORANGE);
			rd5.setBounds(418, 448, 97, 23);
		}
		return rd5;
	}
	private JButton getBtnRegister() {
		if (btnRegister == null) {
			btnRegister = new JButton("등록");
			btnRegister.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					insertAction();
				}
			});
			btnRegister.setBounds(398, 519, 117, 29);
		}
		return btnRegister;
	}
	
	private void TableInitAfter(){
        int i = Outer_Table_After.getRowCount();
        
        Outer_Table_After.addColumn("강의ID");
        Outer_Table_After.addColumn("신청날짜");
        Outer_Table_After.addColumn("강의명");
        Outer_Table_After.addColumn("수강날짜");
        Outer_Table_After.addColumn("장소");
        Outer_Table_After.addColumn("가격");
        Outer_Table_After.setColumnCount(6);

        for(int j = 0 ; j < i ; j++){
            Outer_Table_After.removeRow(0);
        }

        Inner_Table_After.setAutoResizeMode(Inner_Table_After.AUTO_RESIZE_OFF);
        

        int vColIndex = 0;
        TableColumn col = Inner_Table_After.getColumnModel().getColumn(vColIndex);
        int width = 40;
        col.setPreferredWidth(width);

        vColIndex = 1;
        col = Inner_Table_After.getColumnModel().getColumn(vColIndex);
        width = 100;
        col.setPreferredWidth(width);
        
        vColIndex = 2;
        col = Inner_Table_After.getColumnModel().getColumn(vColIndex);
        width = 120;
        col.setPreferredWidth(width);

        vColIndex = 3;
        col = Inner_Table_After.getColumnModel().getColumn(vColIndex);
        width = 100;
        col.setPreferredWidth(width);
        
        vColIndex = 4;
        col = Inner_Table_After.getColumnModel().getColumn(vColIndex);
        width = 70;
        col.setPreferredWidth(width);
       
        vColIndex = 5;
        col = Inner_Table_After.getColumnModel().getColumn(vColIndex);
        width = 50;
        col.setPreferredWidth(width);
        

	}
	private void TableInitBefore(){

		int k = Outer_Table_Before.getRowCount();
		
		Outer_Table_Before.addColumn("강의ID");
		Outer_Table_Before.addColumn("신청날짜");
		Outer_Table_Before.addColumn("강의명");
		Outer_Table_Before.addColumn("수강날짜");
		Outer_Table_Before.addColumn("장소");
		Outer_Table_Before.addColumn("가격");
		Outer_Table_Before.setColumnCount(6);
		
		for(int j = 0 ; j < k ; j++){
			Outer_Table_Before.removeRow(0);
		}

		Inner_Table_Before.setAutoResizeMode(Inner_Table_Before.AUTO_RESIZE_OFF);

		int vColIndex = 0;
		TableColumn col = Inner_Table_Before.getColumnModel().getColumn(vColIndex);
		int width = 40;
		col.setPreferredWidth(width);
	
		vColIndex = 1;
		col = Inner_Table_Before.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);
		
		vColIndex = 2;
		col = Inner_Table_Before.getColumnModel().getColumn(vColIndex);
		width = 120;
		col.setPreferredWidth(width);
		
		vColIndex = 3;
		col = Inner_Table_Before.getColumnModel().getColumn(vColIndex);
		width = 100;
		col.setPreferredWidth(width);
		
		vColIndex = 4;
		col = Inner_Table_Before.getColumnModel().getColumn(vColIndex);
		width = 70;
		col.setPreferredWidth(width);
		
		vColIndex = 5;
		col = Inner_Table_Before.getColumnModel().getColumn(vColIndex);
		width = 50;
		col.setPreferredWidth(width);
		
	}

	private void SearchActionAfter(){
		
		DbAction dbAction = new DbAction();
		ArrayList<Bean> beanList = dbAction.selectListAfter();
		
		int listCount = beanList.size();
		for(int i=0; i<listCount; i++) {
			String temp1 = Integer.toString(beanList.get(i).getcId());
			String temp2 = Integer.toString(beanList.get(i).getcPrice());
			String[] qTxt = {temp1, beanList.get(i).getcAttendDate(), beanList.get(i).getcName(), beanList.get(i).getcDate(), beanList.get(i).getcLocation(), temp2};
			Outer_Table_After.addRow(qTxt);
		}

	
		
	}
	private void SearchActionBefore(){
		
		DbAction dbAction = new DbAction();
		ArrayList<Bean> beanList = dbAction.selectListBefore();
		
		int listCount = beanList.size();
		for(int i=0; i<listCount; i++) {
			String temp1 = Integer.toString(beanList.get(i).getcId());
			String temp2 = Integer.toString(beanList.get(i).getcPrice());
			String[] qTxt = {temp1, beanList.get(i).getcAttendDate(), beanList.get(i).getcName(), beanList.get(i).getcDate(), beanList.get(i).getcLocation(), temp2};
			Outer_Table_Before.addRow(qTxt);
		}
		
		
		
	}
	

	
	private void CancleClick() {
		

	      
//      int seqno = Integer.parseInt(tfSeqno.getText());
        int result = JOptionPane.showConfirmDialog(null, "수강을 취소하시겠습니까?", "수강취소", JOptionPane.YES_NO_OPTION);
               if(result==JOptionPane.YES_OPTION) {
                  try{
                  int i = Inner_Table_After.getSelectedRow();
                  String wkSequence = (String)Inner_Table_After.getValueAt(i, 0);
                  int inSequence = Integer.parseInt(wkSequence);
                  
                  DbAction dbAction = new DbAction(inSequence);
                  boolean msg = dbAction.delete();
                  if(msg == true) {
                     JOptionPane.showMessageDialog(null, "수강 취소 되었습니다.",
                    		 "취소 완료!", 
             				JOptionPane.INFORMATION_MESSAGE);
                     TableInitAfter();
                     SearchActionAfter();
                  }
                  }catch (Exception e) {
                  // TODO: handle exception
                	  e.printStackTrace();
               }
               }
   }

	private void insertAction(){
        int i = Inner_Table_Before.getSelectedRow();
        String wkSequence = (String)Inner_Table_Before.getValueAt(i, 0);
        int inSequence = Integer.parseInt(wkSequence);
        
        int reviewscore = 0;
        if(rd1.isSelected()==true) {
        	reviewscore = 1;
        }else if(rd2.isSelected()==true) {
        	reviewscore = 2;
        }else if(rd3.isSelected()==true) {
        	reviewscore = 3;
        }else if(rd4.isSelected()==true) {
        	reviewscore = 4;
        }else if(rd5.isSelected()==true) {
        	reviewscore = 5;
        }
        
		DbAction dbAction = new DbAction(inSequence, tfReviewContents.getText().trim(), reviewscore);
		boolean msg = dbAction.insert();
        try{

        	if(msg == true) {
        		
        		JOptionPane.showMessageDialog(null, "후기 등록이 완료되었습니다!",
        				"등록 완료!", 
        				JOptionPane.INFORMATION_MESSAGE);
        	
        		
//        		mylecturePanel.setVisible(true);
//        		ReviewPanel.setVisible(false);
        	}
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "DB에 자료 입력중 에러가 발생했습니다! \n 시스템관리자에 문의하세요!",
                                         "Critical Error!", 
                                         JOptionPane.ERROR_MESSAGE);                    
            e.printStackTrace();
        }
		
	}
	
	
	
}
