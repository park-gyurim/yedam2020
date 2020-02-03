package com.yedam.pgr.classes.extendPkg;

public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone() {
		super();
	}

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}
	void turnOnDmb() {
		System.out.println("채널 : " + channel + "본 DMD방송 수신");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 : " + channel + "번으로 바꿉니다");
	}
	void turnOffDmb() {
		System.out.println("DMB수신종료");
	}

}
