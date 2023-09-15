package oop0915.Test02_File;

import java.io.FileInputStream;

import oop0912.parent;

public class Test02_input {

	public static void main(String[] args) {
		// 파일 입출력(.txt)
		// 파일 : .txt .pdf .xls .ppt .jpg ~~

		// byte형 : 1바이트 할당
		// byte기반 -> 한글 깨짐

		// char형 : 2바이트 할당

		String filename = "D:/java202307/workspace/basic01_java/src/oop0915/Test02_File/data.txt";

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filename); //FileInputStream 바이트 형식 

			while (true) {
				int data = fis.read(); // 1바이트 읽기
				if (data == -1) { // 파일의 끝인지 End OF File
					break;
				} // if end
					// System.out.println(data);
				System.out.printf("%c", data);
			} // while end

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 자원반납
			try {
				if (fis != null) {
					fis.close();
				} // if end
			} catch (Exception e) {
			} // try end
		} // try end

	}// main() end
}// class end
