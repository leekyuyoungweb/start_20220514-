import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("100 ~ 999 ������ ������ �Է��ϼ��� : ");
			int num =  sc.nextInt();
			if(num >=100 && num <=999) {
				System.out.println(num);
				break;
			}	
		}
		

	}

}
