package com.javalec.base;

import com.javalec.function.NewMenu;
import com.javalec.function.OldMenu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OldMenu oldMenu = new OldMenu();
		System.out.println("<<<<<<< 예전 Menu >>>>>>>");
		oldMenu.orderChunng();
		oldMenu.orderDeon();
		oldMenu.orderGal();
		oldMenu.orderKong();
		
		NewMenu newMenu = new NewMenu();
//		OldMenu newMenu = new NewMenu();
		
		System.out.println("<<<<<<< 현재 Menu >>>>>>>");
		newMenu.orderChunng();
		newMenu.orderDeon();
		newMenu.orderKong();
		newMenu.orderKongGuk();
		
		
		
		
	}

}
