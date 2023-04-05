package ch09;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car("MyCar", 1000);
		
		System.out.println(car.name);
		System.out.println(car);
		
		car.showInfo();

	}

}
