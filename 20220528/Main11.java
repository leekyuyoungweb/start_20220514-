import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		// ���ڸ��߱� ����...
		// 0 ~ 100 ������ �����߿� ��ǻ�Ͱ� ������ ���ڸ� ���� (����)
		
		// ����ڰ� ���ߴ� ����
		// 50   25  --> �۴�
		// 50   70  --> ũ��
		// �����Դϴ�.
		
		// 1. ������ ���� ����������
		
		// while(true) ��ȯ���� �����.
		// ����� �Է��� �޾�
		// ���õ� ���� ���� �Է��� ���� ���ؼ�
		// ������ ��ȯ�� ����
		// �׷��� ������ ���
		
		int com = (int)(Math.random()*100); // 0.0 ~1.0
//		System.out.println(com);
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("0~100������ ������ �Է��ϼ��� ");
			int num = sc.nextInt();
			if(num == com) {
				System.out.println("�����Դϴ�.");
				break;
			}else if(num > com) {
				System.out.println("ũ��");
			}else{
				System.out.println("�۴�");
			}
		}
	}

}





