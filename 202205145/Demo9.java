import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {		
		System.out.println("���� ���� ���������� ������ �������� �Է��ϼ���");
		//80 80 90   83.333
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		//����+����+������ ����� ����
		// ���� / ����  ��� ����
		
		double avg = ( kor+eng+math) / 3.0;
		System.out.println("����� : "+avg);
	}

}
