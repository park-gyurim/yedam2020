package com.yedam.pgr.classes.abstractPkg;

public class Dog extends Animal {
	Dog() {
		kind = "개새끼";
	}

	@Override
	void sound() {
		System.out.println(kind + "멍멍");

	}


	@Override
	void sleep() {
		System.out.println(kind + "개잔다");
		
	}
}
