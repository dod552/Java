package test;

public class Test1 {

	public static void main(String[] args) {
//		p70 기본연산자
//		연산자 우선순위
//		0. ()괄호, []배열, .참조연산자
//		1. 단항연산자 + - ! ++ --  (오른쪽 -> 왼쪽 순으로 연산)
//		2. 산술연산자   * / %        + -
//		2-1.   비트연산자 <<, >>
//		3. 비교연산자(관계연산자) > >= < <=     == !=  결과 true/false
//		3-1.  비트연산자 &    비트차^    |
//		4. 논리연산자 &&      || => 결과 true/false
//		5. 삼항연산자(조건연산) 조건?참:거짓
//		6. 대입연산자(할당연산자)  = , += , -=, *=, /=, %= ,...
		
//		===================================
//		2. 산술연산자   * / %        + -
//		정수형 / 정수형 => 결과 정수형 몫, % 나머지
//		1 / 2 = 0 몫, 나머지 1
		
//		수학점수 정수형 math 초기값 90 
//		영어점수 정수형 eng 초기값 70
//		국어점수 정수형 kor 초기값 85
//		총점 정수형 total 초기값 점수를 더해서 저장
//		평균 float형 avg 초기값 총점에 과목수를 나누어서 저장
//		total , avg 출력
		int math = 90;
		int eng = 70;
		int kor = 85;
		int total = math + eng + kor;
		float avg = total / 3;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);//평균 : 81.0
		avg = total / 3.0f;
		System.out.println("평균 : " + avg);//평균 : 81.666664

	}

}
