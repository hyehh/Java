package com.javalec.base;

import com.javalec.function.APhone;
import com.javalec.function.BPhone;
import com.javalec.function.CPhone;
import com.javalec.function.SmartPhone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SmartPhone[] smartPhone = {new APhone(), new BPhone(), new CPhone()};
		for(int i=0; i<smartPhone.length; i++) {
			smartPhone[i].callSendReciever();
			smartPhone[i].tellMethod();
			smartPhone[i].tvRemoteController();
			System.out.println("-------------------");
		}
		
		
		
	}

}
