package oop0905;

public class Test03_if {

	public static void main(String[] args) {
		// 조건문 관련 연습문제

		//if 조건문
		
		//문1)임의의 문자가 대문자, 소문자, 기타인지 구분해서 출력하시오
        char ch='b';
        if(ch>='A' && ch<='z') {
        		System.out.printf("%c 대문자\n", ch);
        	}else if(ch>='a' && ch<='z') {
        		System.out.printf("%c 소문자\n", ch);
        	}else {
    			System.out.printf("%c 기타\n", ch);	
        	}//if end
        	
        	
        
	  
//        문2)대문자는 소문자로, 소문자는 대문자로 서로 바꿔서 출력하시오
//            나머지 기호는 그대로 출력
        if(ch>='a' && ch<='z') {
    		System.out.printf("%c \n", ch+32);
    	}else if(ch>='a' && ch<='z') {
    		System.out.printf("%c\n", ch-32);
    	}else {
    		System.out.printf("%c\n", ch);
    	}//if end
        
    	
    	
        
		
		//switch~case 문
        //문3)평균점수에 따라서 a, b, c, d, f학점을 출력하시오
        int kor=100, eng=100, mat=100;
		int aver= (kor+eng+mat)/3;
		
		switch(aver/10) {
		case 10:
		case  9: System.out.println("a"); break;
		case  8: System.out.println("b"); break;
		case  7: System.out.println("c"); break;
		case  6: System.out.println("d"); break;
		default : System.out.println("f"); break;
		}//whitch end
		
		
			
		
	}//main() end

}//class end