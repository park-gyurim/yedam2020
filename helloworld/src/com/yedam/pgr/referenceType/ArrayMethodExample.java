package com.yedam.pgr.referenceType;

public class ArrayMethodExample {
	public static void main(String[] args) {

		int[] intAry = { 3, 5, 7, 8, 4 };
		int sum = sumArrayMethod(intAry);
		System.out.println("합은: " + sum);
		
		int[] intAry2 = { 3, 5, 7, 8, 4 };
		int sum2 = sumArrayMethod(intAry2);
		System.out.println("배열의 길이: " + intAry2.length);
		
		int[] intAry3 = { 13, 15, 72, 8, 4 };
		int sum3 = sumArrayMethod(intAry3);
		System.out.println("배열의 길이: " + intAry2.length);
		
	}
	public static int sumArrayMethod(int[] ary) {
		int[] intAry3 = { 13, 15, 72, 8, 4 };
		int sum = 0;
		for ( int i = 0; i < ary.length; i++)
			sum += ary.length;
		
		return 0;
		
	}
}