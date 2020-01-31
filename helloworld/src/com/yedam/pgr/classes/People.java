package com.yedam.pgr.classes;

public class People {
	// 필드
	String name;
	int age;
	String address;

	People() {

	}

	People(String name) {
		this.name = name;
	}

	People(String name, int age, int height, int weight, String address) {
		this.name = name;
		this.age = age;
//		this.height = height;
//		this.weight = weight;
		this.address = address; // 오브로딩하는것.
	}

	// 메소드

	String showName() {
		return name;
	}

	String showAddress() {
		return "주소는" + address;
	}

	void feeling() {
		System.out.println("새로운 세상을 느끼고 있다.");
	}

}
