import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		if(score >= 90) {
			System.out.println("A �����Դϴ�."); // 90 ~  
		}else if(score >= 80) {
			System.out.println("B �����Դϴ�.");   // 80 ~~ 89  
		}else if(score >= 70) {
			System.out.println("C �����Դϴ�.");  // 70 ~ 79
		}else if(score >= 60) {
			System.out.println("D �����Դϴ�.");  //  60 ~ 69
		}else {
			System.out.println("F �����Դϴ�.");  //  ~  59
		}

	}

}
