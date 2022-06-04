import java.util.Scanner;

/**
 * 
 * 시험점수의 합계, 평균, 최고점, 최저점을 구하는 프로그램 이때 사람수는 키보드 입력을 통해 전달받을것
 *
 */
public class Quize01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사람수를 정수로 입력하세요-->");
		int humanNum =  sc.nextInt();
		
		long sum = 0;
		int[] scores = new int[humanNum];
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("[%d] 시험점수를 입력하세요-->\n",i+1);
			sum += scores[i] = sc.nextInt();			
		}
		// 최대 최소

	}

}
