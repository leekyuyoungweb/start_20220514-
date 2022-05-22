
public class Main5 {

	public static void main(String[] args) {
		int length = 10;
		System.out.println("--- 정방향 ---");
		for (int i = 0; i < length; i++) {
			System.out.println(i);
		}
		
		System.out.println("--- 역방향 ---");
		for (int i = length-1; i >= 0; i--) {
			System.out.println(i);
		}
	}
	
}
