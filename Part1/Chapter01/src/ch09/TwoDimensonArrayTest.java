package ch09;

public class TwoDimensonArrayTest {

	public static void main(String[] args) {
		
        int[][] array4 = new int[3][4];
        array4[0][0] = 10; 
        
        // 가변 크기의 2차원 배열 생성
        int[][] array5 = new int[3][];
        //위와 같이 선언하면 array5는 3개짜리 배열을 참조한다. 3개짜리 배열은 아직 참조하는 배열이 없다는 것을 의미.

        array5[0] = new int[1]; //정수를 하나 담을 수 있는 배열을 생성해서 array5 의 0 번째 인덱스가 참조한다.  
        array5[1] = new int[2]; //정수를 두개 담을 수 있는 배열을 생성해서 array5 의 1 번째 인덱스가 참조한다.  
        array5[2] = new int[3]; //정수를 세개 담을 수 있는 배열을 생성해서 array5 의 2 번째 인덱스가 참조한다.
        
        // 선언과 동시에 초기화하는 방법
        
        int[][] array6 = {{1}, {2,3}, {4,5,6}};
        //위와 같이 선언할 경우 array6[0][0] 는 1이다. array6[1][0]은 2이다. 
        

	}

}
