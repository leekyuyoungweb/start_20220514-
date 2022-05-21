import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// 삼항연산
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 나이를 입력하세요");
		int age = sc.nextInt();
		
		String check =  (age > 19)? "성인" : "미성년자";
		
//		System.out.println("당신은 "+check + " 입니다.");
		System.out.printf("당신은 %s 입니다.\n", check);

	}

}
