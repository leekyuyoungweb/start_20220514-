import java.util.Scanner;

/**
 * 
 * 
 * 
 * 정수를 입력하세요 : 5 양수입니다. To be Continue?(y/n) : y
 * 
 * 정수를 입력하세요 : -5 음수입니다. To be Continue?(y/n) : n
 * 
 * 프로그램을 종료합니다.
 * 
 * 
 * Scanner sc = new Scanner(System.in) sc.nextint() 순환문이 필요
 * 
 * 
 * 양수 실수판단해서 출력
 * 
 * 계속할지 물어보고
 */
public class Main9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("정수를 입력하세요 : ");
			int num = sc.nextInt();
			if (num > 0) {
				System.out.println("양수");
			} else if (num < 0) {
				System.out.println("음수");
			} else {
				System.out.println("0");
			}

			System.out.println("To be Continue:(y/n)?");
			String isContinue = sc.next();
			if (isContinue.equals("y")) {
				continue;
			} else {
				break;
			}
		}
		System.out.println("프로그램을 종료합니다. ");
	}

}
