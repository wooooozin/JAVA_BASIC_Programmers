package ch05;

public class OperatorTest {

	public static void main(String[] args) {
		
	    //부호 연산자 
	    int i1 = -5;
	    int i2 = +i1;
	    int i3 = -i1;

	    //증감 연산자 
	    int i4 = ++i3;
	    int i5 = i3++;
	    int i6 = --i3;
	    int i7 = i3--;
	    
	    i4 = i5++;
	    System.out.println(i4);
	    System.out.println(i5);

	}

}
