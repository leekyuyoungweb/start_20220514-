import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		/**
		 * 숫자를 입력받아서... 예) 5     1~5까지의 합을 구하세요
		 * Scanner sc = new Scanner(System.in)
		 * -- 안내문
		 * int num = sc.nextint()
		 * 
		 * i < num
		 * 
		 * sum += i
		 */
		for (int t = 0; t < 3; t++) {
			System.out.println("숫자를 입력하세요 :");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			//합계를 저장할 변수
			long sum = 0;
			for (int i = 0; i < num; i++) {   // 10번순환 0 ~ 9
				sum += i+1;
			}
			System.out.printf("%d 까지의 합은 = %d\n",num, sum);
		}

	}

}
