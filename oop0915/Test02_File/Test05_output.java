package oop0915.Test02_File;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Test05_output {

	public static void main(String[] args) {
		// 메모장 파일에 출력하기

		// 출력파일 (sungjuk.txt)
		// -> 없으면 파일은 생성된다 (create)
		// -> 있으면 덮어쓰기(overwrite) 또는 추가(append)

		String fileName = "D:/java202307/workspace/basic01_java/src/oop0915/Test02_File/sungjuk.txt";

		FileWriter fw = null;
		PrintWriter out = null;

		try {

			// true : append
			// false : overwrite
			fw = new FileWriter(fileName, false);
			// true:중접 , false:기존글 삭제후 글 출력

			// autoFlush : true 버퍼클리어
			out = new PrintWriter(fw, true);

			out.println("무궁화,95,90,100");
			out.println("홍길동,100,100,100");
			out.println("라일락,90,95,35");
			out.println("개나리,85,70,75");
			out.println("진달래,35,40,60");

		} catch (Exception e) {
			System.out.println("파일쓰기 실패:" + e);
		} finally {

			try {
			} catch (Exception e) {
				if (out != null) {
					out.close();
				} // if end
			} // try end

			try {
			} catch (Exception e) {
				if (out != null) {
					out.close();
				} // if end
			} // try end

		} // try ~ catch end

	}// main end
}// class end
