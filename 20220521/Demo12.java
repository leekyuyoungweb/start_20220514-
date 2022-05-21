import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력:");
		String id = sc.next();
		
		if(id.equals("admin")) {
			System.out.println("패스워드 입력:");
			String psw = sc.next();
			if(psw.equals("1234")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("패스워드가 틀렸어요 ");
			}
		}else {
			System.out.println("아이디가 없습니다.");
		}

	}

}
