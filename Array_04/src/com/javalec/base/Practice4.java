package com.javalec.base;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[] korean = new int[4];
		int[] english = new int[4];
		int[] math = new int[4];
		int toti = 0;
		double avg = 0.0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Korean의 성적을 입력 :");
		
		for(int i=0; i < 4; i++) {
			System.out.print("No" + (i+1) + "의 성적은 : ");
			korean[i] = scanner.nextInt();
		}
		
		System.out.println("English의 성적을 입력 :");
		
		for(int i=0; i < 4; i++) {
			System.out.print("No" + (i+1) + "의 성적은 : ");
			english[i] = scanner.nextInt();
		}
		
		System.out.println("Mathmatics의 성적을 입력 :");
		
		for(int i=0; i < 4; i++) {
			System.out.print("No" + (i+1) + "의 성적은 : ");
			math[i] = scanner.nextInt();
		}
		
		System.out.println("\t" + "Korean" + "\t" + "\t" + "English" + "\t" + "\t" + "Mathematics" + "\t" + "\t" + "Total" + "\t" + "\t" + "Average");
		for(int i=0; i <4 ; i++) {
			toti = korean[i] + english[i] + math[i];
			avg = (korean[i] + english[i] + math[i]) / 3;
			System.out.println("No" + (i+1) + "\t" + korean[i] + "\t" + "\t" + english[i] + "\t" + "\t" + math[i] + "\t" + "\t" + "\t" + toti + "\t" + "\t" + avg);
			
		}
		
	}

}
