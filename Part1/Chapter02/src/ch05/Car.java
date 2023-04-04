package ch05;

public class Car {
	
	// 필드가 물체의 상태라면, 물체의 행동에 해당하는게 메소드다. 
	// car에 이름과 번호가 있기도 하지만, car는 앞으로 전진할수도 있고 후진하는 행동도 할 수 있다.
	// 메소드는 입력값이 있고, 그 입력값을 받아서 무언가 한 다음 결과를 도출해 내는 수학의 함수와 비슷한 개념이다.
	// 이때 입력값을 매개변수라고 하고,결과값을 리턴값이라고 합니다.
	// 메소드란 클래스가 가지고 있는 기능이다. 클래스 안에 선언됩니다.
	
	String name;
	int number;
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	// 매개변수도 없고 리턴하는 것도 없는 형태의 메소드
	public void showInfo() {
		System.out.println(this + "의 이름은 " + name + "이고 " + "번호는 " + number + "입니다");
	}
	
	// 정수를 받아들인 후, 리턴하지 않는 메소드
	public void showNumberInfo(int number) {
		System.out.println("차량의 번호 입니다. " + number);
	}
	
	// 아무것도 받아들이지 않고, 정수를 반환하는 메소드
	public int showNumber() {
		return this.number;
	}
	
	// 정수를 2개 매개변수로 받고, 아무것도 반환하지 않는 메소드
	public void plusNumber(int num1, int num2) {
		this.number = num1 + num2;
	}
	
	// 정수를 한개 받아들인 후, 정수를 반환하는 메소드
	public void changeNumber(int number) {
		this.number = number;
	}

}
