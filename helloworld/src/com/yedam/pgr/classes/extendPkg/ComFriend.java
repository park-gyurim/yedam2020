package com.yedam.pgr.classes.extendPkg;

public class ComFriend extends Friend {
	private String company;

	public ComFriend(String name, String phone, String company) {
		super(name, phone);
		this.company = company; //유징필드
	}

	public String getCompany() {
		return company;
	}//게터앤세터

	public void setCompany(String company) {
		this.company = company;
	}//게터앤세터

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.println("관계는" + company);
	}
	
	

}
