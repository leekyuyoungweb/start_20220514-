import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 :");
		int num =  sc.nextInt(); // 사용자의 입력을 대기
		System.out.println("최초 입력값 : "+ num);
		System.out.println("num % 2 : "+ (num % 2) );
		System.out.println("num += 10 : "+ (num += 10) );
		System.out.println("num -= 10 : "+ (num -= 10) );
		System.out.println("num *= 10 : "+ (num *= 10) );
		System.out.println("num /= 10 : "+ (num /= 10) );
		System.out.println("++num : "+ (++num) );
		System.out.println("--num : "+ (--num) );

	}

}
