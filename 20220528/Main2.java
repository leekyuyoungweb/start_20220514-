
public class Main2 {

	public static void main(String[] args) {
		// 0~99
		int randomNum = (int)(Math.random()*100);
		
		while (randomNum < 90) {
			System.out.println(randomNum);		
			randomNum = (int)(Math.random()*100);
		}

	}

}
