
public class main5 {

	public static void main(String[] args) {
		int[] scores = {10,20,70,40,50};
		int sum = 0;
		int max = scores[0];		
		for (int i : scores) {
			sum += i;
			if(i > max)
				max = i;
		}		
		
		
		
	}

}
