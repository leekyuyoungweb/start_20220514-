/**
 * 
 * method == function
 * 메소드		 함수
 * function  비 객체지향 언어에서
 * 
 */
public class Method01 {

	public static void method1() {
		System.out.println("method1은 메소드 또는 함수인데. 입력값이 없고 출력값이 없는 형태");
		return;
	}
	
	public static int method3(int value, String name) {
		System.out.println(value + " method3은 메소드 또는 함수인데. 입력값은 있고 출력값도 있는 형태 "+name);
		return value;
	}
	
	public static void method2(int value) {
		System.out.println("method2은 메소드 또는 함수인데. 입력값은 있고 출력값이 없는 형태");
		return;
	}	
	
	
	public static int method4() {
		System.out.println("method3은 메소드 또는 함수인데. 입력값은 없고 출력값은 있는 형태");
		return 0;
	}
	
	
	public static void main(String[] args) {
		// 변수를 호출할때는 변수이름만 사용
		// 메소드를 호출때는 이름()
		System.out.println("함수실행전");
		System.out.println( method3(10,"철이")) ;
		System.out.println("함수실행후");
		
	}

}










