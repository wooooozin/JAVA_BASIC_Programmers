package ch02;

public class ConstantTest {

	public static void main(String[] args) {
		
		// 상수(常數)란 수식에서 변하지 않는 값을 의미한다.
		// 상수는 대문자의 명명규칙을 사용, 여러 단어로 구성된 이름의 경우 단어 사이에 '_'을 써서 구분함.
		// 값이 변경되는 것을 원치 않을 때, 값만 봤을때 무엇을 의미하는지 쉽게 파악할 수 없는 값에도 값 자체를 사용하기 보다는 상수를 사용

		
		final int NUM_MAX = 12345;
		final double PI = 3.14;
		double circleArea = 3 * 3 * PI;
		
		final int OIL_PRICE = 1340;
		int totalPrice = 50 * OIL_PRICE;
		
		System.out.println(totalPrice);
		System.out.println(NUM_MAX);

	}

}
