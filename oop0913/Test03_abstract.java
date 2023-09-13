package oop0913;

public class Test03_abstract {

	public static void main(String[] args) {
		// 추상클래스와 다형성

		// Travel클래스 생성

		Travel tour = new TypeA();
		System.out.println(tour.travelwhere());

		tour = new TypeB();
		System.out.println(tour.travelwhere());

		tour = new TypeC();
		System.out.println(tour.travelwhere());

	}// main end
}// class end
