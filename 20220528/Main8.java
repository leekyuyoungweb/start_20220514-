import java.util.Scanner;

public class Main8 {

	public static boolean check(int hu, int com) {
		if( (hu==0 && com==2) 
				|| (hu == 1 && com == 0) 
				|| (hu == 2 && com == 1)   
				) {
			return true;
		}
		else if( (hu==0 && com==1) 
				||  (hu == 1 && com == 2) 
				|| (hu == 2 && com == 0)   
				) {
			return false;
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����(0) ����(1) ��(2)�� �Է��ϼ��� : ");
		int hu = sc.nextInt();
		int com = (int)(Math.random()*3);  // 0.0 ~ 3.0
		System.out.println(com);

		if(hu - com == 0) {
			System.out.println("���º�");
		}else if( check(hu, com))
			System.out.println("�ΰ��¸�");
		else
			System.out.println("��ǻ�ͽ¸�");
			
		System.out.println("-- end game --");

	}

}
