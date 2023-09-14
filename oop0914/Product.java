package oop0914;

public class Product {

	public int price; // 상품가격
	public int bonuspoint; // 마일리지

	public Product() {
	}// 기본 생성자 함수

	public Product(int Price) {
		// this.멤버변수=지역변수
		this.price = price;
		// 상품가격의 10%를 보너스 점수 책정
		this.bonuspoint = (int) (Price * 0.1);
	}// end
}// Product class end

class SmartTV extends Product {
	public SmartTV() {
		super(100); // 상품가격 Price100, bonusPoint=10%
	}

	@Override
	public String toString() {
		return "스마트TV";// 상품명
	}

}// SmartTV class end

class Notebook extends Product {
	public Notebook() {
		super(200); // 상품가격 Price200, bonusPoint=20%
	}

	@Override
	public String toString() {
		return "노트북";// 상품명
	}
}// Notebook class end

class HandPhone extends Product {
	public HandPhone() {
		super(100); // 상품가격 Price100, bonusPoint=10%
	}

	@Override
	public String toString() {
		return "핸드폰";// 상품명
	}
}// HandPhone class end