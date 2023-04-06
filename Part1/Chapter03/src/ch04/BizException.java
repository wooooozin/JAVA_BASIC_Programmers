package ch04;

public class BizException extends RuntimeException {
	// RuntimeException 클래스를 상속 받아 정의한 unChecked Exception
	// 예외 처리하지 않아도 컴파일 시에는 오류를 발생시키지 않는다.

	public BizException(String msg) {
		super(msg);
	}
	
	public BizException(Exception ex) {
		super(ex);
	}
}
