package ch11;

public class AccessObject {
	
	// 접근 제한자란 클래스 내에서 멤버의 접근을 제한하는 역할을 한다.
	// public - 어떤 클래스든 접근할 수 있다는 것을 의미
	// protected - 자기 자신, 같은 패키지, 서로 다른 패키지다 하더라도 상속받은 자식 클래스에서는 접근할수 있다는 것을 의미
	// private - 자기 자신만 접근할 수 있다는 것을 의미
	// 접근제한자를 적지 않으면 default접근 지정자 - 자기자신과 같은 패키지에서만 접근할 수 있다는 것을 의미
	
	private int privateNum = 1;
	int defaultNum = 2;
	public int publicNum = 3;
	protected int protectedNum = 4;;

}
