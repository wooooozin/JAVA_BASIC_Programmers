package ch06;

public class StringMethodTest {

	public static void main(String[] args) {
		
		String str = "Hello";
		
		// 문자열 길이 구하기 - str.length()는 str이 참조하는 문자열의 길이를 구해서 int 타입으로 리턴해주는 메소드 이다.
	    System.out.println(str.length());  //str
	    
	    // 문자열 붙히기 (concat) 
	    // str.concat("world") 메소드는 str 이 참조하는 문자열 hello 에다가 메소드의 인자로 들어온 문자열 world 를 붙혀서 String 타입으로 리턴하는 메소드다.
	    
	    System.out.println(str.concat(" world"));  //출력결과는 hello world 
	    System.out.println(str);  //출력결과는 hello 
	    str = str.concat(" world");
	    // 문자열 자르기 (subString)
	    // str.subString(1,3) 은 str이 참조하는 문자열을 인덱스 1번부터 3번 전까지(1, 2) 자른 결과이다.
	    // str.subString(1,4) 은 str이 참조하는 문자열을 인덱스 1번부터 4번 전까지(1, 2, 3) 자른 결과이다.
	    System.out.println(str.substring(1, 3)); //출력결과  el
	    System.out.println(str.substring(1, 4)); //출력결과  ell


	    // str.subString(2) 은 str이 참조하는 문자열을 2번 인덱스부터 마지막까지 자른 결과를 의미한다.
	    System.out.println(str.substring(2));   //출력결과 llo world

	}

}
