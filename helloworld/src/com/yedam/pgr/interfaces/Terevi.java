package com.yedam.pgr.interfaces;

public class Terevi implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("켜라");
		
	}

	@Override
	public void turnOff() {
		System.out.println("꺼라");
		
	}
	

}
