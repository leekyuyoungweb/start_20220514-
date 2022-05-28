import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		// 숫자맞추기 게임...
		// 0 ~ 100 까지의 숫자중에 컴퓨터가 임의의 숫자를 선택 (랜덤)
		
		// 사용자가 맞추는 게임
		// 50   25  --> 작다
		// 50   70  --> 크다
		// 정답입니다.
		
		// 1. 랜덤한 값을 변수에저장
		
		// while(true) 순환문을 만들고.
		// 사용자 입력을 받아
		// 선택된 값과 내가 입력한 값을 비교해서
		// 맞으면 순환문 종료
		// 그렇지 않으면 계속
		
		int com = (int)(Math.random()*100); // 0.0 ~1.0
//		System.out.println(com);
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("0~100사이의 정수를 입력하세요 ");
			int num = sc.nextInt();
			if(num == com) {
				System.out.println("정답입니다.");
				break;
			}else if(num > com) {
				System.out.println("크다");
			}else{
				System.out.println("작다");
			}
		}
	}

}





