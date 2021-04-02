package com.javalec.base;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
		int[] height = new int[name.length]; // 5로 하는 것 보다 name.length 로 하는 게 좋음
		Scanner scanner = new Scanner(System.in);
		int tot = 0;
		double avg = 0.0;
		int maxheight = 0; 
		String maxname = "";		
		int minheight = 500; 
		String minname = "";
		
		// 신장을 입력하세요!
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "의 신장을 입력하세요!");
			height[i] = scanner.nextInt();
		}
		
		// 평균 구하기 (합계 구하고 그 다음 평균 구하기)
		
		for(int i = 0; i < name.length; i++) {
			tot += height[i];
		}
		
		avg = tot / name.length;
		
		// 최대 키 구하기
		
		for(int i = 0; i < name.length; i++) {
			if(maxheight < height[i]) { //height[i] 이 maxheight보다 커야 함!
				maxheight = height[i];
				maxname = name[i];
			}
		}
		
		// 최소 키 구하기
		
		for(int i = 0; i < name.length; i++) {
			if(minheight > height[i]) { //height[i] 이 minheight보다 작아 함!
				minheight = height[i];
				minname = name[i];
			}
		}
		
		
		for(int i = 0; i < name.length; i++) {
			if(minheight==0 || minheight > height[i]) {
				
			}
		}
		
		// 출력하기
		
		// 출력하기
		System.out.println("평균신장 : " + avg);
		System.out.println("가장 큰 학생은 " + maxname +" 이고 그 학생의 키는 " + maxheight);
		System.out.println("가장 작 학생은 " + minname +" 이고 그 학생의 키는 " + minheight);
		

		
		
		
		
		
		
		
		
	}

}
