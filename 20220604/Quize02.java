import java.util.Scanner;

/**
 * 
 * �迭���� Ư�� ���� ������ ��Ҹ� ã�ƶ�, ���ϰ��� ��Ұ� ������ ������ ���� �տ� ��ġ�� ��Ҹ� ã�� �� �α׷��� ���� �ڿ� �ִ� ��Ҹ� ã�� ���α׷�
 *
 */
public class Quize02 {

	public static void main(String[] args) {		
		int[] scores = {5,4,1,5,6,1,7,8,1,2};
		int findNum = 6;
		int findedCount = 0, index = 0;		
		for (int i = 0; i < scores.length; i++) {			
			if(findNum == scores[i]) {
				findedCount++; index = i;
				if(findedCount == 1)
					System.out.printf("[%d]\n",index);
			}										
		}
		if(findedCount > 1)
			System.out.printf("[%d]\n",index);
	}
}
