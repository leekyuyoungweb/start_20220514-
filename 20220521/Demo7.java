import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("##### �޴� ���� ######");
		System.out.println("[1] ������  [2] �Ǹ���");
		System.out.println("# �޴��� �����ϼ��� :");
		
		// ����Ÿ��
		String seller = sc.next();
		
		// ���ڿ��� �񱳴� == ���� �ʰ� equals�� ����Ѵ�
		if(seller.equals("1") ){
			System.out.println("�����ڷ� �α��� �߽��ϴ�.");
		}else{
			System.out.println("�Ǹ��ڷ� �α��� �߽��ϴ�.");
		}

	}

}
