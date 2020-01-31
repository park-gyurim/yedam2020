package com.yedam.pgr.classes;

public class StudentExample {
	public static void main(String[] args) {
		
		Student stnt = new Student(); // 스튜던트 인스턴스를 스튜던스 클래스의 stnt라는 변수(값)에 담았고 
		stnt.name = "king";
		stnt.age = 888;
		stnt.height = 2020;
		stnt.weight = 599;
		System.out.println("이름은: " + stnt.name);
		System.out.println("나이는: " + stnt.age);
		System.out.println("키는: " + stnt.height);
		System.out.println("무게는: " + stnt.weight);
		stnt.study();
		System.out.println(stnt.getAge());
		
		Student snt = new Student();
		snt.name = "kong";
		snt.age = 111;
		snt.height = 220;
		snt.weight = 199;
		System.out.println("이름은: " + snt.name);
		System.out.println("나이는: " + snt.age);
		System.out.println("키는: " + snt.height);
		System.out.println("무게는: " + snt.weight);
		
	}

}
