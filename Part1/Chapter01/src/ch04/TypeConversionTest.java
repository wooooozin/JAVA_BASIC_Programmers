package ch04;

public class TypeConversionTest {

	public static void main(String[] args) {
		
		// byte < short, char < int < long < float < double 
		
		// 기본형 타입(형)변환
		// 묵시적 형변환 - 크기가 작은 타입을 크기가 더 큰 타입으로 바꿀 때에는 묵시적으로 형을 바꾸어 준다.
		int x = 50000;
		long y = x; // long 타입이 더 큰 타입이라 가능
		
		// 명시적 형변환 - 크기가 더 큰 타입을 작은 타입으로 바꿀 때에는 명시적으로 변환 해주어야 한다.
		long x1 = 50000L;
//		int y = x1; - error
		int y1 = (int)x1; //  강제 형변환
		System.out.println(x1);
		System.out.println(y1);
		
		// 	오버플로우
		long x2 = 5999999999L;
		int y2 = (int)x2;
		System.out.println(x2); // 5999999999
		System.out.println(y2); // 1705032703 옳지 않음, int 범위값을 넘어서 오버플로우 발생
		
		

	}

}
