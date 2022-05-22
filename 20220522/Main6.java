import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// Factorial...
		// 5!     5x4x3x2x1 ---> 1x2x3x4x5
		System.out.println("팩토리얼값을 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		int factnum = sc.nextInt();
		long sum = 1;
		// 이부분을 채워주세요.
		for (int i = 0; i < factnum; i++) {
			sum *= (i+1);
		}
		
		System.out.printf("%d 팩토리얼은 : %d\n",factnum, sum);

	}

}
