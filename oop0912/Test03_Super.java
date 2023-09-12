package oop0912;

public class Test03_Super {

	public static void main(String[] args) {
		//Super 부모, 조상
		//Superclasses 	부모클래스들
		//Subclasses	자식 클래스들
		
		//super		: 자식클래스에서 부모클래스의 멤버에 접근할때
		//super()	: 자식클래스의 생성자 함수가 부모 클래스의 생성자 함수를 호출할때
		
		//this	: 멤버변수(field) 와 일반 지역변수를 구분하기 위해
		//this(): 자신의 생성자함수가 자신의 생성자 함수를 호출할 때
		
		//School 클래스 생성		
		
		//상속관계헤서 생성자 함수 호출순서
		// -> 부모생성자가 먼저 호출되고 자신의 생성자 함수가 호출된다
		MiddleSchool ms = new MiddleSchool();
		ms.disp();
		
		
		HighSchool hs = new HighSchool();
		hs.disp();
		
	}//main end
}//class end
