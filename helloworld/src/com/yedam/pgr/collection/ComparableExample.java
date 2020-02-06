package com.yedam.pgr.collection;

import java.util.Arrays;

public class ComparableExample {
	public static void main(String[] args) {
		
		Person p1 =  new Person("hong", 20);
		Person p2 =  new Person("kim", 30);
		Person p3 =  new Person("oleedd", 30);
		Person[] pAry = {p1, p2, p3};
		Arrays.sort(pAry);
		for(int i = 0; i < pAry.length; i++) {
			System.out.println(pAry[i].name + ", " + pAry[i].age);
		}
	}

}
