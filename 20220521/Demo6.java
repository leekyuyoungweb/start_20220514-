import java.util.Scanner;

/**
 * 
 * �հ� ���հ��� �Ǵ��ϰ� ��������� ����� �����ϴ� ���α׷�
 * ������ �Է�
 * 60���̻� �̸� �հݿ��θ� �˷��ִ� ������ true�� �����ϰ�
 * �����մϴ�. -->���
 * 
 * �հݿ��θ� �˷��ִ� ������ false�� �����ϰ�
 * �հ��� ��ܿ� �����ϴ�.. -->���
 *
 */
public class Demo6 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);		
		int score = sc.nextInt();
		
		boolean isSuccess;
		
		isSuccess = (score > 60)? true : false;
		System.out.println("isSuccess : "+isSuccess);
		
		String result = (isSuccess)? "�հ��� �����մϴ�.":"�հ��� ��ܿ� �����ϴ�.";
		
		System.out.println(result);	
		

	}

}
