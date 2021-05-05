package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone aphone = new APhone();
		SmartPhone bphone = new BPhone();
		SmartPhone cphone = new CPhone();
		
		
		SmartPhone[] smartPhone = {aphone, bphone, cphone};
		for(int i=0; i<smartPhone.length; i++) {
			smartPhone[i].cellSenderReciver();
			smartPhone[i].tellMethod();
			smartPhone[i].tvRemoteController();
			System.out.println("------------------");
		}
		
	}

}
