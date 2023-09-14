package oop0914.Test04_Buyre;

import java.util.Iterator;

class Buyer {

	private int myMoney = 1000;// 나의 총 재산
	private int myMileage = 0;// 나의 마일리지 점수
	private int i = 0;

	Product[] item = new Product[10];

//-------------------------------
//Product
//	+------------+-------------+-------------+--
//	|  SmartTV   |   Notebook  |  HandPhone  |  ~~
//	+------------+-------------+-------------+--
//	  item[0]       item[1]       item[2]      ~~

	public Buyer() {
	}

//	//메소드 오버로드(함수명 중복정의)
//	public void buy(SmartTV a) {}
//	public void buy(Notebook a) {}
//	public void buy(HandPhone a) {}

	public void buy(Product p) { // 다형성
// 		Product= SmartTv, Notebook, HandPhone

		// 잔액 부족시 리턴
		if (this.myMoney < p.price) {
			System.out.println("잔액부족");
			return;
		} // if end

		item[i++] = p; // 구매상품 저장

		// 나의 재산은 감소
		this.myMoney = this.myMoney - p.price;
		// 마일리지는 +
		this.myMileage = this.myMileage + p.bonuspoint;
	}// buy end

	public void disp() {

		// 구매 상품 목록과 구매한 상품의 총 합계금액
		// item 배열 활용

		// 구매한 상품 목록
		StringBuilder shoplist = new StringBuilder();
		// 사용금액
		int hap = 0;
		 
		for (int n = 0; n < item.length; n++) {
			if (item[n] == null) {
				break;
			} // if end
			shoplist.append(item[n].toString() + " "); // 상품명
			hap = hap + item[n].price; // 사용금액

		} // for end

		System.out.println("구매 상품 목록 : " + shoplist);
		System.out.println("사용금액 : " + hap);
		System.out.println("나의 남은 재산 : " + this.myMoney);
		System.out.println("나의 마일리지 : " + this.myMileage);
	}// disp end

}// Buyer class end
