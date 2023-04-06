package ch17;

public class InnerClassTest {
	
	// 첫번째는 클래스 안에 인스턴스 변수, 
	// 즉 필드를 선언하는 위치에 선언되는 경우. 보통 중첩클래스 혹은 인스턴스 클래스
	
	class Cal {
		int value = 0;
		public  void plus() {
			value++;
		}
	}
	
	// 두번째는 내부 클래스가 static으로 정의된 경우, 정적 중첩 클래스 또는 static 클래스라고 한다.
	// 필드 선언할 때 스태틱한 필드로 선언한 것과 같다. 
	
	static class Cal2 {
		int value = 0;
		public void plue() {
			value++;
		}
	}
	
	// 세번째로는 메소드 안에 클래스를 선언한 경우, 지역 중첩 클래스 또는 지역 클래스라고 한다.
	// 메소드 안에서 해당 클래스를 이용할 수 있다.
	public void exec(){
        class Cal3 {
            int value = 0;
            public void plus() {
                value++;
            }
        }
        Cal3 cal3 = new Cal3();
        cal3.plus();
        System.out.println(cal3.value);
    }

	
	// 네번재로는 익명클래스가 있다.

	
	
	public static void main(String[] args) {
		
		// 중첩클래스 사용법 
		InnerClassTest test = new InnerClassTest();
		InnerClassTest.Cal cal = test.new Cal();
		
		cal.plus();
		System.out.println(cal.value);
		
		
		// 스태틱 필드 클래스
		InnerClassTest.Cal2 cal2 = new InnerClassTest.Cal2();
		cal2.plue();
		System.out.println(cal2.value);
		
		// 메서드 클래스
		InnerClassTest t = new InnerClassTest();
		t.exec();
	}

}
