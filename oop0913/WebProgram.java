package oop0913;

//웹페이지를 작성할 때 사용하는 언어
// .jsp	.py	.php  .asp
public class WebProgram {
	String title = "Java program";

	class language {
		String basic = "JAVA. HTML, CSS, JavaScript";

		void display() {
			System.out.println("기초수업:" + basic);
		}
	}// WebProgram class end

	class Smart {
		String basic = "Objective-c, Java oop, C#";

		void display() {
			System.out.println("기초수업:" + basic);
		}
	}// Smart class end

	void print() {
		language lang = new language();
		lang.display();

		Smart sm = new Smart();
		sm.display();
	}// print end

}// class end
