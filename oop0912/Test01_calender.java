package oop0912;

import java.awt.GridBagLayout;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.crypto.Data;

public class Test01_calender {

	public static void main(String[] args) {
		// 날짜 관련 클래스 (년월일 시분초 요일)
		// 교재참조; CHAPTER 11 기본 API 클래스

		// GregorianCalendar
		// Calendar
		// Data

		GregorianCalendar now = new GregorianCalendar();

		System.out.println(now.get(1)); // 년도 2023
		System.out.println(now.get(2)); // 월 8
		System.out.println(now.get(2) + 1); // 월 9
		System.out.println(now.get(5)); // 일 12

		System.out.println("------------------");

		System.out.println(now.get(Calendar.YEAR) + "년"); // 년
		System.out.println(now.get(Calendar.MONTH) + "월"); // 월
		System.out.println(now.get(Calendar.MONTH) + 1 + "월"); // 월
		System.out.println(now.get(Calendar.DATE) + "일"); // 일

		System.out.println("------------------");

		System.out.println(now.get(Calendar.HOUR) + "시"); // 시
		System.out.println(now.get(Calendar.MINUTE) + "분"); // 분
		System.out.println(now.get(Calendar.SECOND) + "초"); // 초

		System.out.println("------------------");

		// 24시간을 기준으로
		System.out.println(now.get(Calendar.HOUR_OF_DAY) + " 24시간 기준으로 시간"); // 10
		// 요일(1일 2월 3화 4수 5목 6금 7토)
		System.out.println(now.get(Calendar.DAY_OF_WEEK) + "요일"); // 3
		/////////////////////////////////////////////////

		System.out.println("------------------");

		// 날짜 데이터 구성하기
		// 1989년 5월 30일
		GregorianCalendar myBirth = new GregorianCalendar();

		myBirth.set(Calendar.YEAR, 1989);
		myBirth.set(Calendar.MARCH, Calendar.MAY);
		myBirth.set(Calendar.DATE, 30);

		System.out.println(myBirth.get(Calendar.YEAR));
		System.out.println(myBirth.get(Calendar.MARCH));
		System.out.println(myBirth.get(Calendar.DATE));
		System.out.println("------------------");
		////////////////////////////////////////////////////

		// 날짜 데이터 연산

		// now날짜에 3년 더하기
		now.add(Calendar.YEAR, 3);
		System.out.println(now.get(Calendar.YEAR)); // 2026

		// now날짜에 5달 뺴기
		now.add(Calendar.MONTH, -5);
		System.out.println(now.get(Calendar.MONTH)); // 3

		// now날짜에 7일 더하기
		now.add(Calendar.DATE, 7);
		System.out.println(now.get(Calendar.DATE)); // 19

	}// main end
}// class end
