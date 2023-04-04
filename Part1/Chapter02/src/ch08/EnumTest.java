package ch08;

public class EnumTest {
	
	// 열거형(enum) - 열거형은 JDK5에서 추가되었다.
	// 자바는 열거타입을 이용하여 변수를 선언할 때 변수타입으로 사용할 수 있다.
	// JDK5 이전에는 상수를 열거형 대신 사용
	
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";

	public static void main(String[] args) {
		String gender1;
		gender1 = EnumTest.MALE;
		gender1 = "boy"; // 실행할때 원했던 값인 MALE,FEMALE 이 아닌 다른 값이 들어오게 되므로 문제를 발생시킬 수 있다.
		System.out.println(gender1);
		
		Gender gender2;
		Gender gender3;
		gender2 = Gender.MALE;
		gender3 = Gender.FEMALE;
		
		System.out.println(gender2);
	}

}

enum Gender {
	MALE, FEMALE
}