package com.yedam.pgr.referenceType;

public class CalculatorExample {
	public static void main(String[] args) {
//		int num1 = 10;
//		int num2 = 20;
//		sum(num1, num2);
//		minus(num1, num2);
//		multi(num1, num2);
//		divide(num1, num2);
//
//	}
//
//	private static void sum(int a, int b) {
//		int result = a + b;
//		System.out.println("두수의 합은: " + result);
//	}
//
//	private static void minus(int x, int y) {
//		int result = x - y;
//		System.out.println("두수의 차이는: " + result);
//
//	}
//
//	private static void multi(int x, int y) {
//		int result = x * y;
//		System.out.println("두수의 곱은: " + result);
//
//	}
//
//	private static void divide(int x, int y) {
//		double result = (double) x / y;
//		System.out.println("두수의 나눔은: " + result);
//
//	}
		printStar(10, "+");
		sum(1, 2);
		int r = sum2(1, 2);
		System.out.println("r의값은: " + r);
		String ret = welcome("박규림");
		System.out.println(welcome("박규림"));
	}
	
	public static String welcome(String name) {
		return "Hello " + name;
	}

	public static int sum(int a, int b ) {
		int result = a + b;
		System.out.println("두수의 합은: " + result);
		return result;
	}

	public static int sum2(int a, int b) {
		int result;
		result = a + b;
		return result;
	}

	private static void printStar(int o, String p) {
		for (int i = 0; i < o; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(p);
			System.out.println();
		}
	}

}
