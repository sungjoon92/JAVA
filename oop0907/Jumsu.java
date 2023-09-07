package oop0907;

class Jumsu {
	//멤버변수 field
	private String name="손흥민";
	private int kor, eng, mat;
	private int aver;
	
	//생성자 함수 constructor
	//생성자함수를 오버로드하면 기본생성자 함수는 자동으로 생성되지않는다
	//그래서, 기본생성자 함수는 수동으로 생성할 것을 추천!!
	public Jumsu() {}
	
	public Jumsu(String n) {
		name = n;
	}//end
	
	
	public Jumsu(String name,  int kor, int eng, int mat) {
		//this.멤버편수=지역변수
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.aver = (kor+eng+mat ) /3;
	}//end
	
	
	//멤버함수 method
	public void disp() {
		String name="박지성";
		System.out.println(name);
		
		System.out.println(this.name);//손흥민
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.mat);
		System.out.println(this.aver);
		
	}//disp() end
		
		
		
	
	
	
	
}//class end
