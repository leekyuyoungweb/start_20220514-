import java.util.Scanner;

/**
 * 
 * 
 * 
 * ������ �Է��ϼ��� : 5 ����Դϴ�. To be Continue?(y/n) : y
 * 
 * ������ �Է��ϼ��� : -5 �����Դϴ�. To be Continue?(y/n) : n
 * 
 * ���α׷��� �����մϴ�.
 * 
 * 
 * Scanner sc = new Scanner(System.in) sc.nextint() ��ȯ���� �ʿ�
 * 
 * 
 * ��� �Ǽ��Ǵ��ؼ� ���
 * 
 * ������� �����
 */
public class Main9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("������ �Է��ϼ��� : ");
			int num = sc.nextInt();
			if (num > 0) {
				System.out.println("���");
			} else if (num < 0) {
				System.out.println("����");
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
		System.out.println("���α׷��� �����մϴ�. ");
	}

}
