package com.yedam.pgr.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NullPointerExceptionExample {
	public static void main(String[] args) throws ClassNotFoundException {
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("숫자입력:");
			try {
				int num = scn.nextInt();
				System.out.println("입력하신 값은: " + num);
				if (num == 9)
					break;
			} catch (Exception e) {
				System.out.println("입력값을 확인.");
				scn.nextLine();
			} finally {
				System.out.println("반드시 실행이 되어야 내용.");
			}
		}//end of while
		findClass();
		System.out.println("프로그램 종료.");
	}// end of main

	static void findClass() throws ClassNotFoundException {
		Class t = Class.forName("java.lang.String2");
		System.out.println(t.getName());
	}
}
