package oop0907;

import java.util.GregorianCalendar;

public class Test02_constructor {

	public static void main(String[] args) {
		// 생성자 함수(constructor)
		// -> 클래스 명과 동일한 함수
		// -> new연산자와 함께 메모리 할당할 때 사용한다
		// -> 오버로드가 가능하다
		
		// -> 소멸자함수(Destructor) -> 자바에는 없음!!
		//가비지 콜렉팅(Garbage Collecting)
        //->JVM이 자동으로 메모리 회수를 함.
		

		
		
		GregorianCalendar today = new GregorianCalendar();
		
		if(today.isLeapYear(2023)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}//if end
		
		//문)서기1년~서기2023~년까지 윤년의 갯수를 구하시오
		
		//1)GregorianCalendar 클래스 활용
		int count1=0;
		for(int y=1; y<=2023; y++) {
			if(today.isLeapYear(y)) {
				count1++;
			}//if end
		}//for end
		System.out.println(count1); //502
		
		
		//2)윤년 구하는 공식
		
		int count2=0;
		for(int y=1; y<=2023; y++) {
			if(y%4==0 && y%100!=0 || y%400==0) {
				count2++;
			}//if end
		}//for end
		System.out.println(count2); //490
		
		
		
		
		
		
		
		
		
	}//main() end
}//class end
