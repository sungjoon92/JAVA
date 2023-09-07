package oop0907;

class School { //package 생략되어 있다
			   //School클래스 oop0907패키지내에서만 사용가능하다

	//멤버 변수
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	//생성자함수
	// -> 클래스명과 동일한 함수
	// -> 리턴값이 없다
	public void School() { //기본 생성자 함수
						   //default constructor-
						   //자동으로 생성된다
		System.out.println("school() 호출됨...");
	}//end
	
	
	
	





	//멤버 함수
	public void calc() {
		aver=(kor+eng+mat)/3;
	}//calc() end
	
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}//disp() end
	

}//class end
