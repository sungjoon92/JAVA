package oop0907;

public class Test04_constructor {

	public static void main(String[] args) {
		// 생성자 함수
		// -> 오버로드가 가능하다
		
		// Score 클래스 생성후 테스트
	
		
//	생성자 함수의 전달값은 객체선언과 동시에 초기값을 전달해 주는 역할을 한다
		Score abc =	new Score();
		
		
		Score one =	new Score("개나리");
		one.calc();
		one.disp();
		
		
		
		Score two = new Score(70, 80, 90);
		two.calc();
		two.disp();
		
		Score three = new Score("진달래", 10, 20, 30);
		three.calc();
		three.disp();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main() end
}//class end
