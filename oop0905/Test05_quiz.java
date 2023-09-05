package oop0905;

public class Test05_quiz {

	public static void main(String[] args) {
		//제어문 연습문제
		
		
		//문1)알파벳을 아래와 같이 한줄에 5개씩 출력하시오
        /*
            ABCDE
            FGHIJ
            KLMNO
            PQRST
            UVWXY
            Z
        */
		
		int count=0;
		for(char ch='A'; ch<='Z'; ch++) {
			count++;
			System.out.print(ch);
//			System.out.print(count);
			if(count%5==0) {
				System.out.println();
			}//if end
		}//for end
		System.out.println();
		
		//문2)아래와 같이 출력하시오
        /*
            ####
             ###
              ##
               #
        */
		
		for(int a=1; a<=4; a++) {
			for(int b=1; b<=4; b++) {
				if(a<=b){
					System.out.print("#");
				}else{
					System.out.print(" ");
				}//if end
			}//for end
			System.out.println();
		}//for end
		
		
		/*
	 	a=1 a<=4 
	 		b=1	 1<=4 1+0  true  	#
	 		b=2	 2<=4 1+1  true		##
	 		b=3	 3<=4 2+1  true		###
	 		b=4	 4<=4 3+1  true		####
	 		b=5	 5<=4 4+1  false
	    
	 */
		System.out.println();
		//문3)다음식의 결과값을 구하시오
        /*
               1   2   3   4   5      99
               ─ - ─ + ─ - ─ + ─ ...  ──   = 0.688172
               2   3   4   5   6      100
        */
		
		boolean flag=false;
		double hap=0.0;
		
		for(int a=1; a<=99; a++) {
			if(flag) {
				hap = hap - (a/(double)(a+1));
				flag=false;
			}else {
				hap = hap + (a/(double)(a+1));
				flag=true;
			}//if end
		}//for end
		System.out.println(hap);
		System.out.printf("%.4f\n",hap);
		System.out.println(String.format("%.4f", hap));
		
		
		//문4)아래와 같이 계산해서 출력하시오
        /*    
             1+....+10=55
            11+....+20=155
            21+....+30=255

            81+....+90=855
            91+....+100=955   
        */
		
		int sum=0;
		for(int a=0; a<=100; a+=10) {
			for(int b=a-9; b<=a; b++) {
				sum +=b;
		}//for end
		System.out.printf("%d + ... + %d = %d\n", (a-9), a, sum );
		sum=0;
		}//for end
		
		
		
		//문5)어느 달팽이는 낮에는 3cm올라가고, 밤에는 2.5cm 내려온다고 할때
        //   달팽이가 13cm의 나무 꼭대기에 올라가려면 며칠이 걸리는지 구하시오 (21일)
		int day=0;			//결과값
		double snail=0.0;	//달팽이
		
		while(true) {
			day++;
			snail=snail+3.0;
			if(snail>=13.0) {
				break;
			}else {
				snail=snail-2.5;
			}//if end
		}//while end
			System.out.println(day+"일");
	}//main() end
}//class end
