package exception;
/**
 * RunTimeException
 * @author User
 *
 */
public class Exception1 {
	
	public static Person getPerson() {		
		return null;
	}

	public static void main(String[] args) {
		int number1 = 10, number2 = 0;
//		double result = number1 / number2;
		Person person = getPerson();
//		if(person != null) {
			person.method();
//		}
		System.out.println("프로그램이 정상적으로 종료되었습니다.");
		
		
		
		
	}
}
