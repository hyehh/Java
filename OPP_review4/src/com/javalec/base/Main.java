package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Add;
import com.javalec.function.Division;
import com.javalec.function.Minus;
import com.javalec.function.Multiple;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int j = 0;
		
		System.out.print("숫자를 입력해주세요 : ");
		i = scanner.nextInt();
		System.out.print("숫자를 입력해주세요 : ");
		j = scanner.nextInt();
		
		Add add = new Add();
		int result1 = add.addResult(i, j);
		System.out.println(i + " + " + j + " = " + (result1));
		
		Minus minus = new Minus();
		int result2 = minus.minusResult(i, j);
		System.out.println(i + " - " + j + " = " + (result2));

		Multiple multiple = new Multiple();
		int result3 = multiple.multipleResult(i, j);
		System.out.println(i + " X " + j + " = " + (result3));
		
		Division division = new Division();
		String result4 = division.divisionResult(i, j);
		System.out.println(i + " / " + j + " = " + (result4));
	}

}
