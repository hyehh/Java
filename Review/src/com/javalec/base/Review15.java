package com.javalec.base;

import java.util.Scanner;

public class Review15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] subject = {"Korean", "English", "Mathematics"};
		String[] name = {"No1", "No2", "No3", "No4"};
		int[] korean = new int[name.length];
		int[] english = new int[name.length];
		int[] mathematics = new int[name.length];
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		int[] total = new int[name.length];
		double[] avg = new double[name.length];

		
		System.out.println("Korean의 성적을 입력 : ");
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + "의 성적은 : ");
			korean[i] = scanner.nextInt();
		}
		
		System.out.println("English의 성적을 입력 : ");
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + "의 성적은 : ");
			english[i] = scanner.nextInt();
		}
		
		System.out.println("Mathematics의 성적을 입력 : ");
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + "의 성적은 : ");
			mathematics[i] = scanner.nextInt();
		}
		
		
		
		
		// 출력하기
		
		System.out.println("\t" + "Korean" + "\t" +  "\t" + "English" +  "\t" + "\t" + "Mathematics" + "\t" + "Total" +"\t" +  "\t" + "Average");
		
		//total / avg
		
		for(int i=0; i<name.length; i++) {
			total[i] = korean[i] + english[i] + mathematics[i];
			avg[i] = (double)total[i]/subject.length;
			System.out.println(name[i] + "\t" + korean[i] + "\t" + "\t" + english[i] + "\t" + "\t" +  mathematics[i] + "\t" + "\t" +  total[i] + "\t" + "\t" +  String.format("%.2f", avg[i]));
			
		}

		
	}

}
