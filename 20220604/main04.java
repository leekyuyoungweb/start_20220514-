import java.util.Arrays;
import java.util.Random;

public class main04 {

	public static void main(String[] args) {
		// ����
		// ������������(0~20) 5���� ���� 1���� �迭�� �����..
		// ��հ� ���� �׸��� �ִ밪�� �ּҰ��� ���ؼ� �����ϰ� ���
		
		// 5 x 5 �� 2�����迭�� ���� 0 ~20 ���̷� ������ ������ �ʱ�ȭ
		// ��հ� ���� �׸��� �ִ밪�� �ּҰ��� ���غ���
		// �� row�� �հ� ��� �ִ� �ּ�
		// �� col�� �հ� ��� �ִ� �ּ�
		// �밢���� �հ� ��� �ִ� �ּ�
		
		// ������...... 5 x 5 ����� �̿��ؼ� ���� ����. ��ǻ�Ϳͳ��� ���� ����
		
		// Ǯ��
		// Random Ŭ������ �̿��� ���� ���� ���� Ȯ��
		Random r = new Random();
//		for (int i = 0; i < 5; i++) {
//			System.out.println( r.nextInt(20) );			
//		}
		
		// 1���� �迭 ����  5���� ����
		int[] ary1th = new int[5];
		for (int i = 0; i < ary1th.length; i++) {
			 ary1th[i] =  r.nextInt(20);			
		}
		// 1���� �迭�� ����
		int sum = 0, min = ary1th[0], max = ary1th[0];
		
		for (int i = 0; i < ary1th.length; i++) {
			sum += ary1th[i];
			if(max < ary1th[i])
				max = ary1th[i];
			if(min > ary1th[i])
				min = ary1th[i];
		}
		System.out.println( Arrays.toString(ary1th)); 
		System.out.printf("���� : %d,  ��� : %.2f �ִ밪 : %d, �ּҰ� : %d\n",sum, (double)sum/ary1th.length, max, min);
		
		// 2�� 5 x 5 �迭�� ���� ������ ���ڷ� �ʱ�ȭ
		// �հ�
		sum = 0; 
		int[][] ary2th = new int[5][5];
		for (int i = 0; i < ary2th.length; i++) {
			for (int j = 0; j < ary2th[i].length; j++) {
				ary2th[i][j] = r.nextInt(20);
				sum += ary2th[i][j]; 
			}
		}
		
		// �ּ� �ִ�
		min=ary2th[0][0]; max=ary2th[0][0];
		for (int i = 0; i < ary2th.length; i++) {
			for (int j = 0; j < ary2th[i].length; j++) {
				if(max < ary2th[i][j])
					max = ary2th[i][j];
				if(min > ary2th[i][j])
					min = ary2th[i][j];
			}
		}
		
		int sum1 = 0,sum2=0;
		for (int i = 0; i < ary2th.length; i++) {
			sum1 += ary2th[i][i];			
		}
		for (int i = 0; i < ary2th.length; i++) {
			sum2 += ary2th[i][ary2th.length-1-i];			
		}
		
		
		

	}

}






