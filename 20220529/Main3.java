
public class Main3 {

	public static void main(String[] args) {
		double[] doubleArr = {3.45, 2.82, 3.85, 3.94,10.5,22.5};
		
		
		double sum = 0.0;
		for (int i = 0; i < doubleArr.length; i++) {
			sum += doubleArr[i];
		}
		System.out.println(sum);
		System.out.println(sum / doubleArr.length);

	}

}
