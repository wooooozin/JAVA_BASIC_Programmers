package ch16;

public class CalcTest {

	public static void main(String[] args) {
		
		Caculator calCaculator = new MyCalc();
		calCaculator.plus(3, 4);
		int i = calCaculator.exec(4, 4);
		
		Caculator.exec2(23, 1);
		
		

	}


}
