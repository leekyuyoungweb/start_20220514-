import java.util.Arrays;
import java.util.Random;

public class main04 {

	public static void main(String[] args) {
		// 문제
		// 임이의정수값(0~20) 5개를 갖는 1차원 배열을 만들고..
		// 평균과 총합 그리고 최대값과 최소값을 구해서 적절하게 출력
		
		// 5 x 5 의 2차원배열을 만들어서 0 ~20 사이로 임의의 정수로 초기화
		// 평균과 총합 그리고 최대값과 최소값을 구해보고
		// 각 row의 합과 평균 최대 최소
		// 각 col의 합과 평균 최대 최소
		// 대각선의 합과 평균 최대 최소
		
		// 숙제는...... 5 x 5 행렬을 이용해서 빙고 게임. 컴퓨터와나의 빙고 게임
		
		// 풀이
		// Random 클래스를 이용한 난수 생성 상용법 확인
		Random r = new Random();
//		for (int i = 0; i < 5; i++) {
//			System.out.println( r.nextInt(20) );			
//		}
		
		// 1차원 배열 생성  5개를 갖는
		int[] ary1th = new int[5];
		for (int i = 0; i < ary1th.length; i++) {
			 ary1th[i] =  r.nextInt(20);			
		}
		// 1차원 배열의 총합
		int sum = 0, min = ary1th[0], max = ary1th[0];
		
		for (int i = 0; i < ary1th.length; i++) {
			sum += ary1th[i];
			if(max < ary1th[i])
				max = ary1th[i];
			if(min > ary1th[i])
				min = ary1th[i];
		}
		System.out.println( Arrays.toString(ary1th)); 
		System.out.printf("총합 : %d,  평균 : %.2f 최대값 : %d, 최소값 : %d\n",sum, (double)sum/ary1th.length, max, min);
		
		// 2번 5 x 5 배열을 만들어서 임의의 숫자로 초기화
		// 합계
		sum = 0; 
		int[][] ary2th = new int[5][5];
		for (int i = 0; i < ary2th.length; i++) {
			for (int j = 0; j < ary2th[i].length; j++) {
				ary2th[i][j] = r.nextInt(20);
				sum += ary2th[i][j]; 
			}
		}
		
		// 최소 최대
		min=ary2th[0][0]; max=ary2th[0][0];
		for (int i = 0; i < ary2th.length; i++) {
			for (int j = 0; j < ary2th[i].length; j++) {
				if(max < ary2th[i][j])
					max = ary2th[i][j];
				if(min > ary2th[i][j])
					min = ary2th[i][j];
			}
		}
		
		int sum1 = 0,sum2=0;
		for (int i = 0; i < ary2th.length; i++) {
			sum1 += ary2th[i][i];			
		}
		for (int i = 0; i < ary2th.length; i++) {
			sum2 += ary2th[i][ary2th.length-1-i];			
		}
		
		
		

	}

}






