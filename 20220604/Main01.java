import java.util.Iterator;
import java.util.Scanner;

/**
 * �迭�� ������ ��ǥ �ý���
 * �����ڰ� 10�� �̶�� ����(10�� �Է¹޾ƾ� ��)
 * 
 * 1. �Է½� ��ȿ������ �Ѿ��... �������߻���... ������������ ������ ó���Ұ�
 * 2. ������... �ش��ϴ� �ĺ��ڸ� ���
 * 3. ������ �ĺ��ڸ� �ٽ���ǥ
 */
public class Main01 {

	public static void main(String[] args) {
		int voter = 10; // �����ڼ�		
		String[] candidates = {"","ȫ�浿","�̼���","������","ö��","����"};
		Scanner sc = new Scanner(System.in);		
		int[] getVoteofCandidate = new int[candidates.length+1]; // ������ �迭�� �⺻ ���� 0�̴�.	
		
		for (int t = 0; t < voter; t++){
			// 1.ȫ�浿 2. �̼���  3. ������ 4. ö��  5. ����
			// �ĺ������
			for (int i = 1; i < candidates.length; i++) {
				String string = candidates[i];
				System.out.printf("%d.%s ",i, string);			
			}
			System.out.println(); // �� �ٲ�
			System.out.println("�ĺ��ڸ� ������ �ּ���");
			int vote =  sc.nextInt();  // ȭ�鿡�� �Է��� ���� ������ ��ȯ
			getVoteofCandidate[vote]++;
		}
		// ��ǥ�� ��
		// ��ǥ������ �˻��ؼ� ���� ���� ��ǥ�� ���� ����� �缱������ ���
		int max = getVoteofCandidate[0];
		int index = 0;
		for (int i = 1; i < getVoteofCandidate.length; i++) {
			if(max < getVoteofCandidate[i]) {
				max = getVoteofCandidate[i];
				index = i;
			}
		}
		// ������
		System.out.printf("�缱�� %s, ��ǥ��:%d \n", candidates[index], max);
		
	}
}





