import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		/**
		 * ���ڸ� �Է¹޾Ƽ�... ��) 5     1~5������ ���� ���ϼ���
		 * Scanner sc = new Scanner(System.in)
		 * -- �ȳ���
		 * int num = sc.nextint()
		 * 
		 * i < num
		 * 
		 * sum += i
		 */
		for (int t = 0; t < 3; t++) {
			System.out.println("���ڸ� �Է��ϼ��� :");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			//�հ踦 ������ ����
			long sum = 0;
			for (int i = 0; i < num; i++) {   // 10����ȯ 0 ~ 9
				sum += i+1;
			}
			System.out.printf("%d ������ ���� = %d\n",num, sum);
		}

	}

}
