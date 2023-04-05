package ch11;

public class AccessTest extends AccessObject {

	public static void main(String[] args) {
		
		AccessObject object = new AccessObject();
		
		System.out.println(object.defaultNum); // 같은 패키지에선 접근 가능
		System.out.println(object.protectedNum); // 상속 시 접근 가능
		System.out.println(object.publicNum); 
//		System.out.println(object.privateNum); - 접근 불

	}

}
