package com.yedam.pgr.api;

public class MemberExample {
public static void main(String[] args) {
	Member m1 = new Member();
	m1.name = "park";
	m1.age = 10;
	Member m2 = new Member();
	m2.name = "lee";
	m2.age = 40;
	
	System.out.println(m1.equals(m2));
	System.out.println(m1.hashCode());
}
}