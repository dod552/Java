package test;

public class Test5 {

	public static void main(String[] args) {
//		1. 단항연산자 + -  !(not)  ++ --  (오른쪽 -> 왼쪽 순으로 연산)
//		부호연산자
		int num = -7;
		System.out.println(-num);//7
		
		int a = 10;
		// 실행순서 => ++a 1증가,  + 연결자, 출력
		System.out.println("a = " + ++a);//11
		
		a = 10;
		// 실행순서 => + 연결자, 출력,  a++ 1증가  
		System.out.println("a = " + a++);//10
		System.out.println("a = " + a);//11
		
//		=====================================
//		5. 삼항연산자(조건연산) 변수(값의 형 지정) = 조건?참값:거짓값
		
//		1) char 형 변수 ch 정의, 초기값 저장
//		삼항연산자 이용 => 조건 대문자 ? "대문자" : "대문자 아님"
//		조건 대문자  A ~ Z =>   관계연산자 논리연산자 관계연산자
		char ch = 'a';
		String str = ch >= 'A' && ch <= 'Z'  ? "대문자" : "대문자 아님";
		System.out.println(str);
		
//		2) 성별 정수형 변수 gender 정의, 초기값 (1,2,3,4 중에 값 저장) 
		// 조건 성별 구분  => 관계연산자 논리연산자 관계연산자
//		삼항연산자 이용 => 성별 구분 1, 3 "남" / 2, 4 "여" 
		int gender = 4;
		String g = gender == 1 || gender == 3 ? "남" : "여";
		System.out.println(g);
		
		
		

	}

}
