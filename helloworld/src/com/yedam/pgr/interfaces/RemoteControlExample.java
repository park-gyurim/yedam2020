package com.yedam.pgr.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		rc = new Terevi();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	
	Terevi t1 = new Terevi();
	Audio a1 = new Audio();
	rc = t1;
	rc = a1;
	
	
	
	}
	

}
