/**
 * 주중과제
 * @author User
 *
2 x 1 = 2    3 x 1 = 3    4 x 1 = 4 ...
2 x 2 = 4    3 x 2 = 6    4 x 2 = 8 ...
2 x 3 = 6    3 x 3 = 9    4 x 3 = 12 ...
2 x 4 = 8    3 x 4 = 12  4 x 4 = 16...
2 x 5 = 10  3 x 5 = 15   4 x 5 = 20 ...
...	..	..	..

 */
public class Main9 {

	public static void main(String[] args) {
		for (int t = 2; t < 10; t++) {			
			for (int i = 1; i < 10; i++) {  //1 ~ 9
				System.out.printf("%d x %d = %d\t",t, i, i*t);
			}
			System.out.println();
		}	

	}

}
