import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 갯수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int[] nums = new int[num];
		
		String str = "{";
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("점수를 입력하세요 : ");
			nums[i] = sc.nextInt();
			if(i == 0 )
				str += nums[i];
			else
				str += ","+nums[i];
		}
		str += "}";
		System.out.println(str);
		

	}

}
