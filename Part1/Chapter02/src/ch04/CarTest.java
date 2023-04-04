package ch04;

public class CarTest {

	public static void main(String[] args) {
		
		//Car라는 인스턴스가 메모리에 2개 만들어 진다. 객체별로 name과 number라는 속성을 가진다.
		Car car1 = new Car();
		Car car2 = new Car();
		
		
		// 참조 변수 다음에 나오는 점(dot)은 참조변수가 참조하는 객체가 가지고 있는 것을 사용할 때 사용
		car1.name = "트랙스";
		car1.number = 1000;
		
		car2.name = "소나타";
		car2.number = 1001;
		
		System.out.println(car1.name + "," + car1.number);
		System.out.println(car2.name + "," + car2.number);
	}

}
