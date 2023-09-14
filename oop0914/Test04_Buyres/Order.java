package oop0914.Test04_Buyre;

import java.util.Iterator;
import java.util.Vector;

import oop0912.parent;

class Order {

	private int myMoney = 1000;// 나의 총 재산
	private int myMileage = 0;// 나의 마일리지 점수
	private int i = 0;

	private Vector<Product> item = new Vector<Product>();

	public Order() {
	}

	public void buy(Product p) { // 다형성
// 		Product= SmartTv, Notebook, HandPhone

		// 잔액 부족시 리턴
		if (this.myMoney < p.price) {
			System.out.println("잔액부족");
			return;
		} // if end

		// 구매상품 저장
		item.add(p);

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

		for (int n = 0; n < item.size(); n++) {
			Product p = item.get(n);
			shoplist.append(p.toString() + " "); // 상품명
			hap = hap + p.price; // 사용금액
		} // for end

		System.out.println("구매 상품 목록 : " + shoplist);
		System.out.println("사용금액 : " + hap);
		System.out.println("나의 남은 재산 : " + this.myMoney);
		System.out.println("나의 마일리지 : " + this.myMileage);
	}// disp end

	
	public void refund(Product p) {
		if(item.remove(p)) {
			System.out.println(p.toString()+"반품되었습니다~");
			this.myMoney = this.myMoney+p.price;
			this.myMileage=this.myMileage-p.bonuspoint;
		}else {
			System.out.println("구매내역에 상품이 없습니다!!");
		}//if end
	}//refund class end
	
	
	
	
	
	
	
	
	
}// Buyer class end
