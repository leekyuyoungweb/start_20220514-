import java.util.Scanner;

/**
 * 
 * ���������� ����
 * �Է��� �޴´�..(����  ����  �� )
 * �����Լ��� �̿��ؼ� ��ǻ�Ͱ� ���� ���� ���� �����ؼ�
 * ���Ӱ���� �����ش�..
 * �ΰ���
 * �ΰ���
 * ��� 
 * 
 * �ΰ�	-	��ǻ��
 * ���� 1      �� 3 + 1                
 * ���� 2      ���� 1 +2        
 * ��  3     ���� 2 + 3        
 * 
 * �� ������ ���� 0 ����.
 * 
 *  ����1    ����2 ����2
 *  ����2    ����1 ��3
 *  ��3    ����2 ����1
 * 
 */
public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����(0) ����(1) ��(2)�� �Է��ϼ��� : ");
		int hu = sc.nextInt();
		int com = (int)(Math.random()*3);  // 0.0 ~ 3.0
		System.out.println(com);
		if(hu - com == 0) {
			System.out.println("���º�");
		}else if(hu==0 && com==2) {
			System.out.println("�ΰ��¸�");
		}else if(hu==0 && com==1) {
			System.out.println("��ǻ�ͽ¸�");
		}else if(hu == 1 && com == 0) {
			System.out.println("�ΰ��¸�");
		}else if(hu == 1 && com == 2) {
			System.out.println("��ǻ�ͽ¸�");
		}else if(hu == 2 && com == 1) {
			System.out.println("�ΰ��¸�");
		}else if(hu == 2 && com == 0) {
			System.out.println("��ǻ�ͽ¸�");
		}

		System.out.println("-- end game --");
	}

}










