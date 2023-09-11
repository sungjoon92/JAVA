package oop0911;

public class Test04_sangsok {

	public static void main(String[] args) {
		// 상속 Inheritance
		/*
			- 재활용
			- 부모와 자식, 조상 후손(파생 클래스),super와 sub
			- extends 확장, implements 구현
			- 형식) 자식 extends 부모 {}
		*/
		
		//AA클래스 생성후 실습
		
		
		
		AA aa=new AA();
		
		aa.one();
		aa.two();
//		aa.zero(); 에러 private 속성은 클래스 내부에서만 접근 가능하다
		System.out.println("--------------");
		
		BB bb=new BB();
		bb.one();
		bb.two();
		bb.three();
//		aa.zero(); 에러 private은 상속되지 않는다
		System.out.println("--------------");
		
		CC cc=new CC();
		cc.one();
		cc.two();
		cc.three();
		cc.four();
		System.out.println("--------------");
		
		
		
		
		
		
		
		
		
	}//main end

}//class end
