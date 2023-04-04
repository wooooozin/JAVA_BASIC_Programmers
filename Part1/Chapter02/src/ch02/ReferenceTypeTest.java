package ch02;

public class ReferenceTypeTest {

	public static void main(String[] args) {

		
		// 참조타입 - 	참조형 타입은 기본형 타입을 제외한 모든 타입입니다. 앞서 배웠던, 배열도 참조형이고, 클래스도 모두 참조 타입이다
		
		// 기본타입 
		int num = 4;
		
		// 참조타입
		String string = new String("Hello");
		System.out.println(string);
		// string에는 메모리의 위치 값을 저장하고 있음, String 인스턴스를 참조
		// class들은 모두 참조형이다.
		
	}

}
