package ch05;

public class Operator2 {

	public static void main(String[] args) {
		
	    int i = 10; // = 대입연산자 
	    int j = 10;    

	    // i 와 j 가 같은지 비교 하는 비교 연산자           
	    System.out.println(i == j ); 
	    System.out.println(i == j );
	    System.out.println(i != j );
	    System.out.println(i < j);
	    System.out.println( i <= j);
	    System.out.println(i > j);
	    System.out.println(i >= j);
	    	
	    
	    // 대입 연산자
	    i = 20;
	    
	    // 복합 대입 연산자 
	    i += 10; // i = i + 10;  과 같은 의미 

	    System.out.println(i);  
	    System.out.println(i -=5);
	    System.out.println(i);
	}

}
