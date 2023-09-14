package oop0914;

public class Product {

	public int price; // 상품가격
	public int bonuspoint; // 마일리지

	public Product() {}//기본 생성자 함수
	public Product(int Price) {
		//this.멤버변수=지역변수
		this.price = price;
		//상품가격의 10%를 보너스 점수 책정
		this.bonuspoint=(int)(Price*0.1);
	}//end
}// class end

class SmartTV extends Product{}//class end
class Notebook extends Product{}//class end
class HandPhone extends Product{}//class end