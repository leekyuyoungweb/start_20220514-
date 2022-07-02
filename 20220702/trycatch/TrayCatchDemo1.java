package trycatch;

public class TrayCatchDemo1 {

	public static void main(String[] args) {
		int[] array = {0,1,2};
		try {
			System.out.println("첫번째 원소 : " + array[0]);
			System.out.println("마지막 원소 : " + array[3]);	
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		}
		System.out.println("프로그램 종표");
		
	}

}
