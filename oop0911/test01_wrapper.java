package oop0911;


import java.lang.*; // 자바의 기본 팩키지. 생략가능


public class test01_wrapper {

	public static void main(String[] args) {
		//Wrapper class 포장 클래스
		//-> 기본 자료형을 참조형화 해 놓은 클래스들
		//-> 대부분 java.lang 패키지에 선언되어 있음
		
		/*
			기본형 참조형(클래스)			참조형(클래스)
			boolean					Boolean
			byte					Byte
			short					Short
			int						Integer
			long					Long
			float					Float
			doudle					Double
			char					Character
		*/
	//////////////////////////////////////////////////////
		
		boolean boo1 = true;
		Boolean boo2 = new Boolean("false"); //Deprecated 절판
		Boolean boo3 = true;
	
		System.out.println(boo1);
		System.out.println(boo2);
		System.out.println(boo3);
		System.out.println(boo3.toString()); //"true" 문자열 데이터
		
		//////////////////////////////////////////////////////
		
		
		byte by1 = 3;
		Byte by2 = new Byte("5");
		Byte by3 = 7;
		
		System.out.println(by1);
		System.out.println(by2);
		System.out.println(by3); 
		System.out.println(by3.toString()); //"7"
		/////////////////////////////////////////////
		
		
		int in1 = 2;
		Integer in2 = new Integer(5);
		Integer in3 = 6;
		
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		
		System.out.println(in2.toString());		//"4"
		System.out.println(in3.doubleValue());	//6.0
		
		System.out.println(Integer.toBinaryString(15));	//"1111" 2진수 변환
		System.out.println(Integer.toOctalString(15)); //"17" 16진수 변환
		System.out.println(Integer.toHexString(15)); //"f" 8진수 변환
		
		System.out.println(Integer.sum(2, 4)); //6
		System.out.println(Integer.max(2, 4)); //4
		System.out.println(Integer.min(2, 4)); //2
		
		
		System.out.println(Integer.parseInt("123")); //"123" -> 123 변환
		
		//에러 발생
//		NumberFormatException.java:67
//		System.out.println(Integer.parseInt("KOREA"));
		/////////////////////////////////////////////////
		
		long lo1 = 3L;
		Long lo2 = new Long(5);
		Long lo3 = 7L;
		
		
		double dou1 = 2.4;
		Double dou2 = new Double("3.5");
		Double dou3 = 6.7;
		
		//문) 실수형 값들 중에서 정수의 합을 구하시오 (2+3+6)
		
		int hap= (int)dou1 + dou2.intValue()+ dou3.intValue();
		System.out.println(hap); //11
	///////////////////////////////////////////////////
		
		
		char ch1='R';
		Character ch2 = new Character('a');
		Character ch3 = 'm';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		System.out.println(Character.isWhitespace(' ')); // 공벡인지 물어보는함수
		System.out.println(Character.toLowerCase('R')); //대문자 - 소문자변환
		System.out.println(Character.toUpperCase('a'));	//소문자 - 대문자 변환
		
		//////////////////////////////////////////////
		//문) 대소문자 서로 바꿔서 출력히시오(Character 클래스와 CharAt() 함수 이용)
		//	출력결과 gONE wITH tHE wIND!!
		String str="Gone With The Wind!!";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)){
				System.out.println(Character.toLowerCase(ch));
			}else if(Character.isLowerCase(ch)) {
				System.out.println(Character.toUpperCase(ch));
			}else {
				System.out.println(ch);
			}// if end
		}//for end
		
		/*
		String st = "";
		for(int i=0; i<str.length();i++) {
			char d = str.charAt(i);
			if(d>='A' && d<='Z') {
				d=Character.toLowerCase(d);
				st = st + d;
			} else if (d>='a' && d<='z') {
				d=Character.toUpperCase(d);
				st = st + d;
			} else
				st = st + d;
		}
		System.out.println(st);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main end

}//class end
