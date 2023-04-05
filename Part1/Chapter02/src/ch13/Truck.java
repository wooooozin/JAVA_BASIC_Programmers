package ch13;

public class Truck extends Car {
	
	
	public Truck(){
//		super(); 자동으로 호
		// 클래스는 기본 생성자가 없는 경우도 존재한다.
		// 부모가 기본생성자가 없기 때문에 컴파일 오류가 발생하게 되는 것이다.
		// 이런 문제를 해결하려면 자식 클래스의 생성자에서 직접 부모의 생성자를 호출해야 합니다.

		super("소방차");
        System.out.println("Truck의 기본생성자입니다.");
    }
}
