
public class Main7 {

	public static void main(String[] args) {
		// 그냥 구구단..		
		System.out.printf("4 x %d = %d\n",1, 1*4);
		System.out.printf("4 x %d = %d\n",2, 2*4);
		System.out.printf("4 x %d = %d\n",3, 3*4);
		System.out.printf("4 x %d = %d\n",4, 4*4);
		System.out.printf("4 x %d = %d\n",5, 5*4);
		System.out.printf("4 x %d = %d\n",6, 6*4);
		System.out.printf("4 x %d = %d\n",7, 7*4);
		System.out.printf("4 x %d = %d\n",8, 8*4);
		System.out.printf("4 x %d = %d\n",9, 9*4);
		System.out.println("------------------------------------");
		// 순환문을 이용한 구구단
		for (int i = 1; i < 10; i++) {  //1 ~ 9
			System.out.printf("4 x %d = %d\n",i, i*4);
		}

	}

}
