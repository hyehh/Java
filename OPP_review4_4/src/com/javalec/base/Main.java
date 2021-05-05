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
		
		Add add = new Add(i, j);
		add.num1 = i;
		add.num2 = j;
		int result1 = add.addResult();
		System.out.println(i + " + " + j + " = " + result1);

		Minus minus = new Minus(i, j);
		minus.num1 = i;
		minus.num2 = j;
		int result2 =  minus.minusResult();
		System.out.println(i + " - " + j + " = " + result2);

		Multiple multiple = new Multiple(i, j);
		multiple.num1 = i;
		multiple.num2 = j;
		int result3 = multiple.multipleResult();
		System.out.println(i + " X " + j + " = " + result3);

		Division division = new Division(i, j);
		division.num1 = i;
		division.num2 = j;
		String result4 = division.divisionResult();
		System.out.println(i + " / " + j + " = " + result4);

	}

}
