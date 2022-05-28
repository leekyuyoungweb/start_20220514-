
public class Main5 {

	public static void main(String[] args) {
		// 1. 0 ~ 10포함해서 출력
		// 2. continue를 이용해서 0 ~ 10 중에서 짝수만 출력
		// 3. continue를 이용해서 0 ~ 100 중에서 3의 배수만 출력

		// solutoin 1
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		// solutoin 2
		System.out.println("2.-----------------------------");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) // 홀수일대 continue를 실행
				continue;
			System.out.println(i);
		}
		// solutoin 3
		System.out.println("3.-----------------------------");
		for (int i = 0; i <= 100; i++) {
			if(i % 3 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}
