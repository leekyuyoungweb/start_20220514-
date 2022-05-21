import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int score = sc.nextInt();
		if(score >= 90) {
			System.out.println("A 학점입니다."); // 90 ~  
		}else if(score >= 80) {
			System.out.println("B 학점입니다.");   // 80 ~~ 89  
		}else if(score >= 70) {
			System.out.println("C 학점입니다.");  // 70 ~ 79
		}else if(score >= 60) {
			System.out.println("D 학점입니다.");  //  60 ~ 69
		}else {
			System.out.println("F 학점입니다.");  //  ~  59
		}

	}

}
