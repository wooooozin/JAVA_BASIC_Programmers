package ch01;

public class ExceptionTest {
	
	// Exception
	// 프로그램실행중 예기치 못한 사건을 예외라고 한다. 예외 상황을 미리 예측하고 처리할 수 있는데, 이렇게 하는 것을 예외 처리라고 한다.

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 5;
		int result = num1 / num2; // Java는 정수를 정수로 나눌때 0으로 나누면 안된다.0으로 나누면 오류가 발생하는 것입니다.
		// 프로그래머는 j라는 변수에 0이 들어올지도 모르는 예외 상황을 미리 예측하고 처리할 수 있다.
		
		// 오류가 발생할 예상 부분을 try라는 블록으로 감싼 후, 발생할 오류와 관련된 Exception을 catch라는 블록에서 처리한다.
		// 오류가 발생했든 안했든 무조건 실행되는 finally라는 블록을 가질 수 있다.
		// finally블록은 생략가능하다.

		System.out.println(result);
		System.out.println("종룤!");
		
		// 위 내용을 정리하면
		try {
			num1 = 10;
			num2 = 0;
			result = num1 / num2;
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다. : " + e.toString()); 
			// 0으로 나눌 수 없습니다. : java.lang.ArithmeticException: / by zero
		} finally {
			System.out.println("무조건 실행되는 finally 블럭");
		}
		
		// Exception 처리하지 않았을때는 프로그램이 강제 종료되었는데 catch라는 블록으로 Exception을 처리하니 강제종료되지 않고 잘 실행되는 것을 알 수 있다.
		// try블록에서 여러종류의 Exception이 발생한다면 catch라는 블록을 여러개 둘 수 있다.
		// Exception클래스들은 모두 Exception클래스를 상속받으므로, 
		// 예외클래스에 Exception을 두게 되면 어떤 오류가 발생하든지 간에 하나의 catch블록에서 모든 오류를 처리할 수 있다.



		
	}

}
