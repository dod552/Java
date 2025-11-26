package test;

public class Test1 {

	public static void main(String[] args) {
//		1. 기본 자료형
//		p51
//		3) 문자형 : 글자 한 자 저장 => 컴퓨터 내부 정수형으로 저장
//	       => char(2byte, 16bit) => 음수없음
//		   => '글자한자' 표시 => 'A', 'b', '7'
//		   => 컴퓨터 내용 0, 1 조합 A를 표현 => 65 저장
//		   => 문자 인코딩 : 문자를 정해진 코드 값으로 변환
//		   => 아스키(ASCII) 코드 : 문자 인코딩, 
//		                        영문자, 숫자, 특수문자를 나타내는 문자세트
//		   => 아스키코드 1byte (256개) 대문자, 소문자, 숫자, 특수문자, 기호
//		   => 한글, 다른언어 문자 복잡 => 2byte
//		   => 각 언어 표준 인코딩 정의 => 유니코드(UTF-8,.)
		
		char ch1 = 'A';
		System.out.println(ch1);
//		'A' => int 형으로 변환(명시적 형변환)
		System.out.println((int)ch1); // 65
		
//		(char)형으로 자동으로 형변환
		char ch2 = 66;
		System.out.println(ch2);//B
		
		int ch3 = 67;
		System.out.println((char)ch3);//C
		
//		'A' => 65 인코딩
//		'A' <= 65 디코딩
		
//		char ch4 = "A"; // 문자열 인식 에러발생
//		char ch5 = 'aaa'; //문자열 인식 에러발생
		
//		여러개 문자를 저장 => 참조형(객체형) => 문자열(String)
//		String str = 'A';  //에러발생
		String str = "";
		String str2 = "A";
		str2 = "AAA";
		System.out.println(str2);
		
		//문자 => 음수를 넣으면 오류	발생
		int a = -65;
		System.out.println(a);
		System.out.println((char)a);//이상한값
//		char b = -66;//에러발생
		
//		p53
//		유니코드 16진수(2byte)
//		https://www.unicode.org/charts
//		Hangul Syllables 코드표
		
		char ch10 = '\uD55C'; //한  
		System.out.println(ch10);

//		유니코드 
//		자바 기본 인코딩 방식 => 2byte(UTF-16)
//		알파벳 => 1byte 메모리 낭비 => 인터넷 UTF-8(1 ~ 4btye 사용)
//		=> 메모리 낭비 적고 전송 속도 빠른 인터넷 UTF-8 사용      

	}

}
