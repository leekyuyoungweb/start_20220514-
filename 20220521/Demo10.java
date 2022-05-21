
public class Demo10 {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 50;
		
		// 1번문장
		if(number1 > 0) {
			if(number2 > 100) {
				System.out.println("number1은 0보다 크고 number2는 100보다 크다");				
			}			
		}
		// 1번문장을 대체할수 있음
		if(number1 >0 && number2 > 100) {
			System.out.println("number1은 0보다 크고 number2는 100보다 크다");
		}
		
		//2 번문장
		if(number1 > 0) {
			if(number2 > 100) {
				System.out.println("number1은 0보다 크고 number2는 100보다 크다");				
			}
			else {
				System.out.println("number1은 0보다 크고 number2는 100보다 크지않다");
			}
		}
		
		if(number1 >0 && number2 > 100) {
			System.out.println("number1은 0보다 크고 number2는 100보다 크다");   // true, true
		}else {
			System.out.println("number1은 0보다 크고 number2는 100보다 크지않다"); // true false
			System.out.println("number1은 0보다 작고 number2는 100보다 크다");    // false true
			System.out.println("number1은 0보다 작고 number2는 100보다 크지않다"); // false false
		}
		
		

	}

}
