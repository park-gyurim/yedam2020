package com.yedam.pgr.classes;

import java.util.Calendar;

//Calendar 클래스를 이용한 날짜와 시간 취득

public class testCalendar {

	public static void main(String args[]) {

		// 일요일 부터 금요일 까지 문자로 선언
		String[] week_name = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };

		// Calendar 클래스 인스턴트 생성
		Calendar calendar = Calendar.getInstance();

		// 년 취득
		int year = calendar.get(Calendar.YEAR);
		// 월 취득
		int month = calendar.get(Calendar.MONTH) + 1;
		// 일 취득
		int day = calendar.get(Calendar.DATE);
		// 시간 취득
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		// 분 취득
		int minute = calendar.get(Calendar.MINUTE);
		// 초 취득
		int second = calendar.get(Calendar.SECOND);
		// 주 취득
		int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;

		int day_of_year = calendar.get(Calendar.DAY_OF_YEAR);

		System.out.println("현재 시간은");
		System.out.println(year + "년" + month + "월" + day + "일");
		System.out.println("(" + week_name[week] + ")");
		System.out.println(hour + "시" + minute + "분" + second + "초");

		System.out.println("오늘은 올해 시작으로부터 " + day_of_year + "일째 되는 날입니다.");
	}
}
