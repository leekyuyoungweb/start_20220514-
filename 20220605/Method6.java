import java.util.Scanner;

/**
 * 
 * Q : ����ڷ� ���� ������ ���� ���·� �Է��� �޴´�.
 * �Է��� �� :  2 + 9
 * �����  2 + 9 = 11
 * �Է��� Scanner�� �̿�
 * �Է��� �����ʹ� ���ڿ��� �ްԵȴ�.
 */
public class Method6 {
	public static double abs(double num) {
		return (num<0)? -num : num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 1
//		System.out.println("��Ģ������ ������ �������� �Է��ϼ���(�� 2 + 4) : ");
//		String input =  sc.nextLine();
//		System.out.println(input);
//		String[] datas =  input.split(" ");
		// 2 
//		System.out.println("��Ģ������ �������  �Է��ϼ���(�� 2+4) : ");
//		String input =  sc.next();
//		System.out.println(input);	
//		char[] datas =  input.toCharArray();
		// 3
		System.out.println("��Ģ������ ������ �������� �Է��ϼ���(�� 2 + 4) : ");
		String input1 =  sc.next();
		String input2 =  sc.next();
		String input3 =  sc.next();
		System.out.println(input1);	
		System.out.println(input2);
		System.out.println(input3);
		
		// ��Ģ���� �Լ��� �̿��ؼ� ����� ���(�Լ��ȿ��� ��� / ����� �޾Ƽ� main ���)
		
	}

}
