package test;

public class Test2 {

	public static void main(String[] args) {
//		컴퓨터 데이터 0, 1 저장 => 1bit => 1byte(8bit) => 4byte(32bit)
//		                            => 00001011 (10진수 숫자 11)
//		p47
//		1. 기본 자료형
//			1) 정수형 : 소수점 없는 수(양수, 0, 음수)
//		       => byte(1byte,8bit), short(2byte,16bit),
//		    	  int(대표,기본,4byte,32bit), long(8byte,64bit) 	   
//			2) 실수형 : 소수점 있는 수
//		       => float(4byte, 32bit), double(기본,대표,8byte,64bit)
//			3) 문자형 : 글자 한 자 저장 => 컴퓨터 내부 정수형으로 저장
//		       => char(2byte, 16bit)
//			4) 논리형 : 참/거짓, true/false
//		       => boolean (1byte)
//		2. 참조 자료형(객체형)
//		    1) 내장객체(문자열 String, System, ...)
//		    2) 사용자 객체 정의
// ---------------------------------------------------		

//		1. 기본 자료형
//		1) 정수형 : 소수점 없는 수(양수, 0, 음수)
//	       => byte(1byte,8bit), short(2byte,16bit),
//	    	  int(대표,기본,4byte,32bit), long(8byte,64bit) 	
		
		byte b = 10; // 1byte,8bit -2의 7승 ~ 2의 7승 - 1
//		b = 128; // byte 숫자 범위 넘어감, byte형 = int형 에러발생
		System.out.println(b);
		System.out.println("byte 최소값 : " + Byte.MIN_VALUE); //-128
		System.out.println("byte 최대값 : " + Byte.MAX_VALUE); //127
		
		short c = 300;// 2byte,16bit -2의 15승 ~ 2의 15승 - 1
//		c = -40000; //short 숫자 범위 넘어감, short형 = int형 에러발생
		System.out.println("short 최소값 : " + Short.MIN_VALUE); //-32768
		System.out.println("short 최대값 : " + Short.MAX_VALUE); //32767
		
		int d = 100000000;// 4byte,32bit -2의 31승 ~ 2의 31승 - 1
//		d = 100000000000;//int 숫자 범위 넘어감, int형 = long형 에러발생
		System.out.println("int 최소값 : " + Integer.MIN_VALUE); //-2147483648
		System.out.println("int 최대값 : " + Integer.MAX_VALUE); //2147483647
		
		long e = 200000;// 8byte,64bit -2의 63승 ~ 2의 63승 - 1
//		long형 = int형, 기본적으로 숫자값을 int 인식
//		=> 숫자를 long형으로 인식하게 표현 => 숫자L, 숫자l
//		d = 200L; // int형 = long형 => 에러발생 
//		d = 100000000000;//int 숫자 범위 넘어감
		e = 100000000000L; //기본 정수형 숫자를 long형으로 표시
		e = 1000; // 자동으로 기본정수형에서 long형으로 변환되면서 저장 
		System.out.println("long 최소값 : " + Long.MIN_VALUE); //-9223372036854775808
		System.out.println("long 최대값 : " + Long.MAX_VALUE); //9223372036854775807
		
		// 자료형이 다른 정수끼리 더하면 ?
		short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal + bVal); // int 형 자동으로 변경
	}

}
