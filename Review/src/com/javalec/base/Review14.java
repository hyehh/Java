package com.javalec.base;

import java.util.Scanner;

public class Review14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] subject = {"Korean", "English", "Mathematics"};
		String[] name = {"No1", "No2", "No3", "No4"};
		int grade = 0;
		int[] koreanGrade = new int[name.length];
		int[] englishGrade = new int[name.length];
		int[] mathematicsGrade = new int[name.length];
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		for(int i=0; i<subject.length; i++) {
			System.out.println(subject[i] + "의 성적을 입력 :");
			

			for(int j=0; j<name.length; j++) {
				System.out.print(name[i] + "의 성적은 : ");
				grade = scanner.nextInt();
				
				if(i==0) {
					koreanGrade[j]=grade;
				}else if(i==1) {
					englishGrade[j]=grade;
				}else{
					mathematicsGrade[j]=grade;
				}
				
				
				
			}
	
			
		}
		
		
		
		
	}

}
