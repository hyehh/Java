package com.javalec.base;

import com.javalec.function.Shop1;
import com.javalec.function.Shop2;
import com.javalec.function.Shop3;
import com.javalec.function.ShopHQ;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ShopHQ shopHQ = new ShopHQ();
		ShopHQ shop1 = new Shop1();
		ShopHQ shop2 = new Shop2();
		ShopHQ shop3 = new Shop3();
		
		shopHQ.orderPrint();
		shop1.orderPrint();
		shop2.orderPrint();
		shop3.orderPrint();
		
		
		
		

	}

}
