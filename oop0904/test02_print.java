package oop0904;

public class test02_print {

	public static void main(String[] args) {
		
		//단축키 : syso 입력후 ctrl + space
		//System.out.println(); 콘솔창 출력 명령어
		
		System.out.println(123); // 숫자 데이터
		System.out.println("SEOUL");// 문자열 데이터
		
		System.out.print("국어");
		System.out.print("영어");
		System.out.print("수학");
		
		//출력하고 줄바꿈(엔
		System.out.println(123);
		System.out.println(789);
		System.out.println(456);
		
		System.out.println(); //콘솔창에서 줄바꿈

		//문자열 데이터 구분 기호"
		System.out.println("JAVA");
		System.out.println("PYTHON");
		System.out.println(123);	//숫자열
		System.out.println("456");	//문자열형
		
	// " ' \ 등을 단순 기호로 인식하고자 할 때
	System.out.println(123+456);		//579	
	System.out.println("123"+"456");	//123456
	System.out.println(123+"456");		//123456
	System.out.println("123"+456);		//123456
	System.out.println("123+456");		//123+456
		
		
		
	}//main() end

}//class end
