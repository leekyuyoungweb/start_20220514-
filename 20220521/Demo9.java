import java.util.Scanner;

/**
 * 1. ���������� �ƴ���
 * 2. �޴��ΰ��߿� ����޴��� �����ϴ���
 * 3. ���  
 * ������ + 1���޴�
 * ������ + 2���޴�
 * ������� + 1���޴�
 * ������� + 2���޴�
 * 
 *
 */

public class Demo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���(�����ڴ� admin)");
		String id = sc.next();
		
		System.out.println("�޴��� �����ϼ���([1] ȸ������  [2] ȸ������ ����");
		int choiceNum = sc.nextInt();

		if(id.equals("admin")&& choiceNum == 1 ) {
			System.out.println("admin�� 1�� �޴� ����");
		}else if(id.equals("admin") && choiceNum == 2) {
			System.out.println("admin�� 2�� �޴� ����");
		}else if(!id.equals("admin") && choiceNum == 1) {
			System.out.println(id + " �� 1�� �޴� ����");
		}else {   // else if(!id.equals("admin") && choiceNum == 2)
			System.out.println(id + " �� 2�� �޴� ����");
		}		
	}

}
