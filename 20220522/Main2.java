import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
//		String name = "ȫ�浿";		
//		String name = new String("ȫ�浿");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���");
		int age = sc.nextInt();
		// 10~19 10��
		switch (age) {
		case 10:			
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
			System.out.println("����� 10��");		
			break;
		default:
			System.out.println("����� 10�밡 �ƴմϴ�.");
			break;
		}

	}

}
