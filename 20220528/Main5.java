
public class Main5 {

	public static void main(String[] args) {
		// 1. 0 ~ 10�����ؼ� ���
		// 2. continue�� �̿��ؼ� 0 ~ 10 �߿��� ¦���� ���
		// 3. continue�� �̿��ؼ� 0 ~ 100 �߿��� 3�� ����� ���

		// solutoin 1
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		// solutoin 2
		System.out.println("2.-----------------------------");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) // Ȧ���ϴ� continue�� ����
				continue;
			System.out.println(i);
		}
		// solutoin 3
		System.out.println("3.-----------------------------");
		for (int i = 0; i <= 100; i++) {
			if(i % 3 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}
