import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("##### 메뉴 선택 ######");
		System.out.println("[1] 구매자  [2] 판매자");
		System.out.println("# 메뉴를 선택하세요 :");
		
		// 참조타입
		String seller = sc.next();
		
		// 문자열의 비교는 == 쓰지 않고 equals를 사용한다
		if(seller.equals("1") ){
			System.out.println("구매자로 로그인 했습니다.");
		}else{
			System.out.println("판매자로 로그인 했습니다.");
		}

	}

}
