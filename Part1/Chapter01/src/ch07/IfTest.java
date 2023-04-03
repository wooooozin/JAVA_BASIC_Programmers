package ch07;

public class IfTest {

	public static void main(String[] args) {
		
		// if 조건문 - 조건식의 연산 결과에 따라 블록 내부 문장의 실행 여부를 결정 할 수 있다.

		int x = 50;
		int y = 60;
		
		if (x < y) {
			System.out.println("true");
		} else if (x == y ) {
			System.out.println("equal");
		} else {
			System.out.println("false");
		}
		
		System.out.println("=============");

		// 논리연산자
		boolean a = true;
		boolean b = false;
		boolean c = true;
		
		System.out.println(a && b);
		System.out.println(a && c);
		System.out.println(a || b);
		System.out.println(a ^ b); // 둘의값이 다르면 true , 같으면 false
		System.out.println(a ^ c); // false;
		
		// 삼항 연산자
		int value = (x < y) ? 1 : 0;
		System.out.println(value);

	}

}
