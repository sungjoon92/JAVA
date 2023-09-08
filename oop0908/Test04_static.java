package oop0908;


import oop0908.Test4_Sawon;

public class Test04_static {

	public static void main(String[] args) {
		//static 정적
		//-> 변수(정적변수, 클래스변수), 함수
		//-> 메모리 생성 1번, 소멸1번 된다
		//-> new연산자를 이용해서 별도의 객체 생성 없이 사용가능하다
		
		// static은 클래스명으로 직접 접근 가능하다
		//-> 클래스명, 변수
		//-> 클래스명, 함수()
		//System.out.println(Math.PI);				//클래스명.변수
		//System.out.println(Math.abs(-3));			//클래스명.함수()
		//System.out.println(String.format("%.2f", 12.3456));
		////////////////////////////////////////////////////////////
		
		// Sawon 클래스를 생성하고 실습합니다
		
		
		//1) static 의 특정을 적용하지 않은 경우(비추천)
		Test4_Sawon one = new Test4_Sawon("1001", "개나리", 100);
		//나의 세금 
		double myTax= one.pay * one.TAX; //100*0.03;
		
		System.out.println(myTax);// 3.0
		
		//나의 총 지급액 = 급여 - 세금 + 수당
		int total = (int)(one.pay - myTax + one.SUDANG);
		    //107 =	  	      100 -  3.0  +   10
		System.out.println(total); //107
		
		System.out.println("회사 :"+one.COMPANY);		//회사 :(주)아이티윌
		System.out.println("사번 :"+one.sabun);		//사번 :1001
		System.out.println("이름 :"+one.name);		//이름 :개나리
		System.out.println("급여 :"+one.pay);			//급여 :100
		System.out.println("수당 :"+one.SUDANG);		//수당 :10
		System.out.println("세금 :"+one.TAX);			//세금 :0.03
		System.out.println("총지급액 :"+total);			//총지급액 :107
		one.line(); //점선 --------------------
		
		
		//2) static의 특징을 적용한 경우(추천)

		Test4_Sawon two = new Test4_Sawon("1002", "진달래", 200);
	
		myTax= two.pay * Test4_Sawon.TAX; 
			//3 = 200 * 0.03
		System.out.println(myTax); //6.0
		total = (int)(two.pay - myTax+Test4_Sawon.SUDANG);
		//204 =  		  200 -  6.0 +          10
		System.out.println(total); //204

		System.out.println("회사 :"+Test4_Sawon.COMPANY);		//회사 :(주)아이티윌
		System.out.println("사번 :"+two.sabun);				//사번 :1002
		System.out.println("이름 :"+two.name);				//이름 :진달래
		System.out.println("급여 :"+two.pay);					//급여 :200
		System.out.println("수당 :"+Test4_Sawon.SUDANG);		//수당 :10
		System.out.println("세금 :"+Test4_Sawon.TAX);			//세금 :0.03
		System.out.println("총지급액 :"+total);					//총지급액 :204
		Test4_Sawon.line();
		
		///////////////////////////////////////////////////////////////////////////////////////////
		
		
		//3) static 변수의  연산
		// -> 생성도 1번, 소멸도 1번
		
		Test4_Sawon kim=new Test4_Sawon("1003","무궁화",300);
		Test4_Sawon lee=new Test4_Sawon("1003","무궁화",400);
		
		
		
		System.out.println(kim.SUDANG); //10
		System.out.println(kim.SUDANG); //10
		
		
		kim.SUDANG = kim.SUDANG+1;    	//10+1
		System.out.println(kim.SUDANG);
		
		lee.SUDANG = lee.SUDANG+1;		//11+1
		System.out.println(lee.SUDANG);
		
		Test4_Sawon.SUDANG =Test4_Sawon.SUDANG + 1; //12+1
		
		System.out.println(Test4_Sawon.SUDANG);//추천
		System.out.println(kim.SUDANG);//추천
		System.out.println(lee.SUDANG);//추천

	
	
	
	
	
	
	
	}//main() end
}//class end
