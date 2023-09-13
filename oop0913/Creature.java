package oop0913;

interface Creature {
	// void disp() {} 에러, 일반 메소드는 사용불가
	abstract void kind();// 인터페이스는 추상매소드만 가능

	void breathe(); // abstract 생략가능
}// interface end

class Tiger implements Creature {

	@Override
	public void kind() {
		System.out.println("포유류");
	}

	@Override
	public void breathe() {
		System.out.println("허파");
	}

}// Tiger class end

class salmon implements Creature {

	@Override
	public void kind() {
		System.out.println("뀨");
	}

	@Override
	public void breathe() {
		System.out.println("뿌뿌");
	}

}// salmon class end