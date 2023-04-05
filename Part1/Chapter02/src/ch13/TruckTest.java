package ch13;

public class TruckTest {

	public static void main(String[] args) {
		
		// class가 인스턴스화 될때 생성자가 실행되면서 객체의 초기화를 한다. 그 때 자신의 생성자만 실행이 되는것이 아니고, 부모의 생성자부터 실행된다.
		Truck truck = new Truck();

	}

}
