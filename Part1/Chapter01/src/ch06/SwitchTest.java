package ch06;

public class SwitchTest {

	public static void main(String[] args) {
		
		// switch문은 어떤 변수의 값에 따라서 문장을 실행할 수 있도록 하는 제어문이다.
		
	    int value = 1;

	    switch (value) {
	        case 1: 
	            System.out.println("1");
	            break;
	        case 2:
	            System.out.println("2");
	            break;
	        case 3 :
	            System.out.println("3");
	            break;
	        default :
	            System.out.println("그 외의 숫자");
	    }
	    
	    // 문자열도 가능해짐
	    String str = "A";

	    switch (str) {
	        case "A": 
	            System.out.println("A");
	            break;
	        case "B":
	            System.out.println("B");
	            break;
	        case "C" :
	            System.out.println("C");
	            break;
	        default :
	            System.out.println("그 외의 숫자");
	    }

	}

}
