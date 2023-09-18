package oop0915.Test02_File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Test06_sungjuk {

	public static void main(String[] args) {

//			 성적 프로그램

//			 성적 입력자료 sungjuk.txt를 가져와서, 성적 결과 파일 완성하기 (result.txt)

//			1) 입력 데이터 파일 : sungjuk.txt

//			2) 결과 파일 : result.txt

//        -------------------------------------------------------
//        이름     국어   영어  수학   평균  등수   결과
//        -------------------------------------------------------                       
//        라일락   100   100  100  100   1    합격 ********** 장학생
//        진달래     50    55   60    55   4    불합격 *****
//        개나리     95    95   35    75   3    재시험 *******
//        무궁화     80    85   90    85   2    합격 ****
//		  홍길동     60    40   30    43   5    불합격 ****
//        ------------------------------------------------------

		String inName = "D:/java202307/workspace/basic01_java/src/oop0915/Test02_File/sungjuk.txt";
		String outName = "D:/java202307/workspace/basic01_java/src/oop0915/Test02_File/result.txt";

		FileReader fr = null; // 파일을 2바이트 character으로 한글자씩 읽는기능
		BufferedReader br = null; // 엔터단위로 끊어서 읽기

		FileWriter fw = null; // 글 출력
		PrintWriter out = null; // FileWriter를 상속받아 출력

		try {
			// 1)단계 : 데이터 저장변수 선언
			String[] name = new String[5];
			int[] kor = new int[5];
			int[] eng = new int[5];
			int[] mat = new int[5];
			int[] aver = new int[5];
			int[] rank = { 1, 1, 1, 1, 1 };

			int size = name.length; // 5
			int i = 0;

			// 2)단계 : 데이터 입력파일 (sungjuk.txt) 가져와서 내 읽기
			fr = new FileReader(inName); // sungjuk.txt 가져오기
			br = new BufferedReader(fr); // 엔터를 기준으로 끊어서 읽어오기 위해 BufferedReader에 옮겨닮기
			String line = null;

			while (true) {
				line = br.readLine(); // "무궁화,95,90,100"
				if (line == null) {
					break;
				} // if end
				System.out.println(line);

				// , 를 기준으로 문자열 분리한 후 1)단계에서 선언한 변수에 저장하기

				String[] word = line.split(",");
				name[i] = word[0].trim();
				kor[i] = Integer.parseInt(word[1].trim());
				eng[i] = Integer.parseInt(word[2].trim());
				mat[i] = Integer.parseInt(word[3].trim());
				i++;
			} // while end
//
			// 3)단계 : 평균구하기
			for (i = 0; i < size; i++) {
				aver[i] = (kor[i] + eng[i] + mat[i] / 3);
			} // for end

			// 4)단계 : 등수구하기 (평균을 기준으로)
			for (int a = 0; a < size; a++) {
				for (int b = 0; b < size; b++) {
					if (aver[a] < aver[b])
						rank[a] = rank[a] + 1; // rank[a]++
				} // for end
			} // for end

			// 5)단계 : result.txt 결과 출력하기
			fw = new FileWriter(outName, false);
			out = new PrintWriter(fw, true);

			out.println("성/적/결/과");
			out.println("--------------------------------");
			out.println("이름	국어	영어	수학	평균	등수	결과");
			out.println("--------------------------------");

			// out.printf()

			// 6)단계 : 5명의 데이터 출력하기
			for (i = 0; i < size; i++) {
				out.printf("%-6s %5d %5d %5d %5d %5d", name[i], kor[i], eng[i], mat[i], aver[i], rank[i]);

				if (aver[i] >= 70) {
					if (kor[i] < 40 || eng[i] < 40 || mat[i] < 40) {
						out.printf("%-5s", "재시험");  //5칸 내에서 왼쪽 정렬
					} else {
						out.printf("%-5s", "합격");
					} // if end
				} else {
					out.printf("%-5s", "불합격");
				} // if end

				for (int star = 0; star < aver[i] / 10; star++) {
					out.printf("*");
				} // if end

				if (aver[i] >= 95)
					out.printf("%-12s", "장학생"); // 10칸내에서 오른쪽 정렬

				out.println();
			} // for end
			System.out.println("result.txt 성적프로그램이 완성되었습니다");

		} catch (Exception e) {
			System.out.println("성적 프로그램 읽고, 쓰기 실패:" + e);
		} finally {

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

		} // try ~ catch end

	}// main end
}// class end
