package com.javalec.base;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int[] grade = new int[10];
		int[] histo = new int[10];
		
		System.out.println("Input score : ");
		
		
		for(int i=0; i<grade.length; i++) {
			System.out.print((i+1) + "의 score :");
			grade[i] = scanner.nextInt();
			histo[grade[i]/10]++;
		}
		
		System.out.println("------- Histogram -------");
		
		for(int i=grade.length-1; i>=0; i--) {
		System.out.print(String.format("%2d : ", i*10));
		for(int j=0; j<=histo[i]; j++) {
			System.out.print("#");
		}
		System.out.println();
		}
	}

}
