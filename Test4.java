package test;

public class Test4 {

	public static void main(String[] args) {
		// p62 형변환
		// 기본자료형 => 형변환, 타입변환
//		=> 자바 기본 데이터 타입을 변환
//		=> boolean타입 제외한 기본 데이터 타입 간의 변환
//		=> 정수와 실수 연산 => 형이 틀리면 연산 수행 안됨
//		=> 하나의 자료형으로 통일한 후에 연산 동작
		
//		1. 묵시적으로 형변환(자동으로 형변환)
//		=> 작은 데이터 타입 -> 큰 데이터 타입으로 변환
//		=> 형변환을 명시적으로 하지 않음
//		=> 실수형 변수 = 정수형 값 => 자동으로 형변환
//		=> 실수 = 정수, 큰 데이터 타입 변수 = 작은 데이터 타입 변수
//		=> byte -> short(char) -> int -> long -> float -> double
		
		int n = 10;
		System.out.println(n); // 10
		double d = n;
		System.out.println(d); // 10.0
		
		byte a1 = 10;
		short a2 = 256;
//		a1 = a2; // byte 작은형 = short 큰형 => 에러발생
		a2 = a1; // short 큰형 = byte 작은형 => 자동으로 형변환
		System.out.println(a2);
		
//		2. 명시적으로 형변환(강제 형변환)
//		=> 큰 데이터 타입 -> 작은 데이터 타입 변환
//		=> 형변환 연산을 이용해서 강제적으로 형변환
//		=> 강제적으로 형변환시 기존 데이터 타입이 아닌 다른 데이터 타입으로 저장
//		=> 작은데이터 타입 = (작은데이터타입)큰데이터타입
		
		double d2 = 3.7;
//		정수형 = 실수형
		int n2 = (int)d2;
		System.out.println(n2);//3
		
		// 주의!!!!!
		byte b1 = 10; // -128~127
		short b2 = 256;
		b1 = (byte)b2; // 형변환이 되어도 byte 범위 넘침(범위 초과)
		// 기억장소 범위가 넘어감 => overflow
		System.out.println(b1);//0 => 에러발생
		
//		---------------------------------
		int i = 100;
		float f = i; //자동으로 형변환
		System.out.println(f);//100.0
		
//		실수형을 정수형보다 무조건 큰 타입으로 취급
		long l = 63983L;
		float f2 = l;
		System.out.println(f2);//63983.0
		
//		byte(1), short(2) <-> char(2) 형변환
		char ch = 65;
		short sh = 65;
		byte by = 65;
//		char = byte, 2 = 1, 자동으로 형변환 ?
//		byte 타입의 음수 범위가 char타입 보다 크므로 => 자동형변환 불가능
		ch = (char)by;
		System.out.println(ch);// A
//		short 타입의 음수 범위가 char타입 보다 크므로 => 자동형변환 불가능
		ch  = (char)sh;
		System.out.println(ch);// A
		
		by = (byte)ch;
		System.out.println(by);// 65
		sh = (short)ch;
		System.out.println(sh);// 65
		
//		---------------------------
//		int = char => 자동으로 형변환
		int i1 =  ch;
		System.out.println(i1);// 65
		
//		char = int => 명시적으로 형변환
		ch = (char)i1;
		System.out.println(ch);// A
		
//		long = int => 자동으로 형변환
		int i2 = 1234;
		long i22 = i2;
		System.out.println(i22);//1234
		
//		int = long => 명시적 형변환
		i2 = (int)i22;
		System.out.println(i2);//1234
		
//		주의!!!!!
//		범위가 넘어가서 오버플로 overflow 발생 => 이상한 결과 나옴
		long l3 = 10000000000L;
		int i3 = (int)l3; //명시적 형변환
		System.out.println(i3);// 1410065408 => 이상한 결과
		
//		주의!!!!!
//		double = float 자동으로 형변환
		float f5 = 1.1f;
		double d5  = f5; 
//		근사치 표현에 의해 정상적인 데이터가 아닌 데이터 전달
//		=> 부족한 자릿수를 채울때 근사치 표현에 의해서 이상한 값 추가
		System.out.println(d5);//1.100000023841858 => 주의
		
		d5 = 1.1;
		System.out.println(d5);//1.1
		f5 = (float)1.1;
		System.out.println(f5);//1.1
		
//		int = double
		int i5 = 1;
		d5 = i5;
		System.out.println(d5);//1.0

	}

}
