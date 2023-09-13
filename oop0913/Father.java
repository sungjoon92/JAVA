package oop0913;

class Father { // package 생략
				// oop0913 팩키지내에서만 사용가능

	// 멤버변수 field
	public String name = "아버지";
	public String addr = "주소";

	// 생성자함수 constructor
	public Father() {
	}

	public Father(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}// end

	// 멤버함수 method
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.addr);
	}// disp end
}// Father class end

class Son extends Father {
	public Son() {
	}

	public Son(String n, String a) {
		super.name = n;
		super.addr = a;
	}
}// Son class end

class Daughter extends Father {

	String friend = "절친";

	public Daughter() {
	}

	public Daughter(String n, String a) {
		super(n, a);
	}
}// Daughter class end
