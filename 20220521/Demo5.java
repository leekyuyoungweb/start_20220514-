import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// ���׿���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���̸� �Է��ϼ���");
		int age = sc.nextInt();
		
		String check =  (age > 19)? "����" : "�̼�����";
		
//		System.out.println("����� "+check + " �Դϴ�.");
		System.out.printf("����� %s �Դϴ�.\n", check);

	}

}
