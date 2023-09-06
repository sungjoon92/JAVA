package oop0906;

public class Test04_overload {

	public static void hap(int a) {
		System.out.println(a);
	}//hap() end
	
	public static void hap(int a, int  b) {
		System.out.println(a+b);
	}//hap() end
	
	public static void hap(double a) {
		System.out.println(a);
	}//hap() end
	
	public static void hap(double a, double b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		//Method.Pverload 함수명 중복 정리
		// -> 함수명을 중복해서 사용할 수 있다.
		
		//메소드 오버로드의 전제 조건
		//-> 매개변수의 갯수가 달라야한다
		//-> 매개변수의 자료형이 달라야한다
		
		hap(3);
		// 3
		hap(2, 4);
		// 6 
		hap(5.6);
		//5.6
		hap(9.8, 7.6);		
		//지가 알아서 찾아감
		
		System.out.println(Math.abs(-3));	//int형(기본)
		System.out.println(Math.abs(4L));	//long형
		System.out.println(Math.abs(5.6f));	//float형
		System.out.println(Math.abs(7.8d));	//double형(기본), d접미사 생략가능
		
		
		
	}//main() end
}//class end
