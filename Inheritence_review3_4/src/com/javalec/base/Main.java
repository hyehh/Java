package com.javalec.base;

import com.javalec.function.Shop1;
import com.javalec.function.Shop2;
import com.javalec.function.Shop3;
import com.javalec.function.ShopHQ;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		방법 1
//		ShopHQ shopHQ = new ShopHQ();
//		ShopHQ shop1 = new Shop1();
//		ShopHQ shop2 = new Shop2();
//		ShopHQ shop3 = new Shop3();
//	
//		ShopHQ[] shop = {shopHQ, shop1, shop2, shop3};

		
		
//		방법 2
		ShopHQ[] shop = {new ShopHQ(), new Shop1(), new Shop2(), new Shop3()};
		
		
		for(int i=0; i<shop.length; i++) {
			System.out.println("---------------");
			shop[i].orderKim();
			shop[i].orderBu();
			shop[i].orderBi();
			shop[i].orderSoon();
			shop[i].orderKong();
		}
		
		
		
		
	}

}
