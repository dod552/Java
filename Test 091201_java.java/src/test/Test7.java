package test;

public class Test7 {

	public static void main(String[] args) {
//		흐름 제어문
//		1) 조건문 (if, switch case)
//		switch case : if문 선택하는 경우가 많아서 복잡 => 간단 구현
//		=> if달리 조건식 없이 => 정수값, 문자열 결과값 비교(관계연산자 없음)
//		=> 내포 되어있는 관계연산자  ==
//		=> break; switch구문 종료, 빠져나옴
		
//		switch (변수 또는 계산식) {
//		case 변수에 들어갈수 있는 값: 실행문; 	break;
//		case 변수에 들어갈수 있는 값: 실행문; 	break;
//		default: 실행문; 	break;
//		}
		
//		1 월, 2 화, 3수, 4목, 5금, 6토, 7일 => 조건 == 여러번 사용
		int num = 3;
		switch(num) {
		case 1: System.out.println("월"); break;
		case 2: System.out.println("화"); break;
		case 3: System.out.println("수"); break;
		case 4: System.out.println("목"); break;
		case 5: System.out.println("금"); break;
		case 6: System.out.println("토"); break;
		case 7: System.out.println("일"); break;
		default: System.out.println("나머지 : 요일아님");
		}
		
//		문자형 변수 ch 선언 초기값 저장 
//		switch구문 이용 => ch 변수 'K' 같으면 "KOREA" 출력
//		                        'U' 같으면 "USA" 출력
//		                        'C' 같으면 "CANADA" 출력
//		                        default 생략 가능
		char ch = 'D';
		switch (ch) {
		case 'K':System.out.println("KOREA");	break;
		case 'U':System.out.println("USA");	break;
		case 'C':System.out.println("CANADA");	break;
		}
		

	}

}
