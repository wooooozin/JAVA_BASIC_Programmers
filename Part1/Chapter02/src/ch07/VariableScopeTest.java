package ch07;

public class VariableScopeTest {
	
	// 변수의 스코프
	// 프로그램상에서 사용되는 변수들은 사용 가능한 범위를 가진다. 그 범위를 변수의 스코프라고 한다.
	// 변수가 선언된 블럭이 그 변수의 사용범위이다.
	
	int globalScope = 10;
	static int staticValue = 100;
	
	public void scopeTest(int value) {
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}
	
	public void scopeTest2(int value2) {
		
		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value); 
		System.out.println(value2); 
	}
	
	

	public static void main(String[] args) {
		// static
		// 같은 클래스 내에 있음에도 해당 변수들을 사용할 수 없다.
		// main 메소드는 static 이라는 키워드로 메소드가 정의되어 있다. 이런 메서드를 static 한 메소드 라고 한다.
		// static한 필드(필드 앞에 static 키워드를 붙힘)나, static한 메소드는 Class가 인스턴스화 되지 않아도 사용할 수 있다.
		
		// static한 변수는 공유된다.
		// static하게 선언된 변수는 값을 저장할 수 있는 공간이 하나만 생성된다. 그러므로, 인스턴스가 여러개 생성되도 static한 변수는 하나다.
		
		System.out.println(staticValue);
//		System.out.println(localScope);
//		System.out.println(value);
		
		VariableScopeTest v1 = new VariableScopeTest();
		VariableScopeTest v2 = new VariableScopeTest();

		// golbalScope같은 변수(필드)는 인스턴스가 생성될때 생성되기때문에 인스턴스 변수라고 한다.
		// staticVal같은 static한 필드를 클래스 변수라고 한다.
		// 클래스 변수는 레퍼런스.변수명 하고 사용하기 보다는 클래스명.변수명 으로 사용하는것이 더 바람직하다고 하다.
		System.out.println(v1.globalScope);
		System.out.println(VariableScopeTest.staticValue); // OK
		System.out.println(v2.staticValue); // 되긴 하지만 static은 클래스명.변수로 사용하는게 바람직
		
		
		
	}

}
