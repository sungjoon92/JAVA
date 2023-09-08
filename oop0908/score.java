package oop0908;

 class Score { //package 생략
	 		   // oop0908팩키지 에서만 사용가능
	 		   //https://docs.oracle.com/javase/8/docs/api/
	 
	 //멤버변수 field
	 private String name;
	 private int kor, eng, mat;
	 private int aver;
	 
	 //생성자함수 constructor
//	 private -> 싱글톤
	 public Score() {}//기본 생성자 default constructor
	 public Score(String name, int kor, int eng, int mat) {
		 this.name = name; //this.멤버변수 = 지역변수
		 this.kor=kor;
		 this.eng=eng;
		 this.mat=mat;
	 }// overload를 결정하는 것은 method가 가지고있다
	 
	 
	 //멤버함수 mothod
	 public void kors() {
	 		this.kor = 20;
		 }
	 
	 public void calc() {
		 this.aver = (kor+eng+mat)/3;
	 }
	
	 public void disp() {
		 System.out.println(this.name);
		 System.out.println(this.kor);
		 System.out.println(this.eng);
		 System.out.println(this.mat);
		 System.out.println(this.aver);
	 }
	 
	 
	 
}//class end
