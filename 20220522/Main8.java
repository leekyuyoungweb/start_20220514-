
public class Main8 {

	public static void main(String[] args) {
		// 순환문을 이용한 구구단
		for (int t = 2; t < 10; t++) {			
			for (int i = 1; i < 10; i++) {  //1 ~ 9
				System.out.printf("%d x %d = %d\n",t, i, i*t);
			}
			System.out.println("-----------------------------");
		}	
	}

}
