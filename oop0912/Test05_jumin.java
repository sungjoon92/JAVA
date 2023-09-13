package oop0912;

public class Test05_jumin {

	public static void main(String[] args) {
		// 문제) 주민번호 유효성 검사
		// Jumin 클래스 생성해서 실습

		Jumin id = new Jumin("8912301234567");

		/*
		 * Jumin id2 = new Jumin(); id2.setJiminno("8912301234567");
		 */

		if (id.validate()) {
			System.out.println("주민번호 맞다");
		} else {
			System.out.println("주민번호 틀리다");
		} // if end

		id.disp();
	}// main end
}// class end
