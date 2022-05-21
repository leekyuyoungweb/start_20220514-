
public class Demo2 {

	public static void main(String[] args) {
		int result1 = 2029837380 + 903847563;
		
		// 실수를 정수형 변수에 대입하려면 큰범위에서 작은범위로 전환되기때문에
		// 사용자가 변수타입을 저장하려는 정수로 변환해야 한다.
		int result2 = (int)(5.0 / 2);
		
		int result3 = -10000000*10000000;
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
		

	}

}
