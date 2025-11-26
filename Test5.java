package test;

public class Test5 {

	public static void main(String[] args) {
//		변수 = 변수에 저장된 값(대입연산자, 할당연산자)
//		변수 = 계산식(변수를 이용한 계산식을 먼저 계산하고 대입)
		
//		계산식 연산과정에서 자동 형변환
//		연산을 수행 할때 데이터 타입을 일치 시킨 후 => 연산 수행(자동으로 형변환)
//		1. int 타입보다 작은 타입끼리 연산  => int 자동으로 변환 연산
//		2. int 타입보다 큰 타입끼리 연산 => 큰 타입 자동으로 변환 연산
		
		byte b1 = 10, b2 = 20, b3;
		System.out.println(b1 + b2); //30
//		b1 + b2 => byte + byte => int => 자동으로 int 형변환
		b3 = (byte)(b1 + b2);
		System.out.println(b3);//30
		int c = b1 + b2;
		
		char ch = 'A'; //65
//		ch + 3 => char + int => int => int 자동으로 형변환
		System.out.println(ch + 3);//68
		
		// 형변환 없이 => 연결자  => 참조형 + 기본형 => 형변환 없음
		System.out.println("A" + 3);  // 연결자   A3
		
		char ch2 = (char)(ch + 3);
		System.out.println(ch2);//D
		
//		int + long => long
		int i1 = 100;
		long l1 = 200L;
		System.out.println(i1 + l1);//300
		int i2 = (int)(i1 + l1);
		System.out.println(i2);//300
		
//		주의!!!!
//		float + double => double + double => double
		float f2 = 0.1f;
		double d2 = 0.1;
//		=>근사치 표현 => 부족한 자릿수를 채울때 근사치 표현에 의해 이상값 추가
//		=> 잘못된 결과 => float -> double 형변환 할때 발생 
		System.out.println(f2 + d2);//0.20000000149011612
//		=> float + (float)double => float
		System.out.println(f2 + (float)d2);//0.2
		
//		===========================
//		리터럴 끼리 연산 => 형변환 발생 하지 않는다
		byte b5 = 100 + 20;
		System.out.println(b5);//120
//		byte -128 ~ 127
		byte b6 = (byte)(100 + 30);
		System.out.println(b6); //-126 이상한 값 (overflow)
		
		double d5 = 1.2;
		float f5 = 0.9F;
//		(int)(double + float)
		int i5 = (int)(d5 + f5);
		System.out.println(i5); //2
		
//		int = (int)double + (int)float
		int i6 = (int)d5 + (int)f5;
		System.out.println(i6); //1
		
//		1 / 2 연산 => int / int => 결과 int
		int i7 = 1;
		int i8 = 2;
		System.out.println(i7 / i8);//0
		System.out.println((float)(i7 / i8));//0.0
		System.out.println(i7 / (float)i8);//0.5
		System.out.println((float)i7 / (float)i8);//0.5

	}

}
