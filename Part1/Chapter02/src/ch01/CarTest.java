package ch01;

public class CarTest {

	public static void main(String[] args) {
		
		// 자바는 객체를 만들기 위해 반드시 클래스를 먼저 만들어야 한다. 클래스는 객체를 만들기 위한 일종의 틀이다.
		
		// Car객체 생성하기 (자동차 만들기)
		// new 연산자는 new연산자 뒤에 나오는 생성자를 이용하여 메모리에 객체를 만들라는 명령.
		// 메모리에 만들어진 객체를 인스턴스(instance)라고도 한다.
		// 이렇게 만들어진 객체를 참조하는 변수가 c1 , c2 이다.
		// 위의 코드가 실행되면 Car라는 객체가 2개가 만들어지고 각각의 객체를 참조하는 c1과 c2변수가 선언됩니다.

		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.name = "소나타";
		c2.name = "아반떼";
		
		System.out.println(c1.name);
		System.out.println(c2.name);

	}

}
