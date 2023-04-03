package ch07;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		
		// while - 조건문의 실행 결과가 true일 동안 반복해서 실행한다.
		
	    int i = 0;  //while에서 사용할 변수를 선언

	    while(i < 10){
	        System.out.println(i);
	        i++; //조건문을 원하는 만큼만 반복하고 빠져나가기 위한 부분 
	    }
	    
	    System.out.println(i); // 10;
	    
	    i = 0;
	    int sum = 0;
	    
	    while ( i <= 100) {
	    	sum += i;
	    	i++;
	    }
	    
	    System.out.println(sum);
	    
	    // do while - while문의 경우 조건이 만족하지 않는다면 한번도 반복하지 않을 수 있다.하지만, do while문의 경우는 무조건 한번은 실행되는 반복문이다.
	    	
	    int value = 0;
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    do { 
	    	value = scanner.nextInt();
	    	System.out.println("입력받은 수: " + value);
	    } while (value != 10); // 입력받은 값이 10이 아닐 경우에는 계속 반복합니다.
	    
        System.out.println("반복문 종료");

	}

}
