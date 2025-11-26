package test;

public class Test2 {

	public static void main(String[] args) {
//		1. 기본 자료형
//		2) 실수형 : 소수점 있는 수
//	       => float(4byte, 32bit), double(기본,대표,8byte,64bit)
//		p54
//		=> 부동 소수점 방식 : 0.1 => 가수 1.0 * 밑수 10 지수 -1 승
//		=> float 부호 1비트, 지수(승), 8비트, 가수 23비트 => 32비트(4바이트)
//		=> double 부호 1비트, 지수(승), 11비트, 가수 52비트 => 64비트(4바이트)
		
		double dnum = 3.14; //double 변수 = double형 값
		System.out.println(dnum);
		System.out.println("최소값" + Double.MIN_VALUE);
		System.out.println("최대값" + Double.MAX_VALUE);
		
//		float fnum = 3.14; //  float 변수 = double형 값 => 에러발생
//		기본 double형 숫자 => 숫자에 표시 F,f(float형 숫자)
		float fnum = 3.14f; //  float 변수 = float형 값
		System.out.println(fnum);
		System.out.println("최소값" + Float.MIN_VALUE);
		System.out.println("최대값" + Float.MAX_VALUE);
		
	}

}
