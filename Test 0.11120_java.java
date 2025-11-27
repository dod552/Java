package test;

public class Test 0.11120_java {

	public static void main(String[] args) {
		// 변수 : 변하는 수, 기억장소에 형을 지정, 이름을 정의하고 값을 저장

		// 사칙연산
//		기억장소자료형 기억장소이름 = 값
		int a; // 변수 선언
		a = 100; // 값을 저장, 할당, 대입
		int b = 200;

		System.out.println(a + b);
		// 숫자 + 숫자 => 더하기 연산자
		System.out.println("a" + b);
		// "a" + b 문자, 숫자 연결자
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);

		// 정수값을 저장하는 기억장소 이름을 level 변수선언
		// 10 값을 저장(대입,할당)
		int level = 10;
		System.out.println("level 변수 = " + level);
		level = 200;
		System.out.println("level 변수 = " + level);
//		level = "안녕"; //에러발생
//		String level = "안녕"; // 지역함수안에 동일 변수 사용 못함 
		
//		ctrl shift f => 정렬

		System.out.print("출력");
		// ln => \n => new line => 다음줄 내려서 출력
		System.out.println("합니다");
		System.out.println("안녕");
		System.out.println("하세요");//문자열
		
		System.out.println(100); //정수형
		System.out.println(3.4); //실수형
		System.out.println('A'); //문자형
		System.out.println(true); //불린형 boolean
		
//		a + b = 300 => 출력
		// a + b = 100200
		System.out.println("a + b = " + a + b);
		// a + b = 300
		System.out.println("a + b = " + (a + b));
		// a - b = -100
		System.out.println("a - b = " + (a - b));
		// a * b = 20000
		System.out.println("a * b = " + a * b);
		// a / b = 0
		System.out.println("a / b = " + a / b);
		
//		100 + 200 = 300
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + a * b);
		System.out.println(a + " / " + b + " = " + a / b);
		
		System.out.printf("%d + %d = %d\n" , a , b, (a + b) );
		System.out.printf("%d - %d = %d\n" , a , b, (a - b) );
		System.out.printf("%d * %d = %d\n" , a , b, (a * b) );
		System.out.printf("%d / %d = %d\n" , a , b, (a / b) );
		
//		나이 : 20 출력
//		20 => 변하는 수로 정의 초기값 20 저장, 기억장소 이름 age, 정수형 지정
//		변수 선언 (정수형 지정, 기억장소 이름지정)하고 초기값 할당
		
		int age = 20;
		System.out.println("나이 : " + age);
		System.out.println("age = " + age);
		
//		p45 변수 이름 정하는 방법 => 규칙적용
//		1) 영문자(대문자, 소문자), 숫자, 특수문자($, _) 사용
//		예) Abc, count100, won$, g_level
//		int a; // 이름 중복
		int A = 10;
		int Abc = 10;
		int count100 = 10;
		int won$ = 10;
		int g_level = 10;
//		2) 시작변수명 중에 숫자 사용 할 수 없음, $, _ 외 특수문자 사용 못함
//		예) 1a(사용못함), $wonm, _master
//		int 1a = 10; //에러발생
		int $won = 10;
		int _master = 10;
//		int !abc = 10; //에러발생
//		int aaa@ = 10; //에러발생
		
//		3) 자바문법에서 사용 중인 예약어 사용 할 수 없음
//		예) class, for, if, int, while
//		int class = 10; //에러발생
//		int for = 10; //에러발생
//		int int = 10; //에러발생
		
//		4) 한글 사용 가능 => 영문권장 
		int 변수 = 10;
//		5) 길이 제한 없음
//		6) member_name, memberName : 카멜 표기법
//		여러 단어를 조합해서 표기, 중간에 다른 뜻의 단어가 등장할때 첫 글자 대문자 표기
		
//		적절하지 않은 변수 이름 ? 1, 3
//		1) 2018 2)_hello 3) int 4) MAX_COUNT 5) numberOfBaby
//		int 2018 = 10;
		int _hello = 10;
//		int int = 10;
		int MAX_COUNT = 10;
		int numberOfBaby = 10;
		
//		변수 정의 해서 12 값을 저장
//		출력 => 바구니에 저장된 사과는 12개 입니다
		int cnt = 12;
		System.out.println("바구니에 저장된 사과는 " + cnt + "개 입니다");
		
	}

}

