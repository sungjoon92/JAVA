package oop0907;

public class Sungjuk {//package 생략되어 있음
					  //클래스명이 첫글자는 대문자로 하낟
	

	//멤버변수 field 
	public String name; //클래스 외부에서 접근 가능하다
	int kor, eng, mat;	//package 생략되어있음
	private int aver;	//Sungjuk클래스 내부에서만 접근 가능
	
	
	//멤버함수	method 
	private void view() {
		System.out.println(176867878);
	} //view() end
	
	
	private void view(String name,int eng) {
		this.name = name;
		this.eng = eng;
	} //view() end
	
	void calc() {//package 생략되어 있음
		//클래스 내부의 멤버들 간에는 Access Modifier와 상관없이 점근 가능
		aver=(kor+eng+mat)/3;
		view();
		view("원성준",1000);
	}//calc() end
	
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}//disp() end
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	

}//class end
