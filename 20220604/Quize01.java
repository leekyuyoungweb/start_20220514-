import java.util.Scanner;

/**
 * 
 * ���������� �հ�, ���, �ְ���, �������� ���ϴ� ���α׷� �̶� ������� Ű���� �Է��� ���� ���޹�����
 *
 */
public class Quize01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ �Է��ϼ���-->");
		int humanNum =  sc.nextInt();
		
		long sum = 0;
		int[] scores = new int[humanNum];
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("[%d] ���������� �Է��ϼ���-->\n",i+1);
			sum += scores[i] = sc.nextInt();			
		}
		// �ִ� �ּ�

	}

}
