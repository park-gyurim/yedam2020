package com.yedam.pgr.interfaces;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("오디오 켜라");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오 꺼라");
		
	}

}
