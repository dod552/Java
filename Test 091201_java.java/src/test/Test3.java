package test;

public class Test3 {

	public static void main(String[] args) {
//		3. 비교연산자(관계연산자) > >= < <=     == !=  결과 true/false
//		두 항은 형이 일치 => 연산 수행
		
		char ch = 'A';
		ch = 65;
		System.out.println(ch);
		System.out.println(ch == 'A'); // true
		System.out.println(ch == 65); // true
		
//		3 == 3.0 => int == double => int형이  double형 변경
		System.out.println(3 == 3.0);//true
		
//		주의!!!!
//		0.1 == 0.1f  double == float 비교 
//		=> float형이  double형 변경
//		=> 근사치 표현 0.1f => 0.1000004456
//		=> 0.1 == 0.1000004456  //false
		System.out.println(0.1 == 0.1f); //false
		System.out.println((float)0.1 == 0.1f); //true
		
		int age = 25;
		System.out.println("age >= 20 : " + (age >= 20));
		

	}

}
