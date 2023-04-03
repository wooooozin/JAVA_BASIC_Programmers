package ch08;

public class ForTesdt {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		
		int sum1 = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				continue;
			}
			sum1 += i;
		}
		
		System.out.println(sum1);
	}

}
