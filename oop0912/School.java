package oop0912;

class School {
	String name = "학교";

	public School() {
		System.out.println("School()...");
	}// end
}// School class end

class MiddleSchool extends School {

	public MiddleSchool() {
		// 상속관계에서 부모 생성자 함수 호출 명령어
		super(); // 생략되어있다
		System.out.println("MiddleSchool()...");
	}

	public void disp() {
		String name = "강남고등학교";
		System.out.println(name);
	}// disp end

}// MiddleSchool class end

class HighSchool extends School {

	String name = "고등학교";

	public HighSchool() {
		System.out.println("HighSchool()...");
	}

	public void disp() {
		String name = "강남고등학교";
		System.out.println(name); // 강남고등학교 지역변수
		System.out.println(this.name); // 고등학교 나의 멤버변수
		System.out.println(super.name); // 학교 부모의 멤버변수
	}// disp end

}// HighSchool class end