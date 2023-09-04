package oop0904;

public class test06_quiz {

	public static void main(String[] args) {
		//연습문제
		//참조 : 지폐갯수 구하는 문제
		/*
		 * 1년 : 365.2422일
		 * 출력결과 : 365일 5시간 48분 46초
		 * 
		 * 1분  : 60초
		 * 1시간 : 60분 * 60초 = 3600초
		 * 1일  : 24시간 * 3600초 = 84600초
		 * 1년  : 365.2422 * 86400초 = 31556926.08
		 */
	
	
		
		int year=(31556926 / 86400);	
		System.out.println(year);
		
		int day=(31556926/3600%60);
		System.out.println(day);
		
		int minute=(31556926/60%60);
		System.out.println(minute);
		
		int sec=(31556926%60);
		System.out.println(sec);
		
		
		
		

		System.out.println(year+"일"+day+"시간"+minute+"분"+sec+"초");
		
		
		
	}

}
