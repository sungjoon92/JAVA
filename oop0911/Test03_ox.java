package oop0911;

public class Test03_ox {

	public static void main(String[] args) {
		//문제) 성적프로그램 OX 표시하기
		//	Jumsu클래스 생성후 실습
		/*
		 ** 
		 * 시험결과 ** ==================================== 번호 이름 1 2 3 4 5 점수 등수
		 * ------------------------------------ 1 홍길동 O X O O O 80 2 2 무궁화 O O O O O 100
		 * 1 3 라일락 X X X X O 20 5 4 진달래 X O X O O 60 3 5 봉선화 O O X X X 40 4
		 * ------------------------------------ - 맞은문제 O, 틀린문제 X표시 - 점수: O당 20점씩 - 등수:
		 * 점수를 기준으로 높은사람이 1등
		 * 
		 */
		// 1) 1명을 대상으로 성적 구하기
		// Jumsu student =new Jumsu(1, "홍길동", 3, 4, 3, 3, 3);
		// student.compute();
		// student.disp();
		//

		// 2( 5명의 성적 구하기
		Jumsu_03[] Student = { new Jumsu_03(1, "홍길동", 3, 4, 3, 3, 3), new Jumsu_03(2, "무궁화", 3, 3, 3, 3, 3),
				new Jumsu_03(3, "라일락", 1, 2, 4, 4, 3), new Jumsu_03(4, "진달래", 2, 3, 1, 3, 3),
				new Jumsu_03(5, "봉선화", 3, 3, 4, 1, 1) };

		int size = Student.length;

		// OX 표시하고, 점수 계산하기
		for (int i = 0; i < size; i++) {
			Student[i].compute();
		} // for end

		// 출력하기
		for (int i = 0; i < size; i++) {
			Student[i].disp();
		} // for end

		// 문졔)Student 배열의 Score를 기준으로 등수 구하기
		// 참조 d:\java202307\frontend\javascript\section0807\01_성적표.html

		for (int a = 0; a < size; a++) {
			for (int b = 0; b < size; b++) {
				if (Student[a].score < Student[b].score) {
					Student[a].rank = Student[a].rank + 1;
				} // if end
			} // for end
		} // for end

		System.out.println();

		for (int i = 0; i < size; i++) {
			Student[i].disp();
		} // for end

	}// main end

}// class end
