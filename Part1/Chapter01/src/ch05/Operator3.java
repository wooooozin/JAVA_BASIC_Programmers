package ch05;

public class Operator3 {

	public static void main(String[] args) {
		
		/*
		연산자 우선순위
		최우선연산자 ( ., [], () )

		단항연산자 ( ++,--,!,~,+/-   : 부정, bit변환>부호>증감)

		산술연산자 ( *,/,%,+,-,shift) < 시프트연산자 ( >>,<<,>>> ) >

		비교연산자 ( >,<,>=,<=,==,!= )

		비트연산자 ( &,|,,~ )

		논리연산자 (&& , || , !)

		삼항연산자 (조건식) ? :

		대입연산자 =,*=,/=,%=,+=,-=
		
		논리연산자 중 and 연산과 or 연산이 나왔을 경우 and 연산이 먼저 수행 됩니다.

		 */
		
		 int b = 5; 
         System.out.println(++b - 5); 
          //결과는 1 
		
        int a = 5; 
        System.out.println(a++ - 5); 
        //결과는 0
        System.out.println(a); 
        //결과는 6

	}

}
