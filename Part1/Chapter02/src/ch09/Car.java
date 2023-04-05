package ch09;

public class Car {
	
	/*
	 생성자는 리턴타입이 없다.
	 생성자를 프로그래머가 만들지 않으면 매개변수가 없는 생성자가 컴파일할 때 자동으로 만들어진다.
	 매개변수가 없는 생성자를 기본생성자라고 한다.
	 생성자를 하나라도 프로그래머가 만들었다면 기본생성자는 자동으로 만들어지지 않는다.
	 */
	
	String name;
	int number;
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
		System.out.println(this);
	}
	
	// this는 현재 객체, 자기 자신을 나타낸다.
	// 클래스 안에서 자기 자신이 가지고 있는 메소드를 사용할 때도 this.메소드명()으로 호출할 수 있다.

	public void showInfo() {
		System.out.println(this.name + "자동차 입니다.");
	}
}
