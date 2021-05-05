package com.javalec.base;

import java.util.Scanner;

public class Review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int[] score = new int[10];
		int[] histo = new int[10];

		System.out.println("Input score :");
		
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1) + "의 score :");
			score[i] = scanner.nextInt();
			histo[score[i]/10]++;
		}
		
		System.out.println("------- Histogram -------");

		for(int i=(score.length-1); i>=0; i--) {
			System.out.print(String.format("%3d : ", (i*10)));
			for(int j=1; j<=histo[i]; j++) {
				System.out.print("#");
			}System.out.println();
		}
	}

}
