public class Main2 {

	public static void main(String[] args) {
		int[] points = {10,7,9,9};
		double[] weights = {68.3,82.1,52.7,58.9};
		
		int sum = 0;
		for (int i = 0; i < points.length; i++) {
			//sum +=points[i];
			sum = sum+points[i];
		}
		System.out.println(sum);		
		
		double dsum = 0.0;
		for (int i = 0; i < weights.length; i++) {
			dsum += weights[i];
		}
		System.out.println(dsum);
		System.out.printf("%.3f\n",dsum);
		System.out.println( ((int)(dsum*1000))/1000.0 );
	}

}
