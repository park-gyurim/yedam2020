package com.yedam.pgr.common;

import com.yedam.pgr.classes.Student;

public class StudentExample {
	public static void main(String[] args) {
		for( int i = 0; i< args.length; i++) {
			System.out.println(args[0]);
		}
		Student stn = new Student();
		stn.study();
		Student snt = new Student("name");
		snt.study();
	
	}

}
