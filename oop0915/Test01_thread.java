package oop0915;

class MyThread1{
	private int num;
	private String name;
	
	public MyThread1() {}
	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;
	}//end
	
	public void start() {
		run();
	}//end
	
	public void run() {
		for(int a=0; a<num; a++) {
			System.out.println(name+":"+a);
		}//for end
	}//public end
}//MyThread1 class ends

public class Test01_thread {

	public static void main(String[] args) {
		//Thread 클래스
		//->하나의 프로그램이나 하나의 메소드가 CPU자원을 전부 점유하는 것을 막을 수 있다.
		
		//1)쓰레드를 사용하지 않는 경우
		MyThread1 t1 = new MyThread1(1000, "★");
		MyThread1 t2 = new MyThread1(1000, "★★");
		MyThread1 t3 = new MyThread1(1000, "★★★");
		
		t1.start();
		t2.start();
		t3.start();
		
	}//main end
}//Test01_thread class end
