package com.yedam.pgr.classes;

import java.util.Scanner;

//2,3 배수 이외의 경우는 기타
// 종료는  999입력
public class MultiplesExample {
	
	public static void main(String[] args) {
		
		int number = 0;
	    int count = 0;
	    
	    Scanner Keyboard = new Scanner(System.in);
	    System.out.println("정수를 입력하세나");
	    number = Keyboard.nextInt();
	    
	    int number = 0; 
	    
	    for(int number = 0; number <= 1000; number++);
	    {

			if(number % 3 == 0  && number % 2 == 0); 
	    	{
	    		count++;
	    	}
	    }
	    System.out.println(number + "의 배수는: " + count);
		
	}
}