package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Add;
import com.javalec.function.Division;
import com.javalec.function.Division2;
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
		add.addResult(i, j);
		
		Minus minus = new Minus();
		minus.minusResult(i, j);
		
		Multiple multiple = new Multiple();
		multiple.multipleResult(i, j);
		
		Division division = new Division();
		division.divisionResult(i, j);
		
		Division2 division2 = new Division2();
		division2.divisionResult2(i, j);
		
	}

}
