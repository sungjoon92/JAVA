package oop0913;

abstract public class Travel { // 추상클래스
	void view() {
	} // 일반메소드

	abstract String travelwhere(); // 추상 메소드
}// Travel class end

class TypeA extends Travel {

	@Override
	String travelwhere() {
		return "코딩 너무 어려워";
	}
} // TypeA class end

class TypeB extends Travel {

	@Override
	String travelwhere() {
		return "자바 너무 어려워";
	}
} // TypeA class end

class TypeC extends Travel {

	@Override
	String travelwhere() {
		return "i can do it";
	}
} // TypeA class end