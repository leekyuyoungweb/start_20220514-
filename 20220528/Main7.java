import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����(0) ����(1) ��(2)�� �Է��ϼ��� : ");
		int hu = sc.nextInt();
		int com = (int)(Math.random()*3);  // 0.0 ~ 3.0
		System.out.println(com);

		if(hu - com == 0) {
			System.out.println("���º�");
		}else if( (hu==0 && com==2) 
				|| (hu == 1 && com == 0) 
				|| (hu == 2 && com == 1)   
				) {
			System.out.println("�ΰ��¸�");
		}else if( (hu==0 && com==1) 
				||  (hu == 1 && com == 2) 
				|| (hu == 2 && com == 0)   
				) {
			System.out.println("��ǻ�ͽ¸�");
		}else {
			System.out.println("�Է°��� �ùٸ��� �ʽ��ϴ�.");
		}
			
		System.out.println("-- end game --");

	}

}




