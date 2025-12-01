package test;

public class Test2 {

	public static void main(String[] args) {
//		6. 대입연산자(할당연산자)  = , += , -=, *=, /=, %= ,...
//		확장(복합) 대입연산자 += , -=, *=, /=, %=
		int a = 10;
//		a = 1;
//		System.out.println(a);
		a = a + 1;
		System.out.println(a);//11
		a += 1;
		System.out.println(a);//12
		a++;
		System.out.println(a);//13
		
//		확장(복합) 대입연산자 : 자동 형변환 일어나지 않음
		byte b1 = 10;
		byte b2 = 20;
		b1 = (byte)(b1 + b2); // byte연산 int형으로 형변환 연산
		System.out.println("b1 = " + b1);
		
		b1 = 10;
		b2 = 20;
//		b1 = b1 + b2;
		b1 += b2;
		System.out.println("b1 = " + b1);
		
		char ch = 'A';
		ch = (char)(ch + 3);
		System.out.println("ch = " + ch);
		
		ch = 'A';
		ch += 3;
		System.out.println("ch = " + ch);

	}

}
