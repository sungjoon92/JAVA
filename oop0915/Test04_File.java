package oop0915;

import java.io.File;
import java.lang.reflect.Field;
import java.net.FileNameMap;

public class Test04_File {

	public static void main(String[] args) {
		// File 클래스
		// -> 파일과 관련된 정보를 알 수 있다
		// -> 파일명, 파일크기, 확장명, 파일타입~~

		try {
			// 예외 발생이 예상되는 코드 작성

			// 경로명 + 파일명

			// 경로명으로 \기호를 사용하려면 \\기호를 2번씩 사용
			// String pathName ="D:\\java202307\\20230901_java";

			// 경로명으로 / 기호도 사용가능
			String pathName = "D:/SQLD_34_기출문제.pdf";

			// File클래스에 파일 담기
			File file = new File(pathName);

			if (file.exists()) {
				System.out.println("파일 있어요~~");
				long filesize = file.length();
				System.out.println("파일크기 : " + filesize);
				System.out.println("파일크기 : " + filesize / 1024 + "KB");
				System.out.println("파일크기 : " + filesize / 1024 / 1024 + "MB");

				String fileneme = file.getName();
				System.out.println("파일명:" + fileneme);

				// 마지막 ,찾기
				int lastdot = fileneme.lastIndexOf(".");
				System.out.println(lastdot);
				String name = fileneme.substring(0, lastdot);
				System.out.println(name);
				String ext = fileneme.substring(lastdot);
				System.out.println("파일명:" + name);
				System.out.println("파일명:" + ext);

//				if(file.delete()) {
//					System.out.println(fileneme+"파일이 삭제 되었습니다");
//				}else {
//					System.out.println(fileneme+"파일이 삭제 되었습니다");
//				}//if end

			} else {
				System.out.println("파일 없어요~~");
			} // if end

		} catch (Exception e) {
			// 예외가 발생되면 처리할 코드를 작성
			e.printStackTrace();
		} // try end

		System.out.println("END");

	}// main() end
}// class end