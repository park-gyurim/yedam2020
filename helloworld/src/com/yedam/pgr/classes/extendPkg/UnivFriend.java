package com.yedam.pgr.classes.extendPkg;

public class UnivFriend extends Friend{
	private String university;
	
	public UnivFriend(String name, String phone, String university) {
		super(name, phone);
		this.university = university;
	}
	
	public String getuniversity() {
		return university;
	
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("학교이름은:" + university);
	}

}
