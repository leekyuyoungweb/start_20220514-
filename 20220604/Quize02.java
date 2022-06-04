import java.util.Scanner;

/**
 * 
 * 배열에서 특정 값을 가지는 요소를 찾아라, 동일값의 요소가 여러개 있으면 가장 앞에 위치한 요소를 찾는 프 로그램과 가장 뒤에 있는 요소를 찾는 프로그램
 *
 */
public class Quize02 {

	public static void main(String[] args) {		
		int[] scores = {5,4,1,5,6,1,7,8,1,2};
		int findNum = 6;
		int findedCount = 0, index = 0;		
		for (int i = 0; i < scores.length; i++) {			
			if(findNum == scores[i]) {
				findedCount++; index = i;
				if(findedCount == 1)
					System.out.printf("[%d]\n",index);
			}										
		}
		if(findedCount > 1)
			System.out.printf("[%d]\n",index);
	}
}
