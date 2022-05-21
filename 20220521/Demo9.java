import java.util.Scanner;

/**
 * 1. 관리자인지 아닌지
 * 2. 메뉴두개중에 어느메뉴를 선택하는지
 * 3. 결과  
 * 관리자 + 1번메뉴
 * 관리자 + 2번메뉴
 * 비관리자 + 1번메뉴
 * 비관리자 + 2번메뉴
 * 
 *
 */

public class Demo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요(관리자는 admin)");
		String id = sc.next();
		
		System.out.println("메뉴를 선택하세요([1] 회원가입  [2] 회원정보 수정");
		int choiceNum = sc.nextInt();

		if(id.equals("admin")&& choiceNum == 1 ) {
			System.out.println("admin이 1번 메뉴 선택");
		}else if(id.equals("admin") && choiceNum == 2) {
			System.out.println("admin이 2번 메뉴 선택");
		}else if(!id.equals("admin") && choiceNum == 1) {
			System.out.println(id + " 가 1번 메뉴 선택");
		}else {   // else if(!id.equals("admin") && choiceNum == 2)
			System.out.println(id + " 가 2번 메뉴 선택");
		}		
	}

}
