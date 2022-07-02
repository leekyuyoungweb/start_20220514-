package trycatch;

public class TryCatchDemo3 {

	public static void main(String[] args) {
		int[] array = {0,1,2};
		try {
			System.out.println("마지막 원소 : " + array[3]);
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("프로그램 종표");
		
	}

}
