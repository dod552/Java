package test;

public class Test6 {

	public static void main(String[] args) {
//		흐름 제어문
//		1) 조건문 (if, switch case)
//		2) 반복문 (for, while, do while)
		
//		조건문 if : 조건에 따라 문장(명령)을 선택
//		조건 결과 => boolean 형 true/false (관계연산자, 논리연산자)
		
//		삼항연산자 => 조건 ? 참값 : 거짓값
		
//		if(조건) {
//			참, 실행문
//		}else {
//			거짓, 실행문
//		}
		
//		나이가 8살 이상(크거나 같으면)이면 "학교에 다닙니다"
//		그렇지 않으면 "학교에 다니지 않습니다"
		int age = 5;
		String s = "";
		if(age >= 8) {
			System.out.println("나이 : " + age);
			System.out.println("학교에 다닙니다");
			s = "학교에 다닙니다";
		}else {
			//나머지 age < 8
			System.out.println("나이 : " + age);
			System.out.println("학교에 다니지 않습니다");
			s = "학교에 다니지 않습니다";
		}
		System.out.println(s);
		
//		정수형 변수 num , 초기값 9
		int num = 8;
//		홀수 : num을 2로 나누어서 나머지가 1이면 => "홀수" 출력
//		짝수 : num을 2로 나누어서 나머지가 0이면 => "짝수" 출력(2의 배수)
		if(num % 2 == 1) {
			System.out.println("홀수");
		}else {
			// num % 2 == 0
			System.out.println("짝수, 2의 배수");
		}
		
//		num 3의 배수 이면서 동시에 5의 배수 => "3, 5의 배수" 출력
//		                          아니면 => "3, 5의 배수 아님"
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.println("3, 5의 배수");
		}else {
			System.out.println("3, 5의 배수 아님");
		}
		
//		age 변수 5세 미만 이거나 65세 이상인 경우 => "무료입장"  출력
//		                              아니면 => "입장료 1000원"  출력
		age = 3;
		if(age < 5 ||  age >= 65) {
			System.out.println("무료입장");
		}else {
			System.out.println("입장료 1000원");
		}
		
//		======================================
//		다중 if (else if 구문)
//		if(조건1) {
//			조건1 참 
//		}else if(조건2){
//			조건1 거짓, 조건2 참
//		}else {
//			조건1 거짓, 조건2 거짓
//		}
	
//		num = -5;
//		num 변수 0보다 작으면 "음수"
//		             아니면 (음수 아님) num 0보다 크면 "양수", 나머지 "영"
		num = 0;
		if(num < 0) {
			System.out.println("음수");
		}else if(num > 0){
			System.out.println("양수");
		}else {
			System.out.println("영");
		}
		// if문 안에 if문
		if(num < 0) {
			System.out.println("음수");
		}else {
			if(num > 0) {
				System.out.println("양수");
			}else {
				System.out.println("영");
			}
		}
		

	}//main

}//class
