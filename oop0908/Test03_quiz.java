package oop0908;

import java.util.StringTokenizer;

public class Test03_quiz {

	public static void main(String[] args) {

		// String 관련 연습 문제

		// 문1) 이메일 주소에 @문자 있으면
		// @글자 기준으로 문자열을 분리해서 출력하고
		// @문자 없다면 "이메일주소 틀림" 메세지를 출력하시오
		/*
		 * 출력결과 webmaster itwill.co.kr
		 */
		String email = new String("webmastre@itwill.co.kr");

		if (email.indexOf("@") == -1) {
			System.out.println("이메일 주소 틀립!!");
		} else {
			System.out.println("이메일 주소 맞음~~");

			int pos = email.indexOf("@");
			System.out.println(pos);
			String id = email.substring(0, pos); // 0~9번까지
			String server = email.substring(pos + 1);// @+1 부터 문자열 끝까지

			System.out.println(id);
			System.out.println(server);

		} // if end

//		String path = new String("d:/frontend/images/sky2023.09.08.ppt");

		// 문2) 이미지 파일만 첨부 ( .png .jpg .gif )
		/*
		 * 출력결과 파일명 : sky2023.09.08 확장명 : jpg
		 */

		String path = new String("d:/frontend/images/sky2023.09.08.jpg");
		StringTokenizer st = new StringTokenizer(path, "/"); // defult값이 공백
		while (st.hasMoreElements()) { // 토큰할 문자가 있는지?

			System.out.println(st.nextToken()); // 토큰한 문자열 가져오기

		} // while end
		
		
//		  // System.out.println(path.lastIndexOf("/")); //
//		  System.out.println(path.lastIndexOf(".")); int result =
//		  path.lastIndexOf("/"); // System.out.println(result); //
//		  System.out.println(path.length()); //
//		  System.out.println(path.length()-result);
//		 
		  //path 에서 마지막 "/" 기호의 순서값
		int lastSlash=path.lastIndexOf("/");
		System.out.println(lastSlash); //18
		 
		String file=path.substring(lastSlash+1);
		System.out.println("전체 파일명:: " + file);
		 
		int lastDot= file.lastIndexOf(".");
		System.out.println(lastDot);
		
		//파일명
		String filename= file.substring(0,lastDot);
		System.out.println("파일명 : " + filename);
		
		//확장명
		String ext=file.substring(lastDot+1);
		System.out.println("확장명 : " + ext);
	
		//확장명을 전부 소문자로 변환
		ext = ext.toLowerCase();
		if(ext.equals("png") || ext.equals("jpg") || ext.equals("git")) {
			System.out.println("파일이 전송되었습니다~~");
		}else {
			System.out.println("이미지 파일만 가능합니다!!");
		}//if end
			
	}// main
}// class
