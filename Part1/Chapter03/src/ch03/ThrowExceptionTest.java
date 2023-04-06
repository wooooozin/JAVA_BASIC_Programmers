package ch03;

public class ThrowExceptionTest {
	
	// 강제로 오류를 발생시키는 throw
	// throw는 오류를 떠넘기는 throws와 보통 같이 사용됩니다.


	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		try {
			int k = divide(i, j);
			System.out.println(k);
		} catch (IllegalArgumentException e) {
			System.out.println(e.toString() + " " + "0 NONO!");
		}

		// 실행결과
		// java.lang.IllegalArgumentException: b는 0이 되면 안됩니다.0 NONO!

	}

	
	public static int divide(int a, int b) throws IllegalArgumentException {
		
		// 0으로 나눈 결과는 0이 아니다. 0으로 반환하면 더 큰 문제가 발생할수도 있다.
		if (b == 0) {
			throw new IllegalArgumentException("b는 0이 되면 안됩니다.");
			// j가 0일 경우에 new연산자를 통하여 IllegalArgumentException 객체가 만들어 진다.
			// 즉 그 줄에서 오류가 발생했다는 것이다. 0으로 나눌수 없습니다. 라는 오류가 발생한것이다.
		}
		
		return a / b;
	}
}
