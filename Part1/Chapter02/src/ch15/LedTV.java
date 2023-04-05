package ch15;

// 인터페이스는 사용할때 해당 인터페이스를 구현하는 클래스에서 implements 키워드를 이용한다.
public class LedTV implements TV {

	@Override
	public void turnOn() {
        System.out.println("켜다");
	}

	@Override
	public void turnOff() {
        System.out.println("끄다");   
	}

	@Override
	public void changeVolume(int volume) {
        System.out.println(volume + "로 볼륨조정하다.");  
	}

	@Override
	public void changeChannel(int channel) {
        System.out.println(channel + "로 채널조정하다.");         

	}
	// 인터페이스가 가지고 있는 메소드를 하나라도 구현하지 않는다면 해당 클래스는 추상클래스가 된다.(추상클래스는 인스턴스를 만들 수 없음)

}
