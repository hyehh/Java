package com.javalec.base;

import com.javalec.function.Shop1;
import com.javalec.function.Shop2;
import com.javalec.function.Shop3;
import com.javalec.function.ShopHQ;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShopHQ mainShop = new ShopHQ();
		ShopHQ shop1 = new Shop1();
		ShopHQ shop2 = new Shop2();
		ShopHQ shop3 = new Shop3();
		
		System.out.println("HQ---------------");
		mainShop.orderKim();
		mainShop.orderBu();
		mainShop.orderBi();
		mainShop.orderSoon();
		mainShop.orderKong();
		
		
		System.out.println("Shop1---------------");
		shop1.orderKim();
		shop1.orderBu();
		shop1.orderBi();
		shop1.orderSoon();
		shop1.orderKong();
		
		
		System.out.println("Shop2---------------");
		shop2.orderKim();
		shop2.orderBu();
		shop2.orderBi();
		shop2.orderSoon();
		shop2.orderKong();
		
		
		System.out.println("Shop3---------------");
		shop3.orderKim();
		shop3.orderBu();
		shop3.orderBi();
		shop3.orderSoon();
		shop3.orderKong();
		
		
		
	}

}
