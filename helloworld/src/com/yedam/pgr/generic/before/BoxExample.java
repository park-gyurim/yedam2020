package com.yedam.pgr.generic.before;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("hello");
		String str = (String) box.get();
		
		Apple apple = new Apple();
		box.set(apple);
		Apple apple2 = (Apple) box.get();
		String str2 = (String) box.get();
		
	}

}
