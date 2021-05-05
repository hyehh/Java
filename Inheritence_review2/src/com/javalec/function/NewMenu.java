package com.javalec.function;

public class NewMenu extends OldMenu {

	
	public NewMenu() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void orderChunng() {
		// TODO Auto-generated method stub
		super.orderChunng();
		System.out.println("쇠고기 청국장");
	}
	
	@Override
	public void orderDeon() {
		// TODO Auto-generated method stub
		super.orderDeon();
		System.out.println("얼큰 된장국");
	}
	
	public void orderKongGuk() {
		System.out.println("콩나물 국");
	}
	
	
}
