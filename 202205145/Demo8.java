import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		// 사용자로부터 값을 입력받는 명령어
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		System.out.println("age : "+age);
		
		
		System.out.println(age > 19);		
		
		System.out.println( (age >=10 ) && (age <=19) );
		
		System.out.println(age < 10);
		
		
		

	}

}
