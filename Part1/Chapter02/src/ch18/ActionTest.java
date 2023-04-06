package ch18;

public class ActionTest {

	public static void main(String[] args) {
		
//		Action action = new MyAction();
//		action.exec();

		// 익명 중첩 클래스는 익명 클래스라고 보통 말하며, 내부 클래스이기도 하다.
		// 당 생성자 이름에 해당하는 클래스를 상속받는 이름없는 객체를 만든다는 것을 뜻한다.
		// 익명클래스를 만드는 이유는 Action을 상속받는 클래스를 만들 필요가 없을 경우이다.
		// Action을 상속받는 클래스가 해당 클래스에서만 사용되고 다른 클래스에서는 사용되지 않는 경우이다.

		Action action = new Action() {
			
			@Override
			public void exec() {
				System.out.println("exec1");
			}
		};
		
		action.exec();
	}

}
