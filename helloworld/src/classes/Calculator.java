package classes;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		while (true) {
			Scanner scn = new Scanner(System.in);
			{

			System.out.println("사칙연산 부호: +,-,/,*   q: 종료");
			String operator = scn.nextLine();
			if (operator.equals("q")) {

				System.out.println("강제종료합니다.");
				
			}

			System.out.println("첫번째수 입력: ");
			int num1 = scn.nextInt();

			System.out.println("두번째수 입력: ");
			int num2 = scn.nextInt();

			cal(num1, num2, operator);

		}
			
		 System.out.println ("종료");

	}

	public static void cal(int a, int b, String oper) {
		double result = 0;
		if (oper.equals("+"))
			result = sum (a, b);
		else if (oper.equals("*"))
			result = multi (a, b);
		else if (oper.equals("-"))
			result = minus(a, b);
		else if (oper.equals("/"))
			result = divide(a, b);
		System.out.println("계산값은 : " + result);

	}

	public static int sum (int num 1, num2) {
		int result = num1 + num2;
		return result;
	}

	public static int minus(num 1, num2) {
		return result = num1 - num2;
	}

	public static double divide(num 1, num2) {
		return (double) = num1 / num2;
	}

	public static int multi(num 1, num2) {
		return = num1 * num2;
}
}
