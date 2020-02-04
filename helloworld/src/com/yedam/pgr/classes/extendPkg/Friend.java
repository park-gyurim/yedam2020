package com.yedam.pgr.classes.extendPkg;

public class Friend {

	private String name;
	private String phone;// 1. 이까지 타이핑

	public Friend(String name, String phone) {
		super();
		this.name = name;// 4. 소스 - 유징필드 클릭클릭
		this.phone = phone;
	}

	public String getName() {
		return name; // 2. 소스 - 게터앤세터 클릭클릭
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {// 3. 소스 -투스트링
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}

	public void showInfo() {
		System.out.println("이름은" + name);
		System.out.println("전화번호는" + phone);
	}

}
