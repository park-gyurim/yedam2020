package com.yedam.pgr.classes;

public class MethodOverloadingExample {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1);
		int num1 = 1, num2 = 20;
		double d1 = 1.5, d2 = 2.3;
		print(sum(d1, d2));// 더블 받아서 실행할 수있도록 메소드
		print(sum(num1, num2));//인트  받아서 실행할 수 있도록 메소드
		
	}	
		static void print(double d) {
			System.out.println(d);
	}
	static void print(String str) {
		System.out.println(str);
	}
	static void print(int str) {
		System.out.println(str);  // 오버로딩을 할려면 매개변수에 매개값 수와 순서가 다르거나, 변수타입 이 달라야한다
	}

	static int sum(int a, int b) {// static 클래스에 인트 타입에 썸이라는 메소드에 매개변수에 int 매개값
		return a + b ;
	}
	static int sum(int a, int b, int c) {
		return a + b +c;
	}
	static double sum(double a, double b) {
		return (double) (a +b);
	}
}

