
public class Demo3 {

	public static void main(String[] args) {
		System.out.println("int max :" +  Integer.MAX_VALUE);
		System.out.println("int min :" +  Integer.MIN_VALUE);
		
		int result1 = 2147483647 + 1;
		System.out.println("----------------------------");
		System.out.println("result1 : " + result1);
		result1 = -2147483648 - 1;
		System.out.println("result1 : " + result1);
	}

}
