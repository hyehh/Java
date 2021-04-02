package com.javalec.base;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
		int[] height = new int[5];
		
		
		Scanner scanner = new Scanner(System.in);
		int tot = 0;
		double avg = 0.0;
		int highheight = 0;
		int lowheight = 500;
		String highname = "";
		String lowname = "";
		
		// 사용자로 부터 정보 입력 받아서 배열에 넣기
		
		for(int i = 0; i < name.length; i++) {
				System.out.print(name[i] + "의 신장을 입력하세요!" );
				height[i] = scanner.nextInt();
				// 입력한 정보의 합계 구하기
				tot+=height[i];
				
				// 가장 큰 학생
				if(highheight < height[i]) {
					highheight = height[i];
					highname = name[i];
				}	
				
				// 가장 작은 학생
				if(lowheight > height[i]) {
					lowheight = height[i];
					lowname = name[i];
				}
			
		}

		
		// 입력한 정보의 평균 구하기
		avg = (double)tot / height.length;
		

		// 출력하기
		System.out.println("평균신장 : " + avg);
		System.out.println("가장 큰 학생은 " + highname +" 이고 그 학생의 키는 " + highheight);
		System.out.println("가장 큰 학생은 " + lowname +" 이고 그 학생의 키는 " + lowheight);
		

		
		
		
		
		
		
		
	}

}
