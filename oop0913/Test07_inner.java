package oop0913;

import oop0913.WebProgram.Smart;
import oop0913.WebProgram.language;

public class Test07_inner {

	public static void main(String[] args) {
		// 내부클래스 inner class
		// -> 클래스 내부에서 선언된 클래스

		// WebProgram클래스 생성

		WebProgram web = new WebProgram();
		web.print();

		// 에러. 내부클래스는 직접 접근할 수 없다.
		// language lang = new language();
		// smart sm = new smart();

		// 내부클래스는 외부에서 단계저으로 접근할 수 있다
		language lang = new WebProgram().new language();
		lang.display();

		Smart sm = new WebProgram().new Smart();
		sm.display();
		////////////////////////////////////
		/*
		 * 안드로이드 (구글사에서 만들 모바일 전용 OS) class R{ class id{ } } 접근방식 r.id
		 */

	}// main end
}// class end
