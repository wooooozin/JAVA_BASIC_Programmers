package ch12;

public abstract class Bird {
	
	// 추상 클래스란 구체적이지 않은 클래스를 의미한다. 독수리, 타조는 구체적인 새를 지칭하는데 새, 포유류 같은 것은 구체적이지 않다.
	// 추상 클래스는 클래스 앞에 abstract 키워드를 이용해서 정의한다.
	// 추상 클래스는 미완성의 추상 메소드를 포함할 수 있다.
	// 추상 메소드란, 내용이 없는 메소드 이다. 즉 구현이 되지 않은 메소드이다.
	// 추상 메소드는 리턴 타입 앞에 abstract라는 키워드를 붙여야 한다.
	// 추상 클래스는 인스턴스를 생성할 수 없다.
	
    public abstract void sing();

    public void fly(){
        System.out.println("날다.");
    }
	
}
