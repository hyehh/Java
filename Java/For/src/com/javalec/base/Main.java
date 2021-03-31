package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		// 1부터 10까지 합계 구하기
		
		int tot = 0; // 누적변수
		for(int i=1; i<=100; i++) {
			tot = tot +i;
		}
		System.out.println("1부터 100까지의 합은 " + tot + "입니다.");
		
		// Exercise
		// 1부터 100까지의 수 중 짝수의 합을 구하시오 (단, if문 사용)
		
		int total = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				total = total + i;	// total += i 와 같은 말
			} // else 는 굳이 쓰지 않아도 됨, i는 지역변수 for scope 에서만 사용 가능!
				
		}
		System.out.println("1부터 100까지의 수 중 짝수의 합은 " + total + "입니다.");
		
		
		// 1부터 100까지의 수 중 짝수과 홀수 합을 구하시오 (단, if문 사용)

		int totalEven = 0;
		int totalOdd = 0; // int totalEven = 0, totalOdd = 0; 도 가능
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				totalEven += i;
			}else{
				totalOdd += i;
			}
		}
		
		System.out.println("1부터 100까지 수 중 짝수의 합은 " + totalEven + "입니다.");
		System.out.println("1부터 100까지 수 중 홀수의 합은 " + totalOdd + "입니다.");
		
		
		// 1부터 100까지의 수 중 짝수의 합 구하기 (단, if문 사용하지 말기)
		
		int totEven = 0;
		for(int i=2; i<=100; i += 2) {
			totEven += i;
		}
		
		System.out.println("1부터 100까지 수 중 짝수의 합은 " + totEven + "입니다.");
		
		
		
		
	}

}
