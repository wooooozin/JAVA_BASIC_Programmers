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
	
	// 오버로딩 - 매개변수의 유형과 개수가 다르게 하여 같은 이름의 메소드를 여러 개 가질 수 있게하는 기술
	// 메소드 오버로딩은 매개변수 부분이 달라야 한다.
	public String showInfo(String name) {
		return this.name;
	}
	
	public String showInfo(String name, int number) {
		return this.name + ", " + number;
	}
	
	public void showInfo() {
		System.out.println(this.name + "자동차 입니다.");
	}
}
