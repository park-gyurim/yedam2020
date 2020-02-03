package com.yedam.pgr.classes.extendPkg;

public class Child  extends Parent {
	String field2;
	
	@Override
	void method1() {
		// TODO Auto-generated method stub
		super.method1();
		System.out.println("부모클래스의 메소드1");
	}
	void method2() {
		System.out.println("자식클랴스의 메소드2");
	}
	@Override
	public String toString() {
		return "Child [field2=" + field2 + "]";
	}

}
