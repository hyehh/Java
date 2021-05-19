package com.javalec.base;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		String ym = year + new DecimalFormat("00").format(cal.get(Calendar.MONTH) + 1);
		String ymd = ym + new DecimalFormat("00").format(cal.get(Calendar.DATE));
		int preNum1 = Integer.parseInt(ymd);
		
		String subNum = "";
		
		for(int i=1; i<=6; i++) {
			subNum += (int)(Math.random() * 10);
		}
		
		int preNum2 = Integer.parseInt(subNum);
		
		int bNumber = preNum1 + preNum2;
		System.out.println(bNumber);
		
		
		
		String result = "";
		Random rand = new Random();
		for(int i=0; i<10; i++) {
			String ran = Integer.toString(rand.nextInt(10));
		if(!result.contains(ran)) {
			result += ran;
			}else {
				i-=1;
			}
		}
		
//		int b = Integer.parseInt(result);
		System.out.println(result);
//		System.out.println(b);
		
		
		
	}

}
