import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� :");
		int num =  sc.nextInt(); // ������� �Է��� ���
		System.out.println("���� �Է°� : "+ num);
		System.out.println("num % 2 : "+ (num % 2) );
		System.out.println("num += 10 : "+ (num += 10) );
		System.out.println("num -= 10 : "+ (num -= 10) );
		System.out.println("num *= 10 : "+ (num *= 10) );
		System.out.println("num /= 10 : "+ (num /= 10) );
		System.out.println("++num : "+ (++num) );
		System.out.println("--num : "+ (--num) );

	}

}
