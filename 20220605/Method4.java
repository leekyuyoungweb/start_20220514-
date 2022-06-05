
/**
 * 
 * 계산기 아주 단순한 계산기
 * 4칙연산... 피 연산자는 두개로 제한  + - * /
 * 1,"+",1  --> 1+1
 * 1,"-",1  --> 1-1
 *
 * (int num1, String op, int num2)
 */


public class Method4 {

	public static void calc(int num1,String op, int num2) {
		switch (op) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":			
			System.out.println(num1-num2);
			break;
		case "*":			
			System.out.println(num1*num2);
			break;
		case "/":			
			if(num2 != 0)
				System.out.println((double)num1/num2);
			else
				System.out.println("0으로 나눌수 없습니다.");
			break;
		default:
			System.out.println("연산자는 + - * / 중에 하나여야 합니다. ");
			break;
		}
	}
	
	public static void main(String[] args) {
		int num1 = 10, num2 = 20;
		String op = "+";
		calc(num1, op, num2);
//		함수이름(num1,op,num2);   
		// 함수에서 출력할것인지 또는 결과를 리턴해서  여기서 결과를 출력 

	}

}
