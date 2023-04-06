package ch02;

public class ExceptionTest {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		int k;
		try {
			k = divide(i, j);
			System.out.println(k);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
	
	// throws는 예외가 발생했을때 예외를 호출한 쪽에서 처리하도록 던져준다.

	public static int divide(int a, int b) throws Exception {
		return a / b;
	}

}
