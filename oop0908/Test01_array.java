package oop0908;

public class Test01_array {

	public static void main(String[] args) {
		//객체 배열		
	Score kim  = new Score("봉선화", 25, 30, 50);
	Score lee  = new Score("라일락", 50, 65, 70);
	Score pack = new Score("진달래", 100, 80, 30);

	
	kim.kors();
	kim.calc();
	lee.calc();
	pack.calc();
	
	kim.disp();
	lee.disp();
	pack.disp();

/////////////////////////////////////////////////
	
	/*
    +---------+---------+--------+
    |  #400   |  #500   |  6300  |
    +---------+---------+--------+
     score[0]   score[1]  score[2]
*/
	
	Score[] Score = {
			 new Score("오필승",11, 22, 33)
			,new Score("코리아",44, 55, 66)
			,new Score("대한민국",77, 88, 99)
	};
	
	//객체 배열

	Score[0].calc();
	Score[1].calc();
	Score[2].calc();
	
	Score[0].disp();
	Score[1].disp();
	Score[2].disp();
	
//	int size= Score.length; //3
	
	for(int i=0; i<Score.length; i++) {
		Score[i].calc();
		Score[i].disp();
	}//for end
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}//main
	
}//class
