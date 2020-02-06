package com.yedam.pgr.generic;

import com.yedam.pgr.generic.before.Apple;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("hello");
		String str = box.get();
		
		Box<Apple> appleBox = new Box<apple>();
		appleBox.set(new Apple());
		str = appleBox.get();
	}

}
