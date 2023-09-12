package oop0912;

public class parent {

	int one, two;
	public parent() {}
	public parent(int one, int two) {
		this.one = one;
		this.two = two;
	}
	

}//parent class end


class Child extends parent{
	int three;
	public Child() {
		super();
	}
	public Child(int a, int b, int c) {
		super(a, b);
		this.three = c;
		
		//주의) one, two 멤버변수가 private속성이면 에러발생
//		super.one=a;
//		super.two=a;	
		
		
	}
	
}//Child class end