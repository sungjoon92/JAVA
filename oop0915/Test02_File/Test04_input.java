package oop0915.Test02_File;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test04_input {

	public static void main(String[] args) {

		String filename = "D:/java202307/workspace/basic01_java/src/oop0914/Test04_Buyre/Buyer.java";

		FileReader fr = null;
		BufferedReader br = null;

		try {
			// 1) 파일 가져오기(읽기모드)
			fr = new FileReader(filename);

			// 2( 엔터단위로 끊어서 읽기 위해 BufferedReader에 옮겨 담기
			br = new BufferedReader(fr);

			int num = 0;// 행번호

			while (true) {
				String line = br.readLine();// 3) 엔터(\n)를 기준으로 한줄씩 가져오기
				if (line == null) { // 파일의 끝인지?(EOF)
					break;
				} // if end
					// 20행마다 밑줄 긋기
				if (num % 20 == 0) {
					System.out.println("----------------------------------------");
				} // if end
				System.out.printf("%d %s\n", ++num, line);
			} // while end

			// 20행마다 밑줄 긋기
			if (num % 20 == 0) {
				System.out.println("----------------------------------------");
			} // if end

		} catch (Exception e) {
			System.out.println("파일 읽기 실패:" + e);
		} finally {

			// 자원 반납 순서 주의
			try {
				if (br != null) {
					br.close();
				} // if end
			} catch (Exception e) {
			} // try end

			try {
				if (br != null) {
					br.close();
				} // if end
			} catch (Exception e) {
			} // try end

		} //if ~ finally end

	}// main end
}// class end