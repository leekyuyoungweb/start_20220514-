import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(0) 바위(1) 보(2)를 입력하세요 : ");
		int hu = sc.nextInt();
		int com = (int)(Math.random()*3);  // 0.0 ~ 3.0
		System.out.println(com);

		if(hu - com == 0) {
			System.out.println("무승부");
		}else if( (hu==0 && com==2) 
				|| (hu == 1 && com == 0) 
				|| (hu == 2 && com == 1)   
				) {
			System.out.println("인간승리");
		}else if( (hu==0 && com==1) 
				||  (hu == 1 && com == 2) 
				|| (hu == 2 && com == 0)   
				) {
			System.out.println("컴퓨터승리");
		}else {
			System.out.println("입력값이 올바르지 않습니다.");
		}
			
		System.out.println("-- end game --");

	}

}




