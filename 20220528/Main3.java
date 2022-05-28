
public class Main3 {

	public static void main(String[] args) {
		// for loop   0 1 2 3 4
		for (int i = 0; i < 5; i++) {
			System.out.println(i);			
		}
		
		// 변수 i는 for문 밖에서 사용 못함
//		System.out.println(i);
		
		int i = 0;
		while(i<5) {
			System.out.println(i);
			i++;
		}
		
		// 변수 i는 while문이 끝나도 살아있다... 
		System.out.println(i);

	}

}
