package com.javalec.base;

import java.util.Scanner;

public class Practice1Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input score :");
		int grade=0;
		int[] histo = new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.print(i + "의 score :");
			grade = scanner.nextInt() / 10;
			histo[grade]++;
		}
		
		System.out.println("----- Histogram -----");
		
		for(int i=9; i>=0; i--) {
			System.out.print(String.format("%3d : ", i*10));
			
			for(int j=1; j<=histo[i]; j++) {
				System.out.print("#");
			}
			
			System.out.println();
		}
		
	}

}
