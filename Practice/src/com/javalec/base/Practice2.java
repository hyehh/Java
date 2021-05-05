package com.javalec.base;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] name = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] grade90 = new int[name.length];
		int[] grade80 = new int[name.length];
		int[] grade70 = new int[name.length];
		int[] grade60 = new int[name.length];
		int[] grade50 = new int[name.length];
		int[] grade40 = new int[name.length];
		int[] grade30 = new int[name.length];
		int[] grade20 = new int[name.length];
		int[] grade10 = new int[name.length];
		int[] grade0 = new int[name.length];
		int[] grade = new int[name.length];

		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input score : ");
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + "의 score :");
			grade[i] = scanner.nextInt();
			

			
			}
		
		for(int i=0; i<name.length; i++) {
			if(grade[i] >= 90) {
				grade90[i] = grade[i];
			}
			else if(grade[i] >= 80) {
				grade80[i] = grade[i];
			}
			else if(grade[i] >= 70) {
				grade70[i] = grade[i];
			}
			else if(grade[i] >= 60) {
				grade60[i] = grade[i];
			}
			else if(grade[i] >= 50) {
				grade50[i] = grade[i];
			}
			else if(grade[i] >= 40) {
				grade40[i] = grade[i];
			}
			else if(grade[i] >= 30) {
				grade30[i] = grade[i];
			}
			else if(grade[i] >= 20) {
				grade20[i] = grade[i];
			}
			else if(grade[i] >= 10) {
				grade10[i] = grade[i];
			}else {
				grade0[i] = grade[i];
			}
		
		
		}	
		

		System.out.println("-------- Histogram --------");
		
		System.out.println("90 : " + (grade90[0] == 0 ? "" : "#") + (grade90[1] == 0 ? "" : "#") + (grade90[2] == 0 ? "" : "#") + (grade90[3] == 0 ? "" : "#") + (grade90[4] == 0 ? "" : "#") + (grade90[5] == 0 ? "" : "#") + (grade90[6] == 0 ? "" : "#") + (grade90[7] == 0 ? "" : "#") + (grade90[8] == 0 ? "" : "#") + (grade90[9] == 0 ? "" : "#"));

	
		
		}
		
		
		
	}


