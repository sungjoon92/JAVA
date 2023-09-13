package oop0913;

abstract public class Animal { // 추상클래스
	String name;

	void view() {
	}// 일반 메소드

	abstract void disp(); // 추상 메소드

	// abstract 클래스안에 추상메소드가 하나라도있으면 클래스는 추상클래스로변경
}// class end

//추상클래스는 부모역할만 주로 한다
//추상클래스는 상속받은 자식클래스는 반드시 추상메소드를 완성해야 한다(override)
class Elephant extends Animal {

	@Override
	void disp() {
		System.out.println("점보");

	}// class end
}

class Tuna extends Animal {

	@Override
	void disp() {
		System.out.println("니모");

	}

}// class end