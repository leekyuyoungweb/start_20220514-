import java.util.Scanner;

/**
 * 
 * 한분야의 전문가가 되려면 최소.. 일만시간의 법칙
 */

public class Main4 {

	public static void main(String[] args) {
		int[] sales = new int[5];
		// 총 판매량
		int sum = 0;
		// 가장 많이 팔린 요일
		int max = 0;
		int maxIndex = 0;
		int min = 0;
		int minIndex = 0;
		// sc는 Scanner 객체
		Scanner sc = new Scanner(System.in);
		String[] weeks = { "월", "화", "수", "목", "금" };

		for (int i = 0; i < sales.length; i++) {
			System.out.printf("%s요일의 판매량을 입력하세요:", weeks[i]);
			sales[i] = sc.nextInt();
			sum += sales[i];
			if (i == 0) {
				max = min = sales[i];
			} else {
				if (sales[i] > max) {
					max = sales[i];
					maxIndex = i;
				} else if (sales[i] < min) {
					min = sales[i];
					minIndex = i;
				}
			}
		}
		System.out.printf("총 판매량: %d잔\n", sum);
		System.out.printf("가장많이 팔린 요일은 %s 이고 수량은 %d\n", weeks[maxIndex], max);
		System.out.printf("가장적게 팔린 요일은 %s 이고 수량은 %d\n", weeks[minIndex], min);
	}

}
