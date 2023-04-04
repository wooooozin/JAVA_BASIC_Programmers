package ch03;

public class StringTest {

	public static void main(String[] args) {
		
		// String클래스 - 문자열을 표현하는 자바에서 가장 많이 사용하는 클래스
		// 1. new연산자를 이용하지 않고 인스턴스를 만드는 경우
		// "hello"라는 문자열이 메모리 중에서 상수가 저장되는 영역에 저장된다. 상수는 변하지 않는 값을 의미.
		// String str2 = "hello"; 이 문장이 실행될 때에 hello 라는 문자열 상수는 이미 만들어져 있으므로 str1이 참조하는 인스턴스를 str2도 참조한다.
		
		String str1 = "hello";
		String str2 = "hello";
		
		// new연산자를 이용하여 인스턴스를 만들면 인스턴스는 무조건 새롭게 만들어진다.
		// String str4 = new String("hello"); 이 문장이 실행될때도 새롭게 만들게 되므로, 
		// str3 과 str4는 서로 다른 인스턴스를 참조한다.
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		
		// 참조변수끼리 == 로 비교하면 서로 같은 것을 참조하는지 비교한다.
	    if(str1 == str2){  // 같은 인스턴스를 참조하므로 결과는 true 
	        System.out.println("str1과 str2는 같은 레퍼런스입니다.");
	    }

	    if(str1 == str3){  // str1과 str3은 서로 다른 인스턴스를 참조하므로 결과는 false 
	        System.out.println("str1과 str3는 같은 레퍼런스입니다.");
	    } else {
	        System.out.println("str1과 str3는 다른 레퍼런스입니다.");
	    }

	    if(str3 == str4){  // str3과 str4는 서로 다른 인스턴스를 참조하므로 결과는 false 
	        System.out.println("str3과 str4는 같은 레퍼런스입니다.");
	    } else {
	        System.out.println("str3과 str4는 다른 레퍼런스입니다.");
	    }
	    
	    /*
	    String은 다른 클래스와 다르게 new를 사용하지 않고 사용할 수 있다. 메모리를 아끼려면 String은 new를 사용하지 않고 사용하는 것이 좋다.
		String은 불변 클래스이다. 불변이란 String이 인스턴스가 될때 가지고 있던 값을 나중에 수정할 수 없다.
		String은 문자열과 관련된 다양한 메소드를 가지고 있다. 메소드를 호출한다 하더라도 String은 내부의 값이 변하지 않는다.
		String이 가지고 있는 메소드중 String을 반환하는 메소드는 모두 새로운 String을 생성해서 반환한다.
	     */
	    
	    String str5 = "hello world";
	    String str6 = str5.substring(3);
//	    substring은 문자열을 자른 결과를 반환하는 메소드이다. 해당 코드가 실행되어도 str5는 변하지 않는다.
//	    str6은 str5가 가지고 있는 문자열 중 3번째 위치부터 자른 결과 즉 새로운 String을 참조하게 된다.
	    System.out.println(str5);
	    System.out.println(str6);

	}

}
