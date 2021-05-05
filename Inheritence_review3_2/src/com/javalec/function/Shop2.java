package com.javalec.function;

public class Shop2 extends ShopHQ {

	
	
	public Shop2() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public void orderBu() {
		// TODO Auto-generated method stub
		System.out.println("부대찌개 : 5,000원");
	}
	
	@Override
	public void orderBi() {
		// TODO Auto-generated method stub
		System.out.println("비빔밥 : 5,000원");
	}
	
	@Override
	public void orderSoon() {
		// TODO Auto-generated method stub
		System.out.println("순대국 : 4,000원");
	}
	
	@Override
	public void orderKong() {
		// TODO Auto-generated method stub
		System.out.println("공기밥 : 무료 입니다.");
	}
	
	
	public void orderPrint() {
		System.out.println("Shop2---------------");
		orderKim();
		orderBu();
		orderBi();
		orderSoon();
		orderKong();
	}
	
	
}
