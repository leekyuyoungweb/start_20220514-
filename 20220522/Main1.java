import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(1~5)");
		int key = sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("일");
			break;
		case 2:
			System.out.println("이");
			break;
		case 3:
			System.out.println("삼");
			break;
		case 4:
			System.out.println("사");
			break;
		case 5:
			System.out.println("오");
			break;
		default:
			System.out.println("잘못입력했습니다.");
			break;
		}
	}

}
