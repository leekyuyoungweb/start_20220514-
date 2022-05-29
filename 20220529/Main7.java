
public class Main7 {

	public static void main(String[] args) {
//		1. 자료형은 double 이고 요소수가 5인 배열을 생성, 모든 요소 출력
		double[] nums = new double[5];
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);			
		} 
		
		
		System.out.println("-----------------------------");
//		2. 요소개수가 5개인 int형 배열에 순서대로 5 4 3 2 1을 대입하고 전부출력
		int[] intnums = new int[5];
//		for (int i = 0,m = 5  ; i < intnums.length; i++, m--) {
//			intnums[i] = m;
//		}
		for (int i = 0; i < intnums.length; i++) {
			intnums[i] = intnums.length-i;
		}
		for (int i = 0; i < intnums.length; i++) {
			System.out.println(intnums[i]);
		}
		System.out.println("-----------------------------");
		
//		3. 요소 개수가 5인 double 형 배열을 만들고 앞에서부터 1.1,2.2,3.3,4.4,5.5를 
//		대입해서 표시하는 프로그램
		double[] darray = new double[5];
		for (int i = 0; i < darray.length; i++) {
			darray[i] = 1.1*(i+1);
		}
		System.out.println("---------------------------");
		
//		5. 배열의 요소의 개수를 입력받는다.. 그리고 각 요소별로 값을 입력받아서 표시하는데
//		각 요소의 값을 콤마로 구분하고 {}로 감싸서 출력
//		예)  배열의 값을 1 2 3 이렇게 순서대로 입력했으면 출력은
//		{1,2,3} 이렇게..
		
		

	}

}










