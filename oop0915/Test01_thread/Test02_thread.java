package oop0915.Test01_thread;

class MyThread2 extends Thread {
	private int num;
	private String name;

	public MyThread2() {
	}

	public MyThread2(int num, String name) {
		this.num = num;
		this.name = name;
	}// end

	// start() 함수는 Run()함수를 호출하는 기능

	@Override
	public void run() {
		for (int a = 0; a < num; a++) {
			System.out.println(name + ":" + a);
		} // for end
	}// run() end
}// class end

public class Test02_thread {

	public static void main(String[] args) {
		// 2)쓰레드를 사용한 경우
		// -> JVM이 쓰레드 관리자에 등록하고, start()메소드가 run()를 호출한다.
		// -> 예) 채팅, 신시간 예매들에 많이 사용

		MyThread2 t1 = new MyThread2(1000, "★");
		MyThread2 t2 = new MyThread2(1000, "★★");
		MyThread2 t3 = new MyThread2(1000, "★★★");

		t1.start();
		t2.start();
		t3.start();
	}// main end
}// Test02_thread class end
