import java.util.Scanner;

/**
 * 
 * Q : 사용자로 부터 다음과 같은 형태로 입력을 받는다.
 * 입력의 예 :  2 + 9
 * 결과는  2 + 9 = 11
 * 입력은 Scanner를 이용
 * 입력한 데이터는 문자열로 받게된다.
 */
public class Method6 {
	public static double abs(double num) {
		return (num<0)? -num : num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 1
//		System.out.println("사칙연산을 공백을 기준으로 입력하세요(예 2 + 4) : ");
//		String input =  sc.nextLine();
//		System.out.println(input);
//		String[] datas =  input.split(" ");
		// 2 
//		System.out.println("사칙연산을 공백없이  입력하세요(예 2+4) : ");
//		String input =  sc.next();
//		System.out.println(input);	
//		char[] datas =  input.toCharArray();
		// 3
		System.out.println("사칙연산을 공백을 기준으로 입력하세요(예 2 + 4) : ");
		String input1 =  sc.next();
		String input2 =  sc.next();
		String input3 =  sc.next();
		System.out.println(input1);	
		System.out.println(input2);
		System.out.println(input3);
		
		// 사칙연산 함수를 이용해서 결과를 출력(함수안에서 출력 / 결과를 받아서 main 출력)
		
	}

}
