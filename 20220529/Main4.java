import java.util.Scanner;

/**
 * 
 * �Ѻо��� �������� �Ƿ��� �ּ�.. �ϸ��ð��� ��Ģ
 */

public class Main4 {

	public static void main(String[] args) {
		int[] sales = new int[5];
		// �� �Ǹŷ�
		int sum = 0;
		// ���� ���� �ȸ� ����
		int max = 0;
		int maxIndex = 0;
		int min = 0;
		int minIndex = 0;
		// sc�� Scanner ��ü
		Scanner sc = new Scanner(System.in);
		String[] weeks = { "��", "ȭ", "��", "��", "��" };

		for (int i = 0; i < sales.length; i++) {
			System.out.printf("%s������ �Ǹŷ��� �Է��ϼ���:", weeks[i]);
			sales[i] = sc.nextInt();
			sum += sales[i];
			if (i == 0) {
				max = min = sales[i];
			} else {
				if (sales[i] > max) {
					max = sales[i];
					maxIndex = i;
				} else if (sales[i] < min) {
					min = sales[i];
					minIndex = i;
				}
			}
		}
		System.out.printf("�� �Ǹŷ�: %d��\n", sum);
		System.out.printf("���帹�� �ȸ� ������ %s �̰� ������ %d\n", weeks[maxIndex], max);
		System.out.printf("�������� �ȸ� ������ %s �̰� ������ %d\n", weeks[minIndex], min);
	}

}
