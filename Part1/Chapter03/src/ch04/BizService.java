package ch04;

public class BizService {

	public void bizMethod(int i) throws BizException {
		System.out.println("bizMethod start!");
		
		if (i < 0) {
			throw new BizException("매개변수 i는 0보다 작을 수 없습니다.");
		}
		
		System.out.println("bizMethod end!");
	}
	
}
