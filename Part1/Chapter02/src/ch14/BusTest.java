package ch14;

public class BusTest {

	public static void main(String[] args) {
		
		Car car = new Bus(); // Bus객체를 참조
		car.run();
		
		// ppangppang()메소드를 호출하고 싶다면 Bus타입의 참조변수로 참조해야 한다.
		// 객체들 끼리도 형변환이 가능하다. 단 상속관계에 있었을 때만 가능하다.
		// 부모타입으로 자식타입의 객체를 참조할 때는 묵시적으로 형변환이 일어난다.

//		car.ppangppang();
		
		Bus bus = (Bus)car; // 부모 타입을 자식 타입으로 형변환
		bus.ppangppang();
		
	}

}
