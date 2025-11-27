package test;

public class Test 0.51120_java {

	public static void main(String[] args) {
//		1. 기본 자료형
//		4) 논리형 : 참/거짓, true/false
//	       => boolean (1byte) => 참거짓, 남여, 여부,..
//		p57
		
		boolean b = true; // 1
		System.out.println(b);
		
		boolean c = false; // 0
		System.out.println(c);
		
//		=============================
//		자료형 없이 변수 선언
//		=> 자바 10버전 부터 초기값으로 형을 지정 => 중간에 변경되지 않음
		var num = 10; //초기값 int
		System.out.println(num);
//		num = "문자열";// 형틀림, 에러발생
		
//		==============================
//		p59
//		상수와 리터럴
//		리터럴(데이터값) : 프로그램에서 사용하는 숫자값, 문자값, 논리값
		int n = 10;
		char ch = 'A'; 
		
//		=============================
//		상수(상수변수) : 항상 그대로인 수(변하지 않는 수), 대문자, final
		
//		원의 면적 => 반지름 * 반지름 * 3.14
		
//		반지름 변수선언
		int r = 10;
//		상수변수 선언 (final 변수값을 변경을 여기가 마지막)
		final double PI = 3.14159;
		System.out.println(r * r * PI);
		
		
		
		r = 100;
//		PI = 3.14159; // 중간에 값을 변경하면 에러발생
		System.out.println(r * r * PI);
		
		
		// MY_AGE 나이 상수변수 선언 => 출력
		final int MY_AGE;
		MY_AGE = 20; //초기값
//		MY_AGE = 30; //중간에 수정은 에러 발생
		System.out.println("MY_AGE = " + MY_AGE);
		
//		===========================================
		
//		특수기능을 가진 문자를 출력(\특수기능을 가진 문자)
//		=> 특수기능을 가진 문자 : "", '', \,  \n(new line), \t(tab키)
//		=> 이스케이프 문자 => \특수문자, \", \', \\, \n, \t
		
		System.out.println("\"문자열\""); // "문자열"
		System.out.println("\\문자열\\"); // \문자열\
		System.out.println("문\t자열");
		System.out.println("문\n자열");
		
//		파일경로
//		D:\workspace_java\JavaProject_251126\src\test
		System.out.println("D:\\workspace_java\\JavaProject_251126\\src\\test");
		
//		Hello다음줄
//		"Java" 탭 \Programming
		
		System.out.println("Hello\n \"Java\" \t \\Programming");
		
				

	}

}

