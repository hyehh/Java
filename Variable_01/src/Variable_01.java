
public class Variable_01 {

	public static void main(String[] args) {
		
		// 변수(Variable)
		// 문자열 변수 선언
		String str = "Hello, World!"; // 변수 선언
		
		System.out.println(str);
		
		str = "abc";
		
		System.out.println(str);
		
		// 정수 변수 선언
		int num1 = 10;
		int num2 = 20;
		int plusResult2;
	
		
		plusResult2 = num1 + num2;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println((double)num1 / num2);
		System.out.println((double)(num1 / num2));
		
		System.out.println(plusResult2);
		
		num1 = 100;
		System.out.println(num1);
		
		// Exercise

		int startNum = 50, endNum = 20;
		
		int plusResult = startNum + endNum;
		int minusReult = startNum - endNum;
		int multipleResult = startNum * endNum;
		int divisionResult = startNum / endNum;
		double divResult = (double)startNum / endNum;
		
		
		
		System.out.println(startNum + "과 " + endNum + "의 덧셈 결과는 " + (startNum + endNum) + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 뺄셈 결과는 " + (startNum - endNum) + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 곱셈 결과는 " + (startNum * endNum) + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 나눗셈 중 몫은 " + (startNum / endNum) + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 나눗셈 중 결과는 " + ((double)startNum / endNum) + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 덧셈 결과와 뺄셈 결과의 곱은 " + ((startNum + endNum) * (startNum - endNum)) + " 입니다.");
		
		
		System.out.println(startNum + "과 " + endNum + "의 덧셈 결과는 " + plusResult + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 뺄셈 결과는 " + minusReult + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 곱셈 결과는 " + multipleResult + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 나눗셈 중 몫은 " + divisionResult + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 나눗셈 중 결과는 " + (double)divResult + " 입니다.");
		System.out.println(startNum + "과 " + endNum + "의 덧셈 결과와 뺄셈 결과의 곱은 " + (plusResult * minusReult) + " 입니다.");
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
