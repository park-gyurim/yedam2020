package com.yedam.pgr.referenceType;

import java.util.Scanner;

public class Baseball2 {
	public static void main(String[] args) {

		int com[] = new int[3];
		int user[] = new int[3];
		int num = 0;
		int count = 0;
		boolean loop = true;

		int strike = 0;
		int ball = 0;

		
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (com[j] == com[i]) {
					i--;
					break;
				}
			}

		}
		Scanner sc = new Scanner(System.in)
				System.out.println("1~9의 정수를 입력하세요>>");
		
		loop = true;
		while (loop) {
			for ( int i = 0; i < user.length; i++) {
				num = sc.nextInt();
				user[i] = num;
				if (num < 0 || num> 10) {
					System.out.println("1~9의 정수를 입력하세요>>");
					
				}
			}
			
			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < user.length; j++)
					if (com[i] == user[j] && i ==j) {
						strike++;
					}
					else if (com[i] == user[j] && i != j) {
						ball++;
					}
					
			}
		}
		
		System.out.println(strike + "스트라이크" + ball + "볼");
		strike = 0;
		ball = 0;
		
		if (strike >= 3) {
			loop = false;
		}
		count = count + 1;
		}
	
	System.out.println("횟수 : " + (count - 1));
	System.out.println("Game Over");
	sc.close() ;
	}
}
