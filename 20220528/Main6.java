import java.util.Scanner;

/**
 * 
 * 가위바위보 게임
 * 입력을 받는다..(가위  바위  보 )
 * 랜덤함수를 이용해서 컴퓨터가 가위 바위 보를 서탠해서
 * 게임결과를 보여준다..
 * 인간승
 * 인간패
 * 비김 
 * 
 * 인간	-	컴퓨터
 * 가위 1      보 3 + 1                
 * 바위 2      가위 1 +2        
 * 보  3     바위 2 + 3        
 * 
 * 두 수를뺀 값이 0 비긴다.
 * 
 *  가위1    바위2 바위2
 *  바위2    가위1 보3
 *  보3    바위2 가위1
 * 
 */
public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(0) 바위(1) 보(2)를 입력하세요 : ");
		int hu = sc.nextInt();
		int com = (int)(Math.random()*3);  // 0.0 ~ 3.0
		System.out.println(com);
		if(hu - com == 0) {
			System.out.println("무승부");
		}else if(hu==0 && com==2) {
			System.out.println("인간승리");
		}else if(hu==0 && com==1) {
			System.out.println("컴퓨터승리");
		}else if(hu == 1 && com == 0) {
			System.out.println("인간승리");
		}else if(hu == 1 && com == 2) {
			System.out.println("컴퓨터승리");
		}else if(hu == 2 && com == 1) {
			System.out.println("인간승리");
		}else if(hu == 2 && com == 0) {
			System.out.println("컴퓨터승리");
		}

		System.out.println("-- end game --");
	}

}










