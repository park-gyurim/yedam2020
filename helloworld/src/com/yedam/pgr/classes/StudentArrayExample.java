package com.yedam.pgr.classes;

public class StudentArrayExample {
	static Student[]  stdAry = new Student[3];
	
	public static Student getStudent(String name) {
		Student st1 = null;
		for (int i = 0; i < stdAry.length; i++) {
			if (stdAry[i].name.equals("kong"))
			System.out.println(stdAry[i].getName() + " " + stdAry[i].getAge());
	}

}

	public static void main(String[] args) {

		Student[] stdAry = new Student[3];

		Student sn = new Student("park", 29, 170, 75);

		Student stnt = new Student(); // 스튜던트 인스턴스를 스튜던스 클래스의 stnt라는 변수(값)에 담았고
		stnt.setName("king");
		stnt.setAge(888);
//		stnt.setage = 888;
		stnt.setHeight(2020);
		stnt.setWeight(599);

		Student snt = new Student();
		snt.setName("kong");
		snt.setAge(111);
//		snt.setage = 111;
		snt.setHeight(220);
		snt.setWeight(199);

		stdAry[0] = sn;
		stdAry[1] = stnt;
		stdAry[2] = snt;

		stdAry[0] = stdAry[0];
		stdAry[1] = stdAry[1];
		stdAry[2] = stdAry[0];

//		for (int i = 0; i < stdAry.length; i++) {
////			if (stdAry[i].name.equals("kong"))
//			System.out.println(stdAry[i].getName() + " " + stdAry[i].getAge());
//	}
		Student
		}
	
	}
