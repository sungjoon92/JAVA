package oop0915.Test02_File;

import java.io.FileReader;

public class Test03_input {

	public static void main(String[] args) {

		String filename = "D:/java202307/workspace/basic01_java/src/oop0915/Test02_File/data.txt";

		FileReader fr = null;
		try {
			fr = new FileReader(filename);
			while (true) {
				int data = fr.read(); // 2바이트 읽기
				if (data == -1) {
					break;
				} // if end
				System.out.printf("%c", data);
			} // while end

		} catch (Exception e) {
			System.out.println("파일 읽기 실패:" + e);
		} finally {
			// 자원반납
			try {
				if (fr != null) {
					fr.close();
				} // if end
			} catch (Exception e2) {
				// TODO: handle exception
			} // try end
		} // finally end
	}// main end
}// class end
