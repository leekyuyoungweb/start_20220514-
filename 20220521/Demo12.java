import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է�:");
		String id = sc.next();
		
		if(id.equals("admin")) {
			System.out.println("�н����� �Է�:");
			String psw = sc.next();
			if(psw.equals("1234")) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("�н����尡 Ʋ�Ⱦ�� ");
			}
		}else {
			System.out.println("���̵� �����ϴ�.");
		}

	}

}
