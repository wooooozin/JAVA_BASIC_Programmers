package ch15;

public interface TV {
	
	// 인터페이스: 서로 관계가 없는 물체들이 상호 작용을 하기 위해서 사용하는 장치나 시스템
	// 추상 메소드와 상수를 정의 할 수 있다.
	// 인터페이스에서 변수를 선언하면 static 상수로 선언됨 -     public static final int MAX_VOLUME = 100;
	// 인터페이스의 메서드는 모두 추상메서드로 선언된다. -     public abstract void on();
	
    public int MAX_VOLUME = 100;
    public int MIN_VOLUME = 0;
    // public static final int MIN_VOLUME = 0;

    public void turnOn();
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);
    // public abstract void channel(int number);
}
