package ch09;

public class ArrayTest {

	public static void main(String[] args) {
		
		// 배열 - 배열은 같은 데이터 타입을 가진 연속된 메모리 공간으로 이루어진 자료구조이다.
		// 같은 데이터 타입을 가진 여러개의 변수가 필요할 때 사용한다.

        int[] array1 = new int[4];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        //자바에서 배열의 인덱스는 0번 부터 사용한다. 4개짜리 배열은 0부터 3까지의 인덱스를 가지게 된다.
        //배열인덱스 0번부터 3번까지 차례로 1,2,3,4 값을 저장한다. 
        
        System.out.println(array1[1]); 
        
        int[] array2 = new int[]{1,2,3,4,5};
        
        // for 반복문을 이용해서 배열 사용하기
        
        for (int num : array2) {
        	System.out.println(num);
        }
        
        int [] iarray = new int[100];

        for (int i = 0; i < iarray.length; i++) {
        	iarray[i] = i + 1;
        }
        
        int sum = 0; 
        //값을 누적하기위한 변수는 반복문 밖에서 선언한다. 

        for(int i = 0; i< iarray.length; i++){  
        // 배열의 크기만큼 반복한다.         

            sum = sum + iarray[i];
            //반복문 밖에서 선언한 변수에 반복적으로 값을 누적한다. 
        }

        System.out.println(sum);
        //배열에 들어있는 모든 값 누적한 변수를 출력한다. 
	}

}
