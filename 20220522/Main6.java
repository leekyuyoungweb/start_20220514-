import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		// Factorial...
		// 5!     5x4x3x2x1 ---> 1x2x3x4x5
		System.out.println("���丮���� �Է��ϼ��� :");
		Scanner sc = new Scanner(System.in);
		int factnum = sc.nextInt();
		long sum = 1;
		// �̺κ��� ä���ּ���.
		for (int i = 0; i < factnum; i++) {
			sum *= (i+1);
		}
		
		System.out.printf("%d ���丮���� : %d\n",factnum, sum);

	}

}
