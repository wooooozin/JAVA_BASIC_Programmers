package ch04;

public class UserExceptionTest {

	public static void main(String[] args) {
		
		BizService service = new BizService();
		service.bizMethod(5);
		try {
			service.bizMethod(-1);

		} catch (BizException e) {
			e.printStackTrace();
		}

	}

}
