package oop0905;

public class Test01_format {

	public static void main(String[] args) {
		//출력서식
		//교재 p90참조

		/*
		  	\n 중바꿈
		 	\t 탭
		 	\r
			\b
		
			%d 10진 정수값 
			%f 실수형
			%c 문자형
			%s 문자열형
			
			System.out.printf("출력서식", 값);

		 */
////////////////////////////////////////////////////
		
		System.out.print("사과\n참외\n\n수박\n\n\n");
		System.out.print("바\t나\t\t나");
		System.out.print("\n\n딸기");
		
		System.out.println(); //줄바꿈
		
		System.out.printf("%d %d %d\n", 3, 5, 7);
		System.out.printf("나이:%d\n", 25);
		System.out.printf("a:%d\t b:%d\t c:%d\n" ,2 ,4 ,6);
		
		System.out.printf("#%5d#\n", 123);  //#  123#
		System.out.printf("#%-5d#\n", 123); //#123  #
		System.out.printf("#%05d#\n", 123); //#00123#
		
		System.out.printf("x:%f y:%f z:%f\n", 1.2, 3.4, 5.6);
		System.out.printf("#%6.2f#\n", 7.8); 	//#  7.80#
		System.out.printf("#%-6.2f#\n", 7.8); 	//#7.80  #
		System.out.printf("#%.2f#\n", 7.8); 	//#7.80#
		
		System.out.printf("%s %s %s\n", "Year", "Month", "Date"); 	//Year Month Date#
		System.out.printf("#%8s#\n", "HAPPY"); 						//#   HAPPY##
		System.out.printf("#%-8s#\n", "HAPPY"); 					//#HAPPY   #		
		
		System.out.println(String.format("%.4f", 10/3.0)); 			//3.3333
		
		
		
		
		
	}//main() den
}//class end
