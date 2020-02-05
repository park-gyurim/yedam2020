package com.yedam.pgr.api;

public class Member {
	String name;
	int age;

	@Override
	public boolean equals(Object obj) {
		Member m = (Member) obj;
		return this.age == m.age && this.name.equals(m.name);
	
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
}
