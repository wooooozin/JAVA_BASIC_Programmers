package ch05;

public class MethodTest {

	public static void main(String[] args) {
		
//		메소드를 사용하기 위해서는 메소드가 정의된 클래스인 MyClass 가 생성되어야 한다
//		객체를 생성할 때는 new 연산자를 이용한다.
//		메소드 사용할때는 생성된 클래스를 참조하는 레퍼런스변수.메소드명() 으로 사용할 수 있다.
		
		Car car1 = new Car("MYCAR", 1001);
		
		car1.plusNumber(1001, 1002);
		car1.showInfo();
		car1.showNumber();
		car1.changeNumber(1002);
		car1.showInfo();

	}

}
