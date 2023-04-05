package ch12;

public class Duck extends Bird {
	
	// 추상 클래스를 상속받은 클래스는 추상 클래스가 갖고 있는 추상 메소드를 반드시 구현해야 한다.
	// 추상 클래스를 상속받고, 추상 클래스가 갖고 있는 추상 메소드를 구현하지 않으면 해당 클래스도 추상 클래스가 된다.

	@Override
	public void sing() {
		System.out.println("오리가 꽥꽥 웁니다.");
	}
	
}
