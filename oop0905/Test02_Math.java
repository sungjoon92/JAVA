package oop0905;

public class Test02_Math {

	public static void main(String[] args) {
		//Math 수락 관련 클래스
		
		System.out.println(Math.E);					//2.718281828459045
		System.out.println(Math.PI);				//3.141592653589793
		
		System.out.println(Math.E	);				//2.718281828459045
		
		
		//절대값
		System.out.println(Math.abs(3));			//3
		System.out.println(Math.abs(-3));			//3
		System.out.println(Math.abs(2.4));			//2.4
		System.out.println(Math.abs(-2.4));			//2.4
		System.out.println("----------------");		//----------------
		
		System.out.println(Math.ceil(1.3));			//2.0
		System.out.println(Math.floor(2.7));		//2.0
		System.out.println(Math.round(3.8));		//4
		System.out.println("----------------");		//----------------
		
		System.out.println(Math.max(3, 5));			//5
		System.out.println(Math.max(2, Math.max(4, 8)));	//8
		System.out.println(Math.min(6,7));			//6
		System.out.println("----------------");		//----------------
		
		
		
		//난수 : random 값, 무작위로 발생한 값
		//난수 발생 범위 : 0.0 <= r < 1.0
		
		//문1) 주사위 수의 범위 : 1~6발생 시키기
		System.out.println((int)(Math.random()*6));
		
		//문2) 로또번호 범위 : 1~45
		System.out.println((int)(Math.random()*45)+1);
		
		
		
		
		
		
	}//main

}//class end
