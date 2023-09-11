package oop0911;

public class test07_quiz {

	public static void main(String[] args) {
		//문1) 주민번호의 각 숫자의 합을 구하시오
		// 		8+9+1+2+3+0+1+2+3+4+5+6+7= 51
		
	
		// 1) Character 클래스
	String jumin="8912301234567";
		int hap= 0;
		for(int i=0; i<jumin.length(); i++) {
			int a=jumin.charAt(i);
			hap=hap+a;
			
			System.out.println(hap);
		}
		
	
		// 2) Integer 클래스ㅁ
		
	}//main end
}//class end
