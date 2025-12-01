package test;

public class Test4 {

	public static void main(String[] args) {
//		4. 논리연산자 &&      || => 결과 true/false
		
//		정수형 변수 num 정의, 초기값 저장
		
//		4 < num < 7  => 관계연산 논리연산자 관계연산자
		int num = 3;
		boolean b = num > 4 && num < 7;
		System.out.println(num > 4 && num < 7);
		System.out.println(b);
		
//		===========================
//		num 4보다 작거나 같은 경우
//		num 7보다 크거나 같은 경우
//		두 경우 중 하나라도 만족하면 => true
//				모두 만족하지 않으면 => false
		System.out.println(num <= 4  ||  num >= 7);
		
//		===========================
//		! not => !false : true, !true : false
		boolean a = true;
		System.out.println(!a);//false

	}

}
