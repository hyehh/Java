package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1부터 10까지의 숫자 나열하기
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		// 1부터 10까지의 합계 구하기
		
		int tot = 0;
		
		for(int i=1; i<=10; i++) {
			tot += i;
		}
		
		System.out.println("1부터 10까지의 합은 " + tot + "입니다.");
		
		
		// 1부터 100까지의 수 중 짝수의 합을 구하시오 (단, if문 사용)
		
		int Eventot = 0;
		
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				Eventot += i;
			}
		}
		System.out.println("1부터 100까지의 수 중 짝수의 합은 " + Eventot + "입니다.");
		
		
		// 1부터 100까지의 수 중 짝수의 합을 구하시오 (단, if문 사용)

		int totEven = 0;
		int totOdd = 0;
		
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {
				totEven += i;
			}else {
				totOdd += i;
			}
		}
		
		System.out.println("1부터 100까지의 수 중 짝수의 합은 " + totEven + "입니다.");
		System.out.println("1부터 100까지의 수 중 홀수의 합은 " + totOdd + "입니다.");

		
		// 1부터 100까지의 수 중 짝수의 합 구하기 (if 사용 금지)
		
		int totalEven = 0;
		
		for(int i=2; i<=100; i+=2) {
			totalEven += i;
		}
		
		System.out.println("1부터 100까지의 수 중 짝수의 합은 " + totalEven + "입니다.");
		
		
	}

}
