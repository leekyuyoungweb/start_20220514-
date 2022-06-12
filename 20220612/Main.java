
public class Main {

	public static void main(String[] args) {
		// 1. 객체를 생성
		// 2. 객체를 이용해서 원하는 작업을 한다.
//		Triangle t = null; // t는 객체가 아니라..객체를 할당받지못한 Triangel 타입의 null 값을 가지는 객체
		Triangle t = new Triangle();
		t.height = 23;
		t.width = 33;
		t.area();
		
		

	}

}
