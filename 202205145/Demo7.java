
public class Demo7 {

	// 클래스의 블록에서 선언되었기때문에 클래스 소유이고.. 클래스변수
	// 또는 인스턴스 변수(instance variable)
	int num1;
	
	// main 함수(메소드)안에서 생성된 변수는 클래스입장에서는
	// 다 지역변수이다.
	public static void main(String[] args) {
		int num1 = 10; // 전역변수  global variable
		System.out.println(num1);
		
		// 변수는 생성된 블럭이 없어지면 사라진다.
		// 없어진다는-> 실행이 다 되었다..다 지나갔다.
		{
			System.out.println(num1);
			int num2 = 20; // 지역변수  local variable
			System.out.println(num2);
		}
		
//		System.out.println(num2);
	}

}
