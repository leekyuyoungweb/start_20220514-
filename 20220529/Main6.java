
public class Main6 {

	public static void main(String[] args) {
		int[] arr = {88,76,92,68,55,48,82};
		int sum = 0;
		System.out.println("배열 arr의 크기는: "+ arr.length);
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.printf("i = %d,  arr[%d] = %d, sum = %d\n", i,i,arr[i], sum);
		}

	}

}
